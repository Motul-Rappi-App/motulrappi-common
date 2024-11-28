package co.com.common.dto.RappiCourier;

import co.com.common.dto.Commerce.CommerceResponseDto;
import co.com.common.dto.Location.LocationResponseDto;
import co.com.common.dto.Motorcycle.MotorcycleResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;


@AllArgsConstructor
@Builder
@Data
public class RappiCourierResponseDto {
    private Long id;
    private String identification;
    private String fullName;
    private String rappiToken;
    private LocationResponseDto location;
    private CommerceResponseDto commerce;
    private MotorcycleResponseDto motorcycle;
    private Timestamp inscriptionDate;
}