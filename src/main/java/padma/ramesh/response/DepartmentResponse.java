package padma.ramesh.response;

import lombok.Getter;
import lombok.Setter;
import padma.ramesh.domain.Department;

@Getter
@Setter
public class DepartmentResponse {

    private long id;
    private String name;

    public DepartmentResponse(Department department){
        this.id = department.getId();
        this.name = department.getName();
    }
}
