package co.com.common.mappers;

import co.com.common.domain.Motorcycle;
import co.com.common.dto.Motorcycle.MotorcycleRequestDto;
import co.com.common.dto.Motorcycle.MotorcycleResponseDto;
import co.com.common.dto.Motorcycle.MotorcycleUpdateRequestDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;


public class MotorcycleMapper {
    public static MotorcycleResponseDto toMotorcycleResponseDto(Motorcycle motorcycle) {
        return MotorcycleResponseDto.builder()
                .id(motorcycle.getId())
                .brand(motorcycle.getBrand())
                .cylinderCapacity(motorcycle.getCylinderCapacity())
                .year(motorcycle.getYear())
                .motorStroke(motorcycle.getMotorStroke().toString())
                .reference(motorcycle.getReference())
                .build();
    }

    public static Motorcycle toMotorcycle(MotorcycleRequestDto motorcycleRequestDto) {
        return Motorcycle.builder()
                .brand(motorcycleRequestDto.getBrand())
                .cylinderCapacity(motorcycleRequestDto.getCylinderCapacity())
                .year(motorcycleRequestDto.getYear())
                .motorStroke(motorcycleRequestDto.getMotorStroke())
                .reference(motorcycleRequestDto.getReference())
                .build();
    }

    public static Motorcycle toUpdateMotorcycle(MotorcycleUpdateRequestDto motorcycleUpdateRequestDto) {
        return Motorcycle.builder()
                .id(motorcycleUpdateRequestDto.getId())
                .brand(motorcycleUpdateRequestDto.getBrand())
                .cylinderCapacity(motorcycleUpdateRequestDto.getCylinderCapacity())
                .year(motorcycleUpdateRequestDto.getYear())
                .motorStroke(motorcycleUpdateRequestDto.getMotorStroke())
                .reference(motorcycleUpdateRequestDto.getReference())
                .build();
    }

    public static Slice<MotorcycleResponseDto> toMotorcycleResponseDtoSlice(Slice<Motorcycle> motorcycles) {
        if (motorcycles == null) return new SliceImpl<>(Collections.emptyList());
        return motorcycles.map(MotorcycleMapper::toMotorcycleResponseDto);
    }
}