package padma.ramesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import padma.ramesh.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
