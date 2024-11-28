package co.com.common.mappers;

import co.com.common.domain.OilReference;
import co.com.common.dto.OilReference.OilReferenceRequestDto;
import co.com.common.dto.OilReference.OilReferenceResponseDto;
import co.com.common.dto.OilReference.OilReferenceUpdateRequestDto;
import co.com.common.dto.Viscosity.ViscosityResponseDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;


public class OilReferenceMapper {
    public static OilReferenceResponseDto toOilReferenceResponseDto(OilReference oilReference) {
        return OilReferenceResponseDto.builder()
                .id(oilReference.getId())
                .name(oilReference.getName())
                .viscosities(ViscosityMapper.toViscosityResponseDtoList(oilReference.getViscosities()).toArray(new ViscosityResponseDto[0]))
                .litersQuantity(oilReference.getLitersQuantity())
                .activeForRappiCourier(oilReference.getActiveForRappiCourier())
                .admin(AdminMapper.toAdminResponseDto(oilReference.getAdmin()))
                .build();
    }

    public static OilReference toOilReference(OilReferenceRequestDto oilReferenceRequestDto) {
        return OilReference.builder()
                .name(oilReferenceRequestDto.getName())
                .litersQuantity(oilReferenceRequestDto.getLitersQuantity())
                .activeForRappiCourier(oilReferenceRequestDto.getActiveForRappiCourier())
                .build();
    }

    public static OilReference toUpdateOilReference(OilReferenceUpdateRequestDto oilReferenceUpdateRequestDto) {
        return OilReference.builder()
                .id(oilReferenceUpdateRequestDto.getId())
                .name(oilReferenceUpdateRequestDto.getName())
                .litersQuantity(oilReferenceUpdateRequestDto.getLitersQuantity())
                .activeForRappiCourier(oilReferenceUpdateRequestDto.getActiveForRappiCourier())
                .build();
    }

    public static Slice<OilReferenceResponseDto> toOilReferenceResponseDtoSlice(Slice<OilReference> oilReferences) {
        if (oilReferences == null) return new SliceImpl<>(Collections.emptyList());
        return oilReferences.map(OilReferenceMapper::toOilReferenceResponseDto);
    }
}