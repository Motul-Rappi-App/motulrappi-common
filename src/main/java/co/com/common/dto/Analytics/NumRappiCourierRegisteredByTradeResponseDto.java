package co.com.common.dto.Analytics;

import co.com.common.dto.Commerce.CommerceResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class NumRappiCourierRegisteredByTradeResponseDto {
    private CommerceResponseDto commerce;
    private Long registeredRtCounter;
}
