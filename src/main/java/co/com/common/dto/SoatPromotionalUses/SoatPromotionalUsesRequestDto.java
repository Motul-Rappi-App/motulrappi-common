package co.com.common.dto.SoatPromotionalUses;

import co.com.common.dto.OilReferenceSoatPromotion.OilReferenceSoatPromotionRequestDto;
import co.com.common.utils.validations.SoatPromotionalUsesValidate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@AllArgsConstructor
@Builder
@Data
public class SoatPromotionalUsesRequestDto {
    @NotNull(message = SoatPromotionalUsesValidate.COMMERCE_NOT_NULL)
    private Long commerceId;

    @NotBlank(message = SoatPromotionalUsesValidate.IDENTIFICATION_NOT_EMPTY)
    private String identification;

    @NotNull(message = SoatPromotionalUsesValidate.QUANTITY_LITERS_NOT_NULL)
    private Float quantityLiters;

    @NotNull(message = SoatPromotionalUsesValidate.OIL_REFERENCES_NOT_NULL)
    private List<OilReferenceSoatPromotionRequestDto> oilReference;
}