package padma.ramesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import padma.ramesh.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
