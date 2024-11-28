package co.com.common.dto.Location;

import co.com.common.utils.validations.LocationValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class LocationUpdateRequestDto {
    @NotNull(message = LocationValidate.ID_NOT_NULL)
    private Long id;

    @NotBlank(message = LocationValidate.NAME_NOT_EMPTY)
    @Pattern(regexp = LocationValidate.NAME_REGEX, message = LocationValidate.NAME_NOT_VALID)
    private String name;
}
