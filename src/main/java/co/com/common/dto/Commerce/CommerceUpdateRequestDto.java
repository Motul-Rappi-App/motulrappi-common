package co.com.common.dto.Commerce;

import co.com.common.utils.validations.CommerceValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class CommerceUpdateRequestDto {
    @NotNull(message = CommerceValidate.ID_NOT_NULL)
    private Long id;

    @NotBlank(message = CommerceValidate.NIT_NOT_EMPTY)
    @Size(min = 1, max = 20, message = CommerceValidate.NIT_SIZE)
    @Pattern(regexp = CommerceValidate.NIT_REGEX, message = CommerceValidate.NIT_NOT_VALID)
    private String nit;

    @NotBlank(message = CommerceValidate.PASSWORD_NOT_EMPTY)
    @Pattern(regexp = CommerceValidate.PASSWORD_REGEX, message = CommerceValidate.PASSWORD_NOT_VALID)
    private String password;

    @NotBlank(message = CommerceValidate.NAME_NOT_EMPTY)
    @Pattern(regexp = CommerceValidate.NAME_REGEX, message = CommerceValidate.NAME_NOT_VALID)
    private String name;

    @NotNull(message = CommerceValidate.PERSON_STATUS_NOT_NULL)
    private boolean personStatus;

    @NotNull(message = CommerceValidate.LOCATION_NOT_NULL)
    private Long locationId;
}