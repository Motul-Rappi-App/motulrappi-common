package co.com.common.repository;

import co.com.common.domain.RappiCourier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RappiCourierRepository extends JpaRepository<RappiCourier, Long> {
    boolean existsByIdentification(String identification);
    RappiCourier findByIdentification(String identification);
    boolean existsByRappiToken(String rappiToken);
    boolean existsByMotorcycleId(Long motorcycleId);
    boolean existsByCellNumber(String cellNumber);

    @Query("SELECT rc.commerce.id, rc.commerce.name, rc.commerce.nit, rc.commerce.personStatus, rc.commerce, COUNT(rc) " +
            "FROM RappiCourier rc " +
            "WHERE rc.location.id = :locationId " +
            "GROUP BY rc.commerce.id, rc.commerce.name, rc.commerce.nit, rc.commerce.personStatus, rc.commerce")
    List<Object[]> countRappiCouriersByCommerceAndLocation(@Param("locationId") Long locationId);
}