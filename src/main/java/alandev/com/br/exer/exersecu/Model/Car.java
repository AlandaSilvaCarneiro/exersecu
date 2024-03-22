package alandev.com.br.exer.exersecu.Model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TABLE_CAR")
@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 20)
    private String modelCar;

    @Column(nullable = false, length = 20)
    private String color_car;

    @Column(nullable = false, length = 7, unique = true)
    private String lincensePlateCar;

    @Column(nullable = false, length = 20)
    private String brandCar;

    @OneToOne(mappedBy = "carparkingSpot") 
    private ParkingSpotModeal parkingSpotModeal;
}
