package co.com.common.domain;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;


@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
@Table(name = "soat_promotional_uses")
public class SoatPromotionalUses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String identification;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "commerce_id")
    private Commerce commerce;

    @Column(name= "quantity_liters", nullable = false)
    private Float quantityLiters;

    @Column(name = "inscription_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp inscriptionDate;

    @OneToMany(mappedBy = "soatPromotionUses", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<OilReferenceSoatPromotion> oilReferences;

    @PrePersist
    public void onCreate () {
        this.inscriptionDate = new Timestamp(System.currentTimeMillis());
    }
}
