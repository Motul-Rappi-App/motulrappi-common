package co.com.common.repository;

import co.com.common.domain.Credential;
import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CredentialRepository extends JpaRepository<Credential, Long> {
    Optional<Credential> findOneByEmail(String email);
    Credential findByEmail(String email);
    boolean existsByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Credential c SET c.password = ?2 WHERE c.email = ?1")
    void updatePassword(String email, String password);
}