package co.com.common.dto.Viscosity;

import co.com.common.utils.validations.ViscosityValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class ViscosityUpdateRequestDto {
    @NotNull(message = ViscosityValidate.ID_NOT_NULL)
    private Long id;

    @NotBlank(message = ViscosityValidate.DESCRIPTION_NOT_EMPTY)
    @Pattern(regexp = ViscosityValidate.DESCRIPTION_REGEX, message = ViscosityValidate.DESCRIPTION_NOT_VALID)
    private String description;
}