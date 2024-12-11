package co.com.common.dto.Analytics;

import co.com.common.dto.Commerce.CommerceResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class TopCommercesResponseDto {
    private CommerceResponseDto commerce;
    private Integer NumberOfRedemptions;
    private Float litersSold;
}
