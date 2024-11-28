package co.com.common.dto.RtPromotionalUses;

import co.com.common.dto.Commerce.CommerceResponseDto;
import co.com.common.dto.OilReference.OilReferenceResponseDto;
import co.com.common.dto.RappiCourier.RappiCourierResponseDto;
import co.com.common.dto.Viscosity.ViscosityResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;


@AllArgsConstructor
@Builder
@Data
public class RtPromotionalUsesResponseDto {
    private Long id;
    private RappiCourierResponseDto rappiCourier;
    private CommerceResponseDto commerce;
    private OilReferenceResponseDto oilReference;
    private ViscosityResponseDto viscosity;
    private Integer quantityLiters;
    private Timestamp inscriptionDate;
}