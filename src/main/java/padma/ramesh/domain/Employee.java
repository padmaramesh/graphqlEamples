package padma.ramesh.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import padma.ramesh.request.EmployeeRequest;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private double salary;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    private List<Department> departments;


    public Employee(EmployeeRequest employeeRequest){
        this.firstName = employeeRequest.getFirstName();
        this.lastName = employeeRequest.getLastName();
        this.salary = employeeRequest.getSalary();
    }

}
