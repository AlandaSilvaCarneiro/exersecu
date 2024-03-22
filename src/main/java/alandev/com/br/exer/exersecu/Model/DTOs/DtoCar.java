package alandev.com.br.exer.exersecu.Model.DTOs;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DtoCar {
    @Column(nullable = false, length = 20)
    private String modelCar;

    @Column(nullable = false, length = 20)
    private String color_car;

    @Column(nullable = false, length = 7, unique = true)
    private String lincensePlateCar;

    @Column(nullable = false, length = 20)
    private String brandCar;
}
