package co.com.common.dto.OilReferenceSoatPromotion;

import co.com.common.domain.OilReference;
import co.com.common.domain.Viscosity;
import co.com.common.utils.validations.OilReferenceSoatPromotionValidate;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class OilReferenceSoatPromotionCreateDto {
    @NotNull(message = OilReferenceSoatPromotionValidate.OIL_REFERENCE_NOT_NULL)
    private OilReference oilReference;

    @NotNull(message = OilReferenceSoatPromotionValidate.VISCOSITY_NOT_NULL)
    private Viscosity viscosity;

    @NotNull(message = OilReferenceSoatPromotionValidate.LITERS_QUANITY_UNION_NOT_NULL)
    private Float litersQuantityUnion;
}
