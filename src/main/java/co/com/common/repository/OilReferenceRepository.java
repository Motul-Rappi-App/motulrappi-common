package co.com.common.repository;

import co.com.common.domain.OilReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OilReferenceRepository extends JpaRepository<OilReference, Long> {
    boolean existsByName(String name);
    OilReference findByName(String name);
}
