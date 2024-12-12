package co.com.common.dto.Analytics;

import co.com.common.dto.Admin.AdminResponseDto;
import co.com.common.dto.OilReference.OilReferenceResponseDto;
import co.com.common.dto.Viscosity.ViscosityResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class TopOilReferenceResponseDto {
    private OilReferenceResponseDto oilReference;
    private ViscosityResponseDto viscosity;
    private Long redemptionCount;
}
