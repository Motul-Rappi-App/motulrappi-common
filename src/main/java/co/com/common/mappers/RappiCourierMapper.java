package co.com.common.mappers;

import co.com.common.domain.RappiCourier;
import co.com.common.dto.RappiCourier.RappiCourierRequestDto;
import co.com.common.dto.RappiCourier.RappiCourierResponseDto;
import co.com.common.dto.RappiCourier.RappiCourierUpdateRequestDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;


public class RappiCourierMapper {
    public static RappiCourierResponseDto toRappiCourierResponseDto(RappiCourier rappiCourier) {
        return RappiCourierResponseDto.builder()
                .id(rappiCourier.getId())
                .identification(rappiCourier.getIdentification())
                .fullName(rappiCourier.getFullName())
                .rappiToken(rappiCourier.getRappiToken())
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
                .rappiToken(rappiCourierRequestDto.getRappiToken())
                .build();
    }

    public static RappiCourier toUpdateRappiCourier(RappiCourierUpdateRequestDto rappiCourierUpdateRequestDto) {
        return RappiCourier.builder()
                .id(rappiCourierUpdateRequestDto.getId())
                .fullName(rappiCourierUpdateRequestDto.getFullName())
                .build();
    }

    public static Slice<RappiCourierResponseDto> toRappiCourierResponseDtoSlice(Slice<RappiCourier> rappiCouriers) {
        if (rappiCouriers == null) return new SliceImpl<>(Collections.emptyList());
        return rappiCouriers.map(RappiCourierMapper::toRappiCourierResponseDto);
    }
}