package co.com.common.dto.Recaptcha;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class RecaptchaRequestDto {
    String secret;
    String response;
}
