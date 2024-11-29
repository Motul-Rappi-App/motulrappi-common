package co.com.common.dto.OilReference;

import co.com.common.utils.validations.OilReferenceValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class OilReferenceUpdateRequestDto {
    @NotNull(message = OilReferenceValidate.ID_NOT_NULL)
    private Long id;

    @NotBlank(message = OilReferenceValidate.NAME_NOT_EMPTY)
    @Pattern(regexp = OilReferenceValidate.NAME_REGEX, message = OilReferenceValidate.NAME_NOT_VALID)
    private String name;

    @NotNull(message = OilReferenceValidate.VISCOSITIES_NOT_EMPTY)
    private Long[] viscosities;

    private Float litersQuantity;

    @NotNull(message = OilReferenceValidate.ACTIVE_FOR_RAPPI_COURIER_NOT_EMPTY)
    private Boolean activeForRappiCourier;
}