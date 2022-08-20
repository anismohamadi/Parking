package com.anis.parking.controller;


import com.anis.parking.DTO.PriceRateDTO;
import com.anis.parking.DTO.VehicleDTO;
import com.anis.parking.mapper.VehicleMapper;
import com.anis.parking.parking.model.Vehicle;
import com.anis.parking.service.IVehicleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicle/")
@AllArgsConstructor
public class VehicleController {

    private final IVehicleService Service;
    private VehicleMapper mapper;

    @PostMapping("/v1")//ورژنینگ
    public ResponseEntity save(@RequestBody VehicleDTO vehicleDTO) {//این پارکینگ ازقبل وجود نداره داره واسه بار اول ذخیره میکنه
        Vehicle vehicle=mapper.toVehicle(vehicleDTO);
        Service.save(vehicle);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/v1")
    public ResponseEntity update(@RequestBody VehicleDTO vehicleDTO) {
        Vehicle vehicle=mapper.toVehicle(vehicleDTO);
        Service.update(vehicle);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/v1/{id}")
    public ResponseEntity<VehicleDTO> getById(@PathVariable Long id) {
        Vehicle vehicle = Service.getById(id);
        VehicleDTO vehicleDTO=mapper.toVehicleDTO(vehicle);
        return ResponseEntity.ok(vehicleDTO);
    }

    @GetMapping("/v1")
    public ResponseEntity<List<VehicleDTO>> getAll() {
        List<Vehicle> vehicleList = Service.getAll();
        List<VehicleDTO> vehicleDTOS = mapper.toVehicleDTO(vehicleList);
        return ResponseEntity.ok(vehicleDTOS);
    }
}
