package com.anis.parking.service;

import com.anis.parking.parking.model.Vehicle;
import com.anis.parking.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VehicleService implements IVehicleService {


    private final VehicleRepository repository;

    @Override
    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        Vehicle lastSaved = getById(vehicle.getId());

        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Vehicle getById(Long id) {
        Optional<Vehicle> optionalVehicle = repository.findById(id);
        if (!optionalVehicle.isPresent()) {
            throw new RuntimeException("NotFound");
        }
        return optionalVehicle.get();
    }

    @Override
    public List<Vehicle> getAll() {
        return (List<Vehicle>) repository.findAll();
    }
}
