package co.com.common.dto.OilReferenceSoatPromotion;

import co.com.common.utils.validations.OilReferenceSoatPromotionValidate;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@AllArgsConstructor
@Builder
@Data
public class OilReferenceSoatPromotionRequestDto {
    @NotNull(message = OilReferenceSoatPromotionValidate.OIL_REFERENCE_ID_NOT_NULL)
    private Long oilReferenceId;

    @NotNull(message = OilReferenceSoatPromotionValidate.VISCOSITY_ID_NOT_NULL)
    private Long viscosityId;

    @NotNull(message = OilReferenceSoatPromotionValidate.LITERS_QUANITY_UNION_NOT_NULL)
    private Float litersQuantityUnion;
}
