package co.com.common.repository;

import co.com.common.domain.IdentificationNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IdentificationNumberRepository extends JpaRepository<IdentificationNumber, Long> {
    boolean existsByIdentification(String identification);
}