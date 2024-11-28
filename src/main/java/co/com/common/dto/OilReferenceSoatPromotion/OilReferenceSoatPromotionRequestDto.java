package co.com.common.dto.OilReferenceSoatPromotion;

import co.com.common.utils.validations.OilReferenceSoatPromotionValidate;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class OilReferenceSoatPromotionRequestDto {
    @NotNull(message = OilReferenceSoatPromotionValidate.OIL_REFERENCE_NOT_NULL)
    private Long oilReferenceId;

    @NotNull(message = OilReferenceSoatPromotionValidate.VISCOSITY_NOT_NULL)
    private Long viscosityId;

    private Float litersQuantityUnion;
}
