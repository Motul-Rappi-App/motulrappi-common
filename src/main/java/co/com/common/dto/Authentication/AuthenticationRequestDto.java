package co.com.common.dto.Authentication;

import co.com.common.utils.validations.AuthenticationValidate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class AuthenticationRequestDto {
    @NotBlank(message = AuthenticationValidate.EMAIL_NOT_EMPTY)
    @Email(message = AuthenticationValidate.EMAIL_NOT_VALID)
    private String email;

    @NotBlank(message = AuthenticationValidate.PASSWORD_NOT_EMPTY)
    @Pattern(regexp = AuthenticationValidate.PASSWORD_REGEX, message = AuthenticationValidate.PASSWORD_NOT_VALID)
    private String password;
}