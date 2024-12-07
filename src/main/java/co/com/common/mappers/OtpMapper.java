package co.com.common.mappers;

import co.com.common.domain.Otp;
import co.com.common.dto.Authentication.PasswordRecoveryRequestOtpDto;

public class OtpMapper {
    public static Otp toOtp(PasswordRecoveryRequestOtpDto passwordRecoveryRequestOtpDto, String generatedOtp) {
        return Otp.builder()
                .email(passwordRecoveryRequestOtpDto.getEmail())
                .otp(generatedOtp)
                .build();
    }
}
