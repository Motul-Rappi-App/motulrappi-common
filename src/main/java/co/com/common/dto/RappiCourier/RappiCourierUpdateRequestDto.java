package co.com.common.dto.RappiCourier;

import co.com.common.utils.validations.RappiCourierValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class RappiCourierUpdateRequestDto {
    @NotNull(message = RappiCourierValidate.ID_NOT_NULL)
    private Long id;

    @NotBlank(message = RappiCourierValidate.FULL_NAME_NOT_EMPTY)
    @Pattern(regexp = RappiCourierValidate.FULL_NAME_REGEX, message = RappiCourierValidate.FULL_NAME_NOT_VALID)
    private String fullName;

    @NotBlank(message = RappiCourierValidate.CELL_NUMBER_NOT_EMPTY)
    @Pattern(regexp = RappiCourierValidate.CELL_NUMBER_REGEX, message = RappiCourierValidate.CELL_NUMBER_NOT_VALID)
    private String cellNumber;

    @NotNull(message = RappiCourierValidate.LOCATION_NOT_NULL)
    private Long locationId;

    @NotNull(message = RappiCourierValidate.COMMERCE_NOT_NULL)
    private Long commerceId;

    @NotNull(message = RappiCourierValidate.MOTORCYCLE_NOT_NULL)
    private Long motorcycleId;
}