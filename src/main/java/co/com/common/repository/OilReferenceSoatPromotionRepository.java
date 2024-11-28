package co.com.common.repository;

import co.com.common.domain.OilReferenceSoatPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OilReferenceSoatPromotionRepository extends JpaRepository<OilReferenceSoatPromotion, Long> {
}