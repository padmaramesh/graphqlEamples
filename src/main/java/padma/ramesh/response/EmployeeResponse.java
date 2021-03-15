package padma.ramesh.response;

import lombok.Getter;
import lombok.Setter;
import padma.ramesh.domain.Department;
import padma.ramesh.domain.Employee;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class EmployeeResponse {

    private long id;
    private String firstName;
    private String lastName;
    private double salary;
    private List<DepartmentResponse> departments;
    private Employee employee;

    public EmployeeResponse(Employee employee){
        this.employee = employee;
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.salary = employee.getSalary();

//        if(employee.getDepartments() !=null ){
//            departments = new ArrayList<>();
//            for(Department department: employee.getDepartments()){
//                departments.add(new DepartmentResponse(department));
//            }
//        }
    }

}
