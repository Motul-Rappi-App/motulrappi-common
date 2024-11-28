package co.com.common.repository;

import co.com.common.domain.Viscosity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ViscosityRepository extends JpaRepository<Viscosity, Long> {
    boolean existsByDescription(String description);
}
