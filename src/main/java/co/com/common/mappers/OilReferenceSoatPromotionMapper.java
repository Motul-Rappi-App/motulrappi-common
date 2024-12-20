package co.com.common.mappers;

import co.com.common.domain.OilReferenceSoatPromotion;
import co.com.common.domain.SoatPromotionalUses;
import co.com.common.dto.OilReferenceSoatPromotion.OilReferenceSoatPromotionCreateDto;
import co.com.common.dto.OilReferenceSoatPromotion.OilReferenceSoatPromotionResponseDto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class OilReferenceSoatPromotionMapper {
    public static OilReferenceSoatPromotion toOilReferenceSoatPromotion(OilReferenceSoatPromotionCreateDto oilReferenceSoatPromotionCreateDto, SoatPromotionalUses soatPromotionalUses){
        return OilReferenceSoatPromotion.builder()
                .oilReference(oilReferenceSoatPromotionCreateDto.getOilReference())
                .viscosity(oilReferenceSoatPromotionCreateDto.getViscosity())
                .litersQuantityUnion(oilReferenceSoatPromotionCreateDto.getLitersQuantityUnion())
                .soatPromotionUses(soatPromotionalUses)
                .build();
    }

    public static OilReferenceSoatPromotionResponseDto toOilReferenceSoatPromotionResponseDto(OilReferenceSoatPromotion oilReferenceSoatPromotion){
        return OilReferenceSoatPromotionResponseDto.builder()
                .id(oilReferenceSoatPromotion.getId())
                .oilReference(OilReferenceMapper.toOilReferenceResponseDto(oilReferenceSoatPromotion.getOilReference()))
                .viscosity(ViscosityMapper.toViscosityResponseDto(oilReferenceSoatPromotion.getViscosity()))
                .litersQuantityUnion(oilReferenceSoatPromotion.getLitersQuantityUnion())
                .build();
    }

    public static OilReferenceSoatPromotionResponseDto toOilReferenceWithSoatPromotionResponseDto(OilReferenceSoatPromotion oilReferenceSoatPromotion){
        return OilReferenceSoatPromotionResponseDto.builder()
                .id(oilReferenceSoatPromotion.getId())
                .oilReference(OilReferenceMapper.toOilReferenceResponseDto(oilReferenceSoatPromotion.getOilReference()))
                .viscosity(ViscosityMapper.toViscosityResponseDto(oilReferenceSoatPromotion.getViscosity()))
                .litersQuantityUnion(oilReferenceSoatPromotion.getLitersQuantityUnion())
                .soatPromotion(SoatPromotionalUsesMapper.toSoatPromotionalUsesResponseDto(oilReferenceSoatPromotion.getSoatPromotionUses()))
                .build();
    }

    public static List<OilReferenceSoatPromotionResponseDto> toOilReferenceSoatPromotionResponseDtoList(List<OilReferenceSoatPromotion> oilReferenceSoatPromotions){
        if(oilReferenceSoatPromotions == null  || oilReferenceSoatPromotions.isEmpty()) return Collections.emptyList();
        return oilReferenceSoatPromotions.stream().map(OilReferenceSoatPromotionMapper::toOilReferenceSoatPromotionResponseDto).collect(Collectors.toList());
    }

    public static List<OilReferenceSoatPromotionResponseDto> oilReferenceSoatPromotionResponseDtos(List<OilReferenceSoatPromotion> oilReferenceSoatPromotions){
        if(oilReferenceSoatPromotions == null) return Collections.emptyList();
        return oilReferenceSoatPromotions.stream().map(OilReferenceSoatPromotionMapper::toOilReferenceWithSoatPromotionResponseDto).collect(Collectors.toList());
    }
}