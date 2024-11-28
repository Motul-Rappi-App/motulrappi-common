package co.com.common.repository;

import co.com.common.domain.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
}
