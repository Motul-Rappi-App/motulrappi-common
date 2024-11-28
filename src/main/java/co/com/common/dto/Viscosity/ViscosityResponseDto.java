package co.com.common.dto.Viscosity;

import co.com.common.dto.Admin.AdminResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class ViscosityResponseDto {
    private Long id;
    private String description;
    private AdminResponseDto admin;
}