package co.com.common.dto.Motorcycle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@AllArgsConstructor
@Builder
@Data
public class MotorcycleResponseDto {
    private Long id;
    private String brand;
    private String cylinderCapacity;
    private String year;
    private String motorStroke;
    private String reference;
}
