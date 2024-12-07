package co.com.common.dto.Authentication;

import co.com.common.utils.validations.AuthenticationValidate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class PasswordRecoveryRequestOtpDto {
    @NotBlank(message = AuthenticationValidate.EMAIL_NOT_EMPTY)
    @Email(message = AuthenticationValidate.EMAIL_NOT_VALID)
    private String email;
}
