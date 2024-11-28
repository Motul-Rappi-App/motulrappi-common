package co.com.common.dto.Admin;

import co.com.common.utils.validations.AdminValidate;

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
public class AdminRequestDto {
    @NotBlank(message = AdminValidate.NAME_NOT_EMPTY)
    @Pattern(regexp = AdminValidate.NAME_REGEX, message = AdminValidate.NAME_NOT_VALID)
    private String name;

    @NotBlank(message = AdminValidate.EMAIL_NOT_EMPTY)
    @Email(message = AdminValidate.EMAIL_NOT_VALID)
    private String email;

    @NotBlank(message = AdminValidate.PASSWORD_NOT_EMPTY)
    @Pattern(regexp = AdminValidate.PASSWORD_REGEX, message = AdminValidate.PASSWORD_NOT_VALID)
    private String password;
}
