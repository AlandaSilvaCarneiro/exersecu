package alandev.com.br.exer.exersecu.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alandev.com.br.exer.exersecu.Model.ParkingSpotModeal;
import alandev.com.br.exer.exersecu.Repository.RepositoryParkingSpot;
import jakarta.transaction.Transactional;
import lombok.Data;

@Service
@Data
public class ServiceParkingSpot {
    @Autowired
    private final RepositoryParkingSpot repositoryParkingSpot;



    @Transactional
    public ParkingSpotModeal save(ParkingSpotModeal parkingSpotModeal){
        repositoryParkingSpot.save(parkingSpotModeal);

        return parkingSpotModeal;
    }

}
