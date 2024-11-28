package co.com.common.dto.RtPromotionalUses;

import co.com.common.utils.validations.RtPromotionalUsesValidate;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class RtPromotionalUsesRequestDto {

    @NotNull(message = RtPromotionalUsesValidate.RAPPI_COURIER_NOT_NULL)
    private Long rappiCourierId;

    @NotNull(message = RtPromotionalUsesValidate.OIL_REFERENCE_NOT_NULL)
    private Long oilReferenceId;

    @NotNull(message = RtPromotionalUsesValidate.QUANTITY_LITERS_NOT_NULL)
    private Integer quantityLiters;

    private Long viscosityId;
}