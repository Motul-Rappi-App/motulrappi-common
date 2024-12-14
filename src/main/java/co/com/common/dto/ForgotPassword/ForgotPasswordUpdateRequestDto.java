package co.com.common.dto.ForgotPassword;

import co.com.common.utils.validations.AuthenticationValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class ForgotPasswordUpdateRequestDto {
    @NotBlank(message = AuthenticationValidate.PASSWORD_NOT_EMPTY)
    @Pattern(regexp = AuthenticationValidate.PASSWORD_REGEX, message = AuthenticationValidate.PASSWORD_NOT_VALID)
    private String password;

    @NotBlank(message = AuthenticationValidate.PASSWORD_NOT_EMPTY)
    @Pattern(regexp = AuthenticationValidate.PASSWORD_REGEX, message = AuthenticationValidate.PASSWORD_NOT_VALID)
    private String confirmPassword;
}
