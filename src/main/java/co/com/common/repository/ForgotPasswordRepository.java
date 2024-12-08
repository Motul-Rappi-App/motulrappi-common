package co.com.common.repository;

import co.com.common.domain.Credential;
import co.com.common.domain.ForgotPassword;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPassword, Integer>{

  @Query("SELECT f FROM ForgotPassword f WHERE f.otp = ?1 AND f.credential = ?2")
  Optional<ForgotPassword> findByOtpAndCredential(String otp, Credential credential);
}
