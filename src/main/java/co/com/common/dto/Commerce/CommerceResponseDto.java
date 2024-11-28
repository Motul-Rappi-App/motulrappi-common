package co.com.common.dto.Commerce;

import co.com.common.dto.Admin.AdminResponseDto;
import co.com.common.dto.Credential.CredentialResponseDto;
import co.com.common.dto.Location.LocationResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;


@AllArgsConstructor
@Builder
@Data
public class CommerceResponseDto {
    private Long id;
    private String nit;
    private String name;
    private CredentialResponseDto credential;
    private LocationResponseDto location;
    private boolean personStatus;
    private AdminResponseDto admin;
    private Timestamp inscriptionDate;
}