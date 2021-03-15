package padma.ramesh.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Service;
import padma.ramesh.domain.Department;
import padma.ramesh.response.DepartmentResponse;
import padma.ramesh.response.EmployeeResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeResponseResolver implements GraphQLResolver<EmployeeResponse > {

    public List<DepartmentResponse> getDepartments(EmployeeResponse employeeResponse){

        List<DepartmentResponse> departments = new ArrayList<>();

        if(employeeResponse.getEmployee().getDepartments() !=null ){
            departments = new ArrayList<>();
            for(Department department: employeeResponse.getEmployee().getDepartments()){
                departments.add(new DepartmentResponse(department));
            }
        }

        return departments;
    }

}
