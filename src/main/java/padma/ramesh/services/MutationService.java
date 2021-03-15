package padma.ramesh.services;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import padma.ramesh.request.EmployeeRequest;
import padma.ramesh.response.EmployeeResponse;

@Service
public class MutationService implements GraphQLMutationResolver {

    @Autowired
    EmployeeService employeeService;

    public EmployeeResponse createEmployee(EmployeeRequest employeeRequest){
        return new EmployeeResponse(employeeService.createEmployee(employeeRequest));
    }

}
