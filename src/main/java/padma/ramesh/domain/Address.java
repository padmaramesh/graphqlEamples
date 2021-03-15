package padma.ramesh.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="city")
    private String city;

    @Column(name = "state")
    private String state;

    @OneToOne(mappedBy = "address")
    private Employee employee;


}
