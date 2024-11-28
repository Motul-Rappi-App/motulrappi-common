package co.com.common.domain;

import co.com.common.utils.enums.MotorStroke;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
@Table(name = "motorcycles")
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String brand;

    @Column(name = "cylinder_capacity", length = 4, nullable = false)
    private String cylinderCapacity;

    @Column(length = 4, nullable = false)
    private String year;

    @Column(name = "motor_stroke", nullable = false)
    private MotorStroke motorStroke;

    @Column(length = 50, nullable = false)
    private String reference;
}
