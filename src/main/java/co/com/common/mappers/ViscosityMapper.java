package co.com.common.mappers;

import co.com.common.domain.Viscosity;
import co.com.common.dto.Viscosity.ViscosityRequestDto;
import co.com.common.dto.Viscosity.ViscosityResponseDto;
import co.com.common.dto.Viscosity.ViscosityUpdateRequestDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;
import java.util.List;


public class ViscosityMapper {
    public static ViscosityResponseDto toViscosityResponseDto(Viscosity viscosity) {
        return ViscosityResponseDto.builder()
                .id(viscosity.getId())
                .description(viscosity.getDescription())
                .admin(AdminMapper.toAdminResponseDto(viscosity.getAdmin()))
                .build();
    }

    public static Viscosity toViscosity(ViscosityRequestDto viscosityRequestDto) {
        return Viscosity.builder()
                .description(viscosityRequestDto.getDescription())
                .build();
    }

    public static Viscosity toUpdateViscosity(ViscosityUpdateRequestDto viscosityUpdateRequestDto) {
        return Viscosity.builder()
                .id(viscosityUpdateRequestDto.getId())
                .description(viscosityUpdateRequestDto.getDescription())
                .build();
    }

    public static Slice<ViscosityResponseDto> toViscosityResponseDtoSlice(Slice<Viscosity> viscosities) {
        if (viscosities == null) return new SliceImpl<>(Collections.emptyList());
        return viscosities.map(ViscosityMapper::toViscosityResponseDto);
    }

    public static List<ViscosityResponseDto> toViscosityResponseDtoList(List<Viscosity> viscosities) {
        if (viscosities == null) return Collections.emptyList();
        return viscosities.stream().map(ViscosityMapper::toViscosityResponseDto).toList();
    }
}