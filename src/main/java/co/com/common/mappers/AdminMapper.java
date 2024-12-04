package co.com.common.mappers;

import co.com.common.domain.Admin;
import co.com.common.dto.Admin.AdminRequestDto;
import co.com.common.dto.Admin.AdminResponseDto;
import co.com.common.dto.Admin.AdminUpdateRequestDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;


public class AdminMapper {
    public static AdminResponseDto toAdminResponseDto(Admin admin) {
        return AdminResponseDto.builder()
                .id(admin.getId())
                .name(admin.getName())
                .credential(CredentialMapper.toCredentialResponseDto(admin.getCredential()))
                .superAdmin(admin.isSuperAdmin())
                .build();
    }

    public static AdminResponseDto toCredentialAdminResponseDto(Admin admin) {
        if (admin == null) return null;

        return AdminResponseDto.builder()
                .id(admin.getId())
                .name(admin.getName())
                .credential(CredentialMapper.toCredentialResponseDto(admin.getCredential()))
                .superAdmin(admin.isSuperAdmin())
                .build();
    }

    public static Admin toAdmin(AdminRequestDto adminRequestDto) {
        return Admin.builder()
                .name(adminRequestDto.getName())
                .superAdmin(adminRequestDto.isSuperAdmin())
                .build();
    }

    public static Admin toUpdateAdmin(AdminUpdateRequestDto adminUpdateRequestDto) {
        return Admin.builder()
                .id(adminUpdateRequestDto.getId())
                .name(adminUpdateRequestDto.getName())
                .build();
    }

    public static Slice<AdminResponseDto> toAdminResponseDtoSlice(Slice<Admin> admins) {
        if (admins == null) return new SliceImpl<>(Collections.emptyList());
        return admins.map(AdminMapper::toAdminResponseDto);
    }
}