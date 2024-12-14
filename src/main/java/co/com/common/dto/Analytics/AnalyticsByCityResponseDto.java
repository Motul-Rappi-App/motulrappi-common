package co.com.common.dto.Analytics;

import co.com.common.dto.Location.LocationResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@AllArgsConstructor
@Builder
@Data
public class AnalyticsByCityResponseDto {
    private LocationResponseDto location;
    private Float totalLitersSoldRt;
    private Float totalLitersSoldSoat;
    private Long totalRedemptionsByRt;
    private Long totalRedemptionsBySoat;
    private List<TopOilReferenceResponseDto> topOilReferencesByNumberOfRtRedemptions;
    private List<TopOilReferenceResponseDto> topOilReferencesByNumberOfSoatRedemptions;
    private List<TopCommercesResponseDto> topCommercesByNumberOfRtRedemptions;
    private List<TopCommercesResponseDto> topCommercesByNumberOfSoatRedemptions;
    private List<NumRappiCourierRegisteredByTradeResponseDto> commercesWithNumberOfRtRegistered;
}
