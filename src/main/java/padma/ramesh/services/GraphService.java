package padma.ramesh.services;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import padma.ramesh.response.EmployeeResponse;

@Component
public class GraphService implements GraphQLQueryResolver {

    @Autowired
    EmployeeService employeeService;

    public String firstQuery(){
        return "My First Query";
    }

    public String fullName(String firstName, String lastName){
        return firstName+ " " + lastName;
    }

    public String getFullNameByObject(SimpleRequest simpleRequest){
        return simpleRequest.getFirstName() + " " + simpleRequest.getLastName();
    }

    public EmployeeResponse employee(long id){
        return new EmployeeResponse(employeeService.getEmployeeById(id));
    }

}
