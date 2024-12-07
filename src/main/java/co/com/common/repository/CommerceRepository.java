package co.com.common.repository;

import co.com.common.domain.Commerce;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommerceRepository extends JpaRepository<Commerce, Long> {
    Slice<Commerce> findAllByAdmin_Id(Long id, Pageable pageable);
    boolean existsByName(String name);
    boolean existsByAdmin_Id(Long id);
    boolean existsByNit(String nit);
    Commerce findByCredential_Id(Long id);
}
