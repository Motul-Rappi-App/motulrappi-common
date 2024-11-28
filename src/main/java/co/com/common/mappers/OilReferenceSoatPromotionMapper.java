package co.com.common.mappers;

import co.com.common.domain.OilReference;
import co.com.common.domain.OilReferenceSoatPromotion;
import co.com.common.domain.Viscosity;
import co.com.common.dto.OilReferenceSoatPromotion.OilReferenceSoatPromotionRequestDto;
import co.com.common.dto.OilReferenceSoatPromotion.OilReferenceSoatPromotionResponseDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class OilReferenceSoatPromotionMapper {
    public static OilReferenceSoatPromotionResponseDto toOilReferenceSoatPromotionResponseDto(OilReferenceSoatPromotion oilReferenceSoatPromotion) {
        return OilReferenceSoatPromotionResponseDto.builder()
                .id(oilReferenceSoatPromotion.getId())
                .oilReference(OilReferenceMapper.toOilReferenceResponseDto(oilReferenceSoatPromotion.getOilReference()))
                .viscosity(ViscosityMapper.toViscosityResponseDto(oilReferenceSoatPromotion.getViscosity()))
                .soatPromotion(SoatPromotionalUsesMapper.toSoatPromotionalUsesResponseDto(oilReferenceSoatPromotion.getSoatPromotion()))
                .litersQuantityUnion(oilReferenceSoatPromotion.getLitersQuantityUnion())
                .build();
    }

    public static OilReferenceSoatPromotion toOilReferenceSoatPromotion(OilReference oilReference, Viscosity viscosity, Float litersQuantity){
        return OilReferenceSoatPromotion.builder()
                .oilReference(oilReference)
                .viscosity(viscosity)
                .litersQuantityUnion(litersQuantity)
                .build();
    }

    public static Slice<OilReferenceSoatPromotionResponseDto> toOilReferenceSoatPromotionResponseDtoSlice(List<OilReferenceSoatPromotion> oilReferencesSoatPromotions) {
        if (oilReferencesSoatPromotions == null || oilReferencesSoatPromotions.isEmpty())  return new SliceImpl<>(Collections.emptyList());
        List<OilReferenceSoatPromotionResponseDto> dtoList = oilReferencesSoatPromotions.stream()
                .map(OilReferenceSoatPromotionMapper::toOilReferenceSoatPromotionResponseDto)
                .collect(Collectors.toList());
        return new SliceImpl<>(dtoList);
    }
}