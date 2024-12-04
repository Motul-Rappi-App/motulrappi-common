package co.com.common.dto.Motorcycle;

import co.com.common.utils.enums.MotorStroke;
import co.com.common.utils.validations.MotorcycleValidate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class MotorcycleUpdateRequestDto {
    @NotNull(message = MotorcycleValidate.ID_NOT_NULL)
    private Long id;

    @NotNull(message = MotorcycleValidate.BRAND_NOT_EMPTY)
    @Pattern(regexp = MotorcycleValidate.BRAND_REGEX, message = MotorcycleValidate.BRAND_NOT_VALID)
    private String brand;

    @NotNull(message = MotorcycleValidate.CYLINDER_CAPACITY_NOT_EMPTY)
    @Pattern(regexp = MotorcycleValidate.CYLINDER_CAPACITY_REGEX, message = MotorcycleValidate.CYLINDER_CAPACITY_NOT_VALID)
    private String cylinderCapacity;

    @NotNull(message = MotorcycleValidate.YEAR_NOT_EMPTY)
    @Pattern(regexp = MotorcycleValidate.YEAR_REGEX, message = MotorcycleValidate.YEAR_NOT_VALID)
    private String year;

    @NotNull(message = MotorcycleValidate.MOTOR_STROKE_NOT_NULL)
    private MotorStroke motorStroke;

    @NotNull(message = MotorcycleValidate.REFERENCE_NOT_EMPTY)
    private String reference;
}