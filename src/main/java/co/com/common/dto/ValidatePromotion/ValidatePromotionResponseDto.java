package co.com.common.dto.ValidatePromotion;

import co.com.common.dto.RappiCourier.RappiCourierResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ValidatePromotionResponseDto {
    private boolean isValidPromotion;
    private String messageInformation;
    private String doRegisterIn;
    private RappiCourierResponseDto rappiCourier;
    private String identification;
}