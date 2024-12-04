package co.com.common.dto.Admin;

import co.com.common.dto.Credential.CredentialResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class AdminResponseDto {
    private Long id;
    private String name;
    private CredentialResponseDto credential;
    private boolean superAdmin;
}
