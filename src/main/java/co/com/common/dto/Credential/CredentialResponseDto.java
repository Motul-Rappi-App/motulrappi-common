package co.com.common.dto.Credential;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class CredentialResponseDto {
    private Long id;
    private String email;
}
