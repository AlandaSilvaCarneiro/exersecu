package alandev.com.br.exer.exersecu.Controller;


import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alandev.com.br.exer.exersecu.Model.ParkingSpotModeal;
import alandev.com.br.exer.exersecu.Model.DTOs.DtoParkingSpot;
import alandev.com.br.exer.exersecu.Service.ServiceParkingSpot;
import jakarta.validation.Valid;
import lombok.Data;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@Data
@RequestMapping("/parkingSport")

public class ControllerParkingSpot {

    @Autowired
    private final ServiceParkingSpot serviceParkingSpot;

    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid DtoParkingSpot dtoParkingSpot){
        var saveParkingSpot = new ParkingSpotModeal();
        BeanUtils.copyProperties(dtoParkingSpot,saveParkingSpot);
        saveParkingSpot.setRegistretiondate(LocalDateTime.now(ZoneId.of("UTC")));

        return ResponseEntity.status(HttpStatus.CREATED).body(serviceParkingSpot.save(saveParkingSpot));
    }
}
