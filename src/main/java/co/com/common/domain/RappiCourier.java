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
@Table(name = "rappi_couriers")
public class RappiCourier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false, unique = true)
    private String identification;

    @Column(name = "full_name", length = 50, nullable = false)
    private String fullName;

    @Column(name = "rappi_token", length = 100, nullable = false, unique = true)
    private String rappiToken;

    @Column(name = "cell_number", length = 15, nullable = false, unique = true)
    private String cellNumber;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "commerce_id")
    private Commerce commerce;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "motorcycle_id")
    private Motorcycle motorcycle;

    @Column(name = "inscription_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp inscriptionDate;

    @PrePersist
    public void onCreate () {
        this.inscriptionDate = new Timestamp(System.currentTimeMillis());
    }
}