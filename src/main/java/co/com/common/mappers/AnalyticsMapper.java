package co.com.common.mappers;

import co.com.common.domain.Commerce;
import co.com.common.domain.OilReference;
import co.com.common.domain.SoatPromotionalUses;
import co.com.common.domain.Viscosity;
import co.com.common.dto.Analytics.NumRappiCourierRegisteredByTradeResponseDto;
import co.com.common.dto.Analytics.TopCommercesResponseDto;
import co.com.common.dto.Analytics.TopOilReferenceResponseDto;
import co.com.common.dto.SoatPromotionalUses.SoatPromotionalUsesResponseDto;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;
import java.util.List;

public class AnalyticsMapper {

    public static TopCommercesResponseDto toTopCommercesResponseDto(Commerce commerce, Long redemptionCount) {
        return TopCommercesResponseDto.builder()
                .commerce(CommerceMapper.toCommerceResponseDto(commerce))
                .redemptionCount(redemptionCount)
                .build();
    }

    public static TopOilReferenceResponseDto toTopOilReferenceResponseDto(OilReference oilReference, Viscosity viscosity, Long redemptionCount){
        return TopOilReferenceResponseDto.builder()
                .oilReference(OilReferenceMapper.toOilReferenceResponseDto(oilReference))
                .viscosity(ViscosityMapper.toViscosityResponseDto(viscosity))
                .redemptionCount(redemptionCount)
                .build();
    }

    public static NumRappiCourierRegisteredByTradeResponseDto toNumRappiCourierRegistreredByTradeResponseDto(Commerce commerce, Long registeredRtCounter){
        return NumRappiCourierRegisteredByTradeResponseDto.builder()
                .commerce(CommerceMapper.toCommerceResponseDto(commerce))
                .registeredRtCounter(registeredRtCounter)
                .build();
    }
}
