package co.com.common.dto.ForgotPassword;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class ForgotPasswordResponseDto {
    private String message;
}
