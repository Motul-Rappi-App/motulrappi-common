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
public class OilReferenceRequestDto {

    @NotBlank(message = OilReferenceValidate.NAME_NOT_EMPTY)
    private String name;

    @NotNull(message = OilReferenceValidate.VISCOSITIES_NOT_EMPTY)
    private Long[] viscosities;

    @NotNull(message = OilReferenceValidate.LITERS_QUANTITY_NOT_EMPTY)
    private Float litersQuantity;

    @NotNull(message = OilReferenceValidate.ACTIVE_FOR_RAPPI_COURIER_NOT_EMPTY)
    private Boolean activeForRappiCourier;

    @NotNull(message = OilReferenceValidate.ADMIN_NOT_EMPTY)
    private Long adminId;
}