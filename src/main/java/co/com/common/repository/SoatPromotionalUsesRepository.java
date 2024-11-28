package co.com.common.repository;

import co.com.common.domain.SoatPromotionalUses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SoatPromotionalUsesRepository extends JpaRepository<SoatPromotionalUses, Long> {
    boolean existsByIdentification(String identification);
}