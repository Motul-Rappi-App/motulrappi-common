package co.com.common.repository;

import co.com.common.domain.OilReferenceSoatPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OilReferenceSoatPromotionRepository extends JpaRepository<OilReferenceSoatPromotion, Long> {
    List<OilReferenceSoatPromotion> findAllBySoatPromotionUses_Commerce_Location_Id (Long locationId);
}