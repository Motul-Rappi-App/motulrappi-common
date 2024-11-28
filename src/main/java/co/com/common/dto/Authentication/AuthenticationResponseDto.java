package co.com.common.dto.Authentication;

import co.com.common.dto.Admin.AdminResponseDto;
import co.com.common.dto.Commerce.CommerceResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class AuthenticationResponseDto {
    private String token;
    private AdminResponseDto admin;
    private CommerceResponseDto commerce;
}

