package co.com.common.dto.ForgotPassword;

import co.com.common.utils.validations.CredentialValidate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class ForgotPasswordRequestDto {
    @NotBlank(message = CredentialValidate.EMAIL_NOT_EMPTY)
    @Email(message = CredentialValidate.EMAIL_NOT_VALID)
    private String email;
}
