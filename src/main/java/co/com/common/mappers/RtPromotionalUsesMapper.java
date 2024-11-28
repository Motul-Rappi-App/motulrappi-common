package co.com.common.mappers;

import co.com.common.domain.RtPromotionalUses;
import co.com.common.dto.RtPromotionalUses.RtPromotionalUsesRequestDto;
import co.com.common.dto.RtPromotionalUses.RtPromotionalUsesResponseDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;


public class RtPromotionalUsesMapper {
    public static RtPromotionalUsesResponseDto toRtPromotionalUsesResponseDto(RtPromotionalUses rtPromotionalUses){
        return RtPromotionalUsesResponseDto.builder()
                .id(rtPromotionalUses.getId())
                .inscriptionDate(rtPromotionalUses.getInscriptionDate())
                .quantityLiters(rtPromotionalUses.getQuantityLiters())
                .rappiCourier(RappiCourierMapper.toRappiCourierResponseDto(rtPromotionalUses.getRappiCourier()))
                .commerce(CommerceMapper.toCommerceResponseDto(rtPromotionalUses.getCommerce()))
                .oilReference(OilReferenceMapper.toOilReferenceResponseDto(rtPromotionalUses.getOilReference()))
                .viscosity(ViscosityMapper.toViscosityResponseDto(rtPromotionalUses.getViscosity()))
                .build();
    }

    public static RtPromotionalUses toRtPromotionalUses(RtPromotionalUsesRequestDto rtPromotionalUsesRequestDto){
        return RtPromotionalUses.builder()
                .quantityLiters(rtPromotionalUsesRequestDto.getQuantityLiters())
                .build();
    }

    public static Slice<RtPromotionalUsesResponseDto> toRtPromotionalUsesResponseDtoSlice(Slice<RtPromotionalUses> rtPromotionalUses){
        if(rtPromotionalUses == null ) return new SliceImpl<>(Collections.emptyList());
        return rtPromotionalUses.map(RtPromotionalUsesMapper::toRtPromotionalUsesResponseDto);
    }
}