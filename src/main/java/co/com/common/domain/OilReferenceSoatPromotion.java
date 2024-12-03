package co.com.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
@Table(name = "oil_references_soat_promotions")
public class OilReferenceSoatPromotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "soat_promotional_uses_id", nullable = false)
    private SoatPromotionalUses soatPromotionUses;

    @ManyToOne
    @JoinColumn(name = "oil_reference_id", nullable = false)
    private OilReference oilReference;

    @ManyToOne
    @JoinColumn(name = "viscosity_id", nullable = false)
    private Viscosity viscosity;

    @Column(name = "liters_quantity_union", nullable = false)
    private Float litersQuantityUnion;
}