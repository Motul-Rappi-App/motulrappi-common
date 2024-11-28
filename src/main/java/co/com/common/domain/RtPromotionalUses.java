package co.com.common.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
@Table(name = "rt_promotional_uses")
public class RtPromotionalUses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "commerce_id")
    private Commerce commerce;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "rappi_courier_id")
    private RappiCourier rappiCourier;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "oil_reference_id")
    private OilReference oilReference;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "viscosity_id")
    private Viscosity viscosity;

    @Column(name = "quantity_liters", nullable = false)
    private Integer quantityLiters;

    @Column(name = "inscription_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp inscriptionDate;

    @PrePersist
    public void onCreate () {
        this.inscriptionDate = new Timestamp(System.currentTimeMillis());
    }
}
