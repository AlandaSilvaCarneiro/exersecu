package alandev.com.br.exer.exersecu.Model.DTOs;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DtoParkingSpot {
    @NotBlank
    @UniqueElements
    private String parkingSpotNumber;

    @NotBlank
    @UniqueElements
    @Size(max = 7)
    private String lincensePlateCar;

    @NotBlank
    @UniqueElements
    private String emailRespo;

}
