package alandev.com.br.exer.exersecu.Repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alandev.com.br.exer.exersecu.Model.ParkingSpotModeal;


@Repository
public interface RepositoryParkingSpot extends  JpaRepository <ParkingSpotModeal, UUID> {
    
}
