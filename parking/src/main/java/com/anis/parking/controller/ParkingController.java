package com.anis.parking.controller;

import com.anis.parking.DTO.ParkingDTO;
import com.anis.parking.mapper.ParkingMapper;
import com.anis.parking.parking.model.Parking;
import com.anis.parking.service.IParkingService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/parking/v1/")
@AllArgsConstructor
public class ParkingController {

    private final IParkingService Service;
    private ParkingMapper mapper;

    @PostMapping
    public ResponseEntity save(@RequestBody ParkingDTO parkingDTO) {//این پارکینگ ازقبل وجود نداره داره واسه بار اول ذخیره میکنه
        Parking parking=mapper.toParking(parkingDTO);
        Service.save(parking);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity update(@RequestBody ParkingDTO parkingDTO) {
        Parking parking=mapper.toParking(parkingDTO);
        Service.update(parking);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<ParkingDTO> getById(@PathVariable Long id) {
        Parking parking = Service.getById(id);
        ParkingDTO parkingDTO=mapper.toParkingDTO(parking);
        return ResponseEntity.ok(parkingDTO);
    }

    @GetMapping
    public ResponseEntity<List<ParkingDTO>> getAll() {
        List<Parking> parkingList = Service.getAll();
        List<ParkingDTO> parkingDTOS = mapper.toParkingDTO(parkingList);
        return ResponseEntity.ok(parkingDTOS);
    }

}
