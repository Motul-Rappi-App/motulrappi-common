package co.com.common.repository;

import co.com.common.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{
    boolean existsByName(String name);

    @Query("SELECT DISTINCT c.location FROM Commerce c WHERE c.admin.id = :adminId")
    List<Location> findDistinctLocationsInCommercesByAdminId(@Param("adminId") Long adminId);
}
