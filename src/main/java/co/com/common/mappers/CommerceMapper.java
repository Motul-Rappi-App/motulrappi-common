package co.com.common.mappers;

import co.com.common.domain.Commerce;
import co.com.common.dto.Commerce.CommerceRequestDto;
import co.com.common.dto.Commerce.CommerceResponseDto;
import co.com.common.dto.Commerce.CommerceUpdateRequestDto;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.SliceImpl;

import java.util.Collections;


public class CommerceMapper {
    public static CommerceResponseDto toCommerceResponseDto(Commerce commerce) {
        return CommerceResponseDto.builder()
                .id(commerce.getId())
                .nit(commerce.getNit())
                .name(commerce.getName())
                .personStatus(commerce.isPersonStatus())
                .credential(CredentialMapper.toCredentialResponseDto(commerce.getCredential()))
                .location(LocationMapper.toLocationResponseDto(commerce.getLocation()))
                .admin(AdminMapper.toAdminResponseDto(commerce.getAdmin()))
                .inscriptionDate(commerce.getInscriptionDate())
                .build();
    }

    public static CommerceResponseDto toCredentialCommerceResponseDto(Commerce commerce) {
        if (commerce == null) return null;

        return CommerceResponseDto.builder()
                .id(commerce.getId())
                .nit(commerce.getNit())
                .name(commerce.getName())
                .personStatus(commerce.isPersonStatus())
                .credential(CredentialMapper.toCredentialResponseDto(commerce.getCredential()))
                .location(LocationMapper.toLocationResponseDto(commerce.getLocation()))
                .admin(AdminMapper.toAdminResponseDto(commerce.getAdmin()))
                .inscriptionDate(commerce.getInscriptionDate())
                .build();
    }

    public static Commerce toCommerce(CommerceRequestDto commerceRequestDto) {
        return Commerce.builder()
                .nit(commerceRequestDto.getNit())
                .name(commerceRequestDto.getName())
                .personStatus(commerceRequestDto.isPersonStatus())
                .build();
    }

    public static Commerce toUpdateCommerce(CommerceUpdateRequestDto commerceUpdateRequestDto) {
        return Commerce.builder()
                .id(commerceUpdateRequestDto.getId())
                .nit(commerceUpdateRequestDto.getNit())
                .name(commerceUpdateRequestDto.getName())
                .personStatus(commerceUpdateRequestDto.isPersonStatus())
                .build();
    }

    public static Slice<CommerceResponseDto> toCommerceResponseDtoSlice(Slice<Commerce> commerces) {
        if (commerces == null) return new SliceImpl<>(Collections.emptyList());
        return commerces.map(CommerceMapper::toCommerceResponseDto);
    }
}