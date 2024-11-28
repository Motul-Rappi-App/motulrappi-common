package co.com.common.repository;

import co.com.common.domain.RappiCourier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RappiCourierRepository extends JpaRepository<RappiCourier, Long> {
    boolean existsByIdentification(String identification);
    RappiCourier findByIdentification(String identification);
    boolean existsByRappiToken(String rappiToken);
    boolean existsByMotorcycleId(Long motorcycleId);
}