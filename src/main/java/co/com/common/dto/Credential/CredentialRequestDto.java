package co.com.common.dto.Credential;

import co.com.common.dto.Admin.AdminResponseDto;
import co.com.common.dto.Commerce.CommerceResponseDto;
import co.com.common.utils.enums.UserRole;
import co.com.common.utils.validations.CredentialValidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class CredentialRequestDto {
    @NotBlank(message = CredentialValidate.EMAIL_NOT_EMPTY)
    @Email(message = CredentialValidate.EMAIL_NOT_VALID)
    private String email;

    @NotBlank(message = CredentialValidate.PASSWORD_NOT_EMPTY)
    @Pattern(regexp = CredentialValidate.PASSWORD_REGEX, message = CredentialValidate.PASSWORD_NOT_VALID)
    private String password;

    @NotNull(message = CredentialValidate.ROL_USUARIO_NOT_NULL)
    private UserRole userRole;

    private AdminResponseDto admin;
    private CommerceResponseDto commerce;
}
