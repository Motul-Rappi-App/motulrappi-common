package co.com.common.mappers;

import co.com.common.domain.RtPromotionalUses;
import co.com.common.dto.RtPromotionalUses.RtPromotionalUsesRequestDto;
import co.com.common.dto.RtPromotionalUses.RtPromotionalUsesResponseDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


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
        if (rtPromotionalUses == null) return new SliceImpl<>(Collections.emptyList());
        return rtPromotionalUses.map(RtPromotionalUsesMapper::toRtPromotionalUsesResponseDto);
    }

    public static List<RtPromotionalUsesResponseDto> toRtPromotionalUsesResponseDtoList(List<RtPromotionalUses> rtPromotionalUses){
        if (rtPromotionalUses == null) return Collections.emptyList();
        return rtPromotionalUses.stream().map(RtPromotionalUsesMapper::toRtPromotionalUsesResponseDto).collect(Collectors.toList());
    }
}