package co.com.common.dto.OilReferenceSoatPromotion;

import co.com.common.dto.OilReference.OilReferenceResponseDto;
import co.com.common.dto.SoatPromotionalUses.SoatPromotionalUsesResponseDto;

import co.com.common.dto.Viscosity.ViscosityResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class OilReferenceSoatPromotionResponseDto {
    private Long id;
    private OilReferenceResponseDto oilReference;
    private ViscosityResponseDto viscosity;
    private SoatPromotionalUsesResponseDto soatPromotion;
    private Float litersQuantityUnion;
}