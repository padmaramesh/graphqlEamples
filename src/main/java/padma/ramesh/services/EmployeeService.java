package padma.ramesh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import padma.ramesh.domain.Address;
import padma.ramesh.domain.Department;
import padma.ramesh.domain.Employee;
import padma.ramesh.repository.AddressRepository;
import padma.ramesh.repository.DepartmentRepository;
import padma.ramesh.repository.EmployeeRepository;
import padma.ramesh.request.DepartmentRequest;
import padma.ramesh.request.EmployeeRequest;
import padma.ramesh.response.EmployeeResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public Employee getEmployeeById(long id){
        return employeeRepository.findById(id).get();
    }

    public Employee createEmployee(EmployeeRequest employeeRequest){

        Employee employee = new Employee(employeeRequest);

        Address address = new Address();
        address.setState(employeeRequest.getAddressRequest().getState());
        address.setCity(employeeRequest.getAddressRequest().getCity());

        address = addressRepository.save(address);

        employee.setAddress(address);

        employee = employeeRepository.save(employee);

        List<Department> departments = new ArrayList<>();

        if(employeeRequest.getDepartmentRequests() != null){
            for(DepartmentRequest departmentRequest : employeeRequest.getDepartmentRequests()){
                Department department = new Department();
                department.setName("HR");
                department.setEmployee(employee);
                departments.add(department);
            }
        }

        departmentRepository.saveAll(departments);

        return employee;

    }
}
