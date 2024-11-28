package co.com.common.dto.OilReference;

import co.com.common.dto.Admin.AdminResponseDto;
import co.com.common.dto.Viscosity.ViscosityResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class OilReferenceResponseDto {
    private Long id;
    private String name;
    private Float litersQuantity;
    private Boolean activeForRappiCourier;
    private AdminResponseDto admin;
    private ViscosityResponseDto[] viscosities;
}