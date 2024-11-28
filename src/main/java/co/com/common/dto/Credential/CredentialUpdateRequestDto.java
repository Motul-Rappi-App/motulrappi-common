package co.com.common.dto.Credential;

import co.com.common.utils.enums.UserRole;
import co.com.common.utils.validations.CredentialValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class CredentialUpdateRequestDto {
    @NotNull(message = CredentialValidate.ID_NOT_NULL)
    private Long id;

    @NotBlank(message = CredentialValidate.PASSWORD_NOT_EMPTY)
    @Pattern(regexp = CredentialValidate.PASSWORD_REGEX, message = CredentialValidate.PASSWORD_NOT_VALID)
    private String password;

    @NotNull(message = CredentialValidate.ROL_USUARIO_NOT_NULL)
    private UserRole userRole;
}
