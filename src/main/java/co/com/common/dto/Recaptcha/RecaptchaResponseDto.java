package co.com.common.dto.Recaptcha;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecaptchaResponseDto {
    private boolean success;
    private String challengeTs;
    private String action;
    private String hostname;
    private double score;
    private List<String> errorCodes;
}
