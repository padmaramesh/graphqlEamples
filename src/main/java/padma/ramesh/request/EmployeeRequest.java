package padma.ramesh.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeRequest {

    private long id;

    private String firstName;

    private String lastName;

    private double salary;

    private AddressRequest addressRequest;

    List<DepartmentRequest> departmentRequests;

}
