package co.com.common.dto.Admin;

import co.com.common.utils.validations.AdminValidate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class AdminUpdateRequestDto {
    @NotNull(message = AdminValidate.ID_NOT_NULL)
    private Long id;

    @NotNull(message = AdminValidate.NAME_NOT_EMPTY)
    @Pattern(regexp = AdminValidate.NAME_REGEX, message = AdminValidate.NAME_NOT_VALID)
    private String name;

    @NotNull(message = AdminValidate.PASSWORD_NOT_EMPTY)
    @Pattern(regexp = AdminValidate.PASSWORD_REGEX, message = AdminValidate.PASSWORD_NOT_VALID)
    private String password;
}