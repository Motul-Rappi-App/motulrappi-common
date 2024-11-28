package co.com.common.mappers;

import co.com.common.domain.Location;
import co.com.common.dto.Location.LocationRequestDto;
import co.com.common.dto.Location.LocationResponseDto;
import co.com.common.dto.Location.LocationUpdateRequestDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;


public class LocationMapper {
    public static LocationResponseDto toLocationResponseDto(Location location) {
        return LocationResponseDto.builder()
                .id(location.getId())
                .name(location.getName())
                .admin(location.getAdmin() != null ? AdminMapper.toAdminResponseDto(location.getAdmin()) : null)
                .build();
    }

    public static Location toLocation(LocationRequestDto locationRequestDto) {
        return Location.builder()
                .name(locationRequestDto.getName())
                .build();
    }

    public static Location toUpdateLocation(LocationUpdateRequestDto locationUpdateRequestDto) {
        return Location.builder()
                .id(locationUpdateRequestDto.getId())
                .name(locationUpdateRequestDto.getName())
                .build();
    }

    public static Slice<LocationResponseDto> toLocationResponseDtoSlice(Slice<Location> locations) {
        if (locations == null) return new SliceImpl<>(Collections.emptyList());
        return locations.map(LocationMapper::toLocationResponseDto);
    }
}