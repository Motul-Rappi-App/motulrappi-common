package co.com.common.dto.SoatPromotionalUses;

import co.com.common.dto.Commerce.CommerceResponseDto;

import co.com.common.dto.OilReferenceSoatPromotion.OilReferenceSoatPromotionResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Slice;

import java.sql.Timestamp;
import java.util.List;


@AllArgsConstructor
@Builder
@Data
public class SoatPromotionalUsesResponseDto {
    private Long id;
    private String identification;
    private CommerceResponseDto commerce;
    private Float quantityLiters;
    private Timestamp inscriptionDate;
    private List<OilReferenceSoatPromotionResponseDto> oilReference;
}