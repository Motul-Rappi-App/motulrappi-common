package co.com.common.repository;

import co.com.common.domain.RtPromotionalUses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;


@Repository
public interface RtPromotionalUsesRepository extends JpaRepository<RtPromotionalUses, Long> {
    List<RtPromotionalUses> findAllByRappiCourier_Id(Long id);

    @Query("SELECT SUM(rt.quantityLiters) " +
            "FROM RtPromotionalUses rt " +
            "JOIN rt.commerce c " +
            "JOIN c.location l " +
            "WHERE l.id = :locationId")
    Float sumQuantityLitersByLocationId(@Param("locationId") Long locationId);

    @Query("SELECT r.oilReference.id, r.oilReference.name, r.oilReference.litersQuantity, r.oilReference.activeForRappiCourier, r.viscosity.id, r.viscosity.description, COUNT(r) " +
            "FROM RtPromotionalUses r " +
            "JOIN r.commerce c " +
            "WHERE c.location.id = :locationId " +
            "GROUP BY r.oilReference.id, r.oilReference.name, r.oilReference.litersQuantity, r.oilReference.activeForRappiCourier, r.viscosity.id, r.viscosity.description " +
            "ORDER BY COUNT(r) DESC")
    List<Object[]> findTopOilReferencesByRedemptionCount(@Param("locationId") Long locationId);

    @Query("SELECT COUNT(rt) AS redemptionCount " +
            "FROM RtPromotionalUses rt " +
            "JOIN rt.commerce c " +
            "JOIN c.location l " +
            "WHERE c.admin.id = :adminId " +
            "AND l.id = :locationId")
    Long countRtRedemptionsByAdminAndLocation(@Param("adminId") Long adminId, @Param("locationId") Long locationId);

    @Query("SELECT c.id, c.nit, c.name, c.personStatus, c.location, c.admin, c.inscriptionDate, c.credential, COUNT(rt) AS redemptionCount " +
            "FROM RtPromotionalUses rt " +
            "JOIN rt.commerce c " +
            "JOIN c.location l " +
            "JOIN c.admin a " +
            "WHERE l.id = :locationId AND a.id = :adminId " +
            "GROUP BY c.id, c.nit, c.name, c.personStatus, c.location.id, c.admin.id, c.inscriptionDate, c.credential " +
            "ORDER BY redemptionCount DESC")
    List<Object[]> findCommercesByAdminAndLocationForRtOrderedByRedemptionCount(
            @Param("locationId") Long locationId,
            @Param("adminId") Long adminId);

    List<RtPromotionalUses> findAllByCommerce_Location_Id (Long locationId);
}
