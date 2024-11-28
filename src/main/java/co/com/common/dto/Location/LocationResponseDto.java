package co.com.common.dto.Location;

import co.com.common.dto.Admin.AdminResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class LocationResponseDto {
    private Long id;
    private String name;
    private AdminResponseDto admin;
}
