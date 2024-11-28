package co.com.common.dto.ValidatePromotion;

import co.com.common.utils.validations.ValidatePromotionValidation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ValidatePromotionRequestDto {
    @NotBlank(message = ValidatePromotionValidation.IDENTIFICATION_NOT_EMPTY)
    private String identification;
}