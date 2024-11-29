package co.com.common.dto.Authentication;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class PasswordRecoveryRequestDto {
    @Email
    @NotBlank
    private String email;
}
