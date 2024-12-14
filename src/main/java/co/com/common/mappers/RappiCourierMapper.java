package co.com.common.mappers;

import co.com.common.domain.RappiCourier;
import co.com.common.dto.RappiCourier.RappiCourierRequestDto;
import co.com.common.dto.RappiCourier.RappiCourierResponseDto;
import co.com.common.dto.RappiCourier.RappiCourierUpdateRequestDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RappiCourierMapper {
    public static RappiCourierResponseDto toRappiCourierResponseDto(RappiCourier rappiCourier) {
        return RappiCourierResponseDto.builder()
                .id(rappiCourier.getId())
                .identification(rappiCourier.getIdentification())
                .fullName(rappiCourier.getFullName())
                .rappiToken(rappiCourier.getRappiToken())
                .cellNumber(rappiCourier.getCellNumber())
                .location(LocationMapper.toLocationResponseDto(rappiCourier.getLocation()))
                .commerce(CommerceMapper.toCommerceResponseDto(rappiCourier.getCommerce()))
                .motorcycle(MotorcycleMapper.toMotorcycleResponseDto(rappiCourier.getMotorcycle()))
                .inscriptionDate(rappiCourier.getInscriptionDate())
                .build();
    }

    public static RappiCourier toRappiCourier(RappiCourierRequestDto rappiCourierRequestDto) {
        return RappiCourier.builder()
                .identification(rappiCourierRequestDto.getIdentification())
                .fullName(rappiCourierRequestDto.getFullName())
                .cellNumber(rappiCourierRequestDto.getCellNumber())
                .rappiToken(rappiCourierRequestDto.getRappiToken())
                .build();
    }

    public static RappiCourier toUpdateRappiCourier(RappiCourierUpdateRequestDto rappiCourierUpdateRequestDto) {
        return RappiCourier.builder()
                .id(rappiCourierUpdateRequestDto.getId())
                .fullName(rappiCourierUpdateRequestDto.getFullName())
                .cellNumber(rappiCourierUpdateRequestDto.getCellNumber())
                .build();
    }

    public static Slice<RappiCourierResponseDto> toRappiCourierResponseDtoSlice(Slice<RappiCourier> rappiCouriers) {
        if (rappiCouriers == null) return new SliceImpl<>(Collections.emptyList());
        return rappiCouriers.map(RappiCourierMapper::toRappiCourierResponseDto);
    }

    public static List<RappiCourierResponseDto> toRappiCourierResponseDtoList(List<RappiCourier> rappiCouriers) {
        if (rappiCouriers == null) return Collections.emptyList();
        return rappiCouriers.stream().map(RappiCourierMapper::toRappiCourierResponseDto).collect(Collectors.toList());
    }
}