package com.anis.parking.service;

import com.anis.parking.parking.model.Parking;

import java.util.List;

public interface IParkingService {
     Parking save(Parking parking);
     Parking update(Parking parking);
     void  delete (Long id);
     Parking getById(Long id);
     List<Parking> getAll();

}
