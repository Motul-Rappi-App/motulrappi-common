package co.com.common.mappers;

import co.com.common.domain.SoatPromotionalUses;
import co.com.common.dto.OilReferenceSoatPromotion.OilReferenceSoatPromotionResponseDto;
import co.com.common.dto.SoatPromotionalUses.SoatPromotionalUsesRequestDto;
import co.com.common.dto.SoatPromotionalUses.SoatPromotionalUsesResponseDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;
import java.util.List;


public class SoatPromotionalUsesMapper {
    public static SoatPromotionalUsesResponseDto toSoatPromotionalUsesResponseDto(SoatPromotionalUses soatPromotionalUses){
        return SoatPromotionalUsesResponseDto.builder()
                .id(soatPromotionalUses.getId())
                .inscriptionDate(soatPromotionalUses.getInscriptionDate())
                .quantityLiters(soatPromotionalUses.getQuantityLiters())
                .identification(soatPromotionalUses.getIdentification())
                .oilReference(OilReferenceSoatPromotionMapper.toOilReferenceSoatPromotionResponseDtoList(soatPromotionalUses.getOilReferences()))
                .commerce(CommerceMapper.toCommerceResponseDto(soatPromotionalUses.getCommerce()))
                .build();
    }

    public static SoatPromotionalUses toSoatPromotionalUses(SoatPromotionalUsesRequestDto soatPromotionalUsesRequestDto){
        return SoatPromotionalUses.builder()
                .identification(soatPromotionalUsesRequestDto.getIdentification())
                .quantityLiters(soatPromotionalUsesRequestDto.getQuantityLiters())
                .build();
    }

    public static Slice<SoatPromotionalUsesResponseDto> toSoatPromotionalUsesResponseDtoSlice(Slice<SoatPromotionalUses> soatPromotionalUses){
        if(soatPromotionalUses == null ) return new SliceImpl<>(Collections.emptyList());
        return soatPromotionalUses.map(SoatPromotionalUsesMapper::toSoatPromotionalUsesResponseDto);
    }
}