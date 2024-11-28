package co.com.common.mappers;

import co.com.common.domain.Credential;
import co.com.common.dto.Credential.CredentialRequestDto;
import co.com.common.dto.Credential.CredentialResponseDto;
import co.com.common.dto.Credential.CredentialUpdateRequestDto;


public class CredentialMapper {
    public static CredentialResponseDto toCredentialResponseDto(Credential credential) {
        return CredentialResponseDto.builder()
                .id(credential.getId())
                .email(credential.getEmail())
                .build();
    }

    public static Credential toCredential(CredentialRequestDto credentialRequestDto) {
        return Credential.builder()
                .email(credentialRequestDto.getEmail())
                .password(credentialRequestDto.getPassword())
                .userRole(credentialRequestDto.getUserRole())
                .build();
    }

    public static Credential toUpdateCredential(CredentialUpdateRequestDto credentialUpdateRequestDto) {
        return Credential.builder()
                .id(credentialUpdateRequestDto.getId())
                .password(credentialUpdateRequestDto.getPassword())
                .userRole(credentialUpdateRequestDto.getUserRole())
                .build();
    }
}