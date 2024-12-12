package co.com.common.repository;

import co.com.common.domain.SoatPromotionalUses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SoatPromotionalUsesRepository extends JpaRepository<SoatPromotionalUses, Long> {
    boolean existsByIdentification(String identification);

    @Query("SELECT SUM(spu.quantityLiters) " +
            "FROM SoatPromotionalUses spu " +
            "JOIN spu.commerce c " +
            "JOIN c.location l " +
            "WHERE l.id = :locationId")
    Float sumQuantityLitersByLocationId(@Param("locationId") Long locationId);

    @Query("SELECT or1.id, or1.name, or1.litersQuantity, or1.activeForRappiCourier, v1.id, v1.description, COUNT(orsp) AS redemptionCount " +
            "FROM OilReferenceSoatPromotion orsp " +
            "JOIN orsp.oilReference or1 " +
            "JOIN orsp.viscosity v1 " +
            "JOIN orsp.soatPromotionUses spu " +
            "JOIN spu.commerce c1 " +
            "JOIN c1.location l1 " +
            "WHERE l1.id = :locationId " +
            "GROUP BY or1.id, or1.name, or1.litersQuantity, or1.activeForRappiCourier, v1.id, v1.description " +
            "ORDER BY redemptionCount DESC")
    List<Object[]> findTopOilReferencesByRedemptionCount(@Param("locationId") Long locationId);

    @Query("SELECT COUNT(spu) AS redemptionCount " +
            "FROM SoatPromotionalUses spu " +
            "JOIN spu.commerce c " +
            "JOIN c.location l " +
            "WHERE c.admin.id = :adminId " +
            "AND l.id = :locationId")
    Long countSoatRedemptionsByAdminAndLocation(@Param("adminId") Long adminId, @Param("locationId") Long locationId);

    @Query("SELECT c.id, c.nit, c.name, c.personStatus, c.location, c.admin, c.inscriptionDate, COUNT(spu) AS redemptionCount " +
            "FROM SoatPromotionalUses spu " +
            "JOIN spu.commerce c " +
            "JOIN c.location l " +
            "JOIN c.admin a " +
            "WHERE l.id = :locationId AND a.id = :adminId " +
            "GROUP BY c.id, c.nit, c.name, c.personStatus, c.location.id, c.admin.id, c.inscriptionDate " +
            "ORDER BY redemptionCount DESC")
    List<Object[]> findCommercesByAdminAndLocationForSoatUsesOrderedByRedemptionCount(
            @Param("locationId") Long locationId,
            @Param("adminId") Long adminId);

}