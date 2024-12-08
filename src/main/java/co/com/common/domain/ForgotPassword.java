package co.com.common.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class ForgotPassword {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer fpid;

  @Column(nullable = false)
  private Integer otp;

  @Column(nullable = false)
  private Date expirationTime;

  @ManyToOne
  @JoinColumn(name = "credential_id", nullable = false)
  private Credential credential;

}
