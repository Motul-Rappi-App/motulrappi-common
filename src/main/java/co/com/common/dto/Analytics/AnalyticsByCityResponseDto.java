package co.com.common.dto.Analytics;

import co.com.common.dto.Location.LocationResponseDto;

import java.util.List;

public class AnalyticsByCityResponseDto {
    private LocationResponseDto location;
    private Float totalLitersRt;
    private Float totalLitersSoat;
    private List<TopOilReferenceResponseDto> topFiveOilReferencesRt;
    private List<TopOilReferenceResponseDto> topFiveOilReferencesSoat;
    private List<TopCommercesResponseDto> topThreeCommercesRt;
    private List<TopCommercesResponseDto> topThreeCommercesSoat;
    private Integer totalRedemptionsRt;
    private Integer getTotalRedemptionsSoat;
}
