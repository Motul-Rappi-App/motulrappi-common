package co.com.common.dto.Analytics;

import co.com.common.domain.Admin;
import co.com.common.dto.Admin.AdminResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class AnalyticsByAdminResponseDto {
    private AdminResponseDto admin;
    private List<AnalyticsByCityResponseDto> analyticsByCityResponseDtoList;
}
