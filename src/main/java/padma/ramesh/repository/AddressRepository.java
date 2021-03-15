package padma.ramesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import padma.ramesh.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
