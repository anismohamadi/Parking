package com.anis.parking.controller;

import com.anis.parking.DTO.ParkingDTO;
import com.anis.parking.DTO.PriceRateDTO;
import com.anis.parking.mapper.PriceRateMapper;
import com.anis.parking.parking.model.Parking;
import com.anis.parking.parking.model.PriceRate;
import com.anis.parking.service.IPriceRateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/price_rate/")
@AllArgsConstructor
public class PriceRateController {

    private final IPriceRateService Service;
    private PriceRateMapper mapper;

    @PostMapping("/v1")//ورژنینگ
    public ResponseEntity save(@RequestBody PriceRateDTO priceRateDTO) {//این پارکینگ ازقبل وجود نداره داره واسه بار اول ذخیره میکنه
        PriceRate priceRate=mapper.toPriceRate(priceRateDTO);
        Service.save(priceRate);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/v1")
    public ResponseEntity updateee(@RequestBody PriceRateDTO priceRateDTO) {
        PriceRate priceRate=mapper.toPriceRate(priceRateDTO);
        Service.update(priceRate);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<PriceRateDTO> getById(@PathVariable Long id) {
        PriceRate priceRate = Service.getById(id);
        PriceRateDTO priceRateDTO=mapper.toPriceRateDTO(priceRate);
        return ResponseEntity.ok(priceRateDTO);
    }

    @GetMapping("/v1")
    public ResponseEntity<List<PriceRateDTO>> getAll() {
        List<PriceRate> priceRateList = Service.getAll();
        List<PriceRateDTO> priceRateDTOS = mapper.toPriceRateDTO(priceRateList);
        return ResponseEntity.ok(priceRateDTOS);
    }
}