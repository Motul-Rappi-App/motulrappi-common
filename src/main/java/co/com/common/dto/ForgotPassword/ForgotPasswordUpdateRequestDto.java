package co.com.common.dto.ForgotPassword;

import co.com.common.utils.validations.CredentialValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class ForgotPasswordUpdateRequestDto {

  @NotBlank(message = CredentialValidate.PASSWORD_NOT_EMPTY)
  @Pattern(regexp = CredentialValidate.PASSWORD_REGEX, message = CredentialValidate.PASSWORD_NOT_VALID)
  private String password;

  @NotBlank(message = CredentialValidate.PASSWORD_NOT_EMPTY)
  @Pattern(regexp = CredentialValidate.PASSWORD_REGEX, message = CredentialValidate.PASSWORD_NOT_VALID)
  private String confirmPassword;

}
