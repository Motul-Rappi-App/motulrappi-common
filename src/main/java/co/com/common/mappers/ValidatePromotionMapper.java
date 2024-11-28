package co.com.common.mappers;

import co.com.common.dto.RappiCourier.RappiCourierResponseDto;
import co.com.common.dto.ValidatePromotion.ValidatePromotionResponseDto;


public class ValidatePromotionMapper {
    public static ValidatePromotionResponseDto toValidatePromotionResponseDto(boolean isValidPromotion, String messageInformation, String doRegisterIn, RappiCourierResponseDto rappiCourierResopnseDto, String identification){
        return ValidatePromotionResponseDto.builder()
                .isValidPromotion(isValidPromotion)
                .messageInformation(String.format(messageInformation))
                .doRegisterIn(doRegisterIn)
                .rappiCourier(rappiCourierResopnseDto)
                .identification(identification)
                .build();
    }
}