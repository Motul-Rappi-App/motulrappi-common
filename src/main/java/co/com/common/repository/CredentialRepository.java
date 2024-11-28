package co.com.common.repository;

import co.com.common.domain.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CredentialRepository extends JpaRepository<Credential, Long> {
    Optional<Credential> findOneByEmail(String email);
    Credential findByEmail(String email);
    boolean existsByEmail(String email);
}
