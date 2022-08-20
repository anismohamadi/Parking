package com.anis.parking.service;


import com.anis.parking.parking.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    Vehicle save(Vehicle vehicle);
    Vehicle update(Vehicle vehicle);
    void  delete (Long id);
    Vehicle getById(Long id);
    List<Vehicle> getAll();
}
