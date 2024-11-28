package co.com.common.repository;

import co.com.common.domain.RtPromotionalUses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RtPromotionalUsesRepository extends JpaRepository<RtPromotionalUses, Long> {
    List<RtPromotionalUses> findAllByRappiCourier_Id(Long id);
}
