package co.com.common.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
@Table(name = "oil_references")
public class OilReference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    @ManyToMany
    @JoinTable(
            name = "oil_reference_viscosities",
            joinColumns = @JoinColumn(name = "oil_reference_id"),
            inverseJoinColumns = @JoinColumn(name = "viscosity_id")
    )
    private List<Viscosity> viscosities;

    @Column(name = "liters_quantity", nullable = false)
    private Float litersQuantity;

    @Column(name = "active_for_rappi_courier", nullable = false)
    private Boolean activeForRappiCourier;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id")
    private Admin admin;
}