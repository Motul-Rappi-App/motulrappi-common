package co.com.common.mappers;

import co.com.common.dto.ForgotPassword.ForgotPasswordRequestDto;
import co.com.common.dto.ForgotPassword.ForgotPasswordResponseDto;
import co.com.common.dto.ForgotPassword.ForgotPasswordUpdateRequestDto;
import co.com.common.domain.Credential;
import co.com.common.domain.ForgotPassword;

import java.util.Date;

public class ForgotPasswordMapper {

    public static ForgotPasswordResponseDto toResponseDto(String message) {
        return new ForgotPasswordResponseDto(message);
    }

    public static ForgotPassword toForgotPassword(Credential credential, int otp) {
        return ForgotPassword.builder()
                .otp(otp)
                .expirationTime(new Date(System.currentTimeMillis() + 5 * 60 * 1000))
                .credential(credential)
                .build();
    }

    public static Credential toCredential(ForgotPasswordRequestDto requestDto) {
      return Credential.builder()
              .email(requestDto.getEmail())
              .build();
    }

    public static ForgotPasswordUpdateRequestDto toUpdateRequest(String password, String confirmPassword) {
      return ForgotPasswordUpdateRequestDto.builder()
              .password(password)
              .confirmPassword(confirmPassword)
              .build();
    }
}