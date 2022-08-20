package com.anis.parking.service;

import com.anis.parking.parking.model.Parking;
import com.anis.parking.repository.ParkingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ParkingService implements IParkingService {

    private final ParkingRepository repository;


    @Override
    public Parking save(Parking parking) {
        return repository.save(parking);
    }

    @Override
    public Parking update(Parking parking) {
        Parking LastSaved = getById(parking.getId());
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Parking getById(Long id) {
        Optional<Parking> optionalParking = repository.findById(id);
        if (!optionalParking.isPresent()) {
            throw new RuntimeException("Not Found");
        }
        return optionalParking.get();
    }

    @Override
    public List<Parking> getAll() {
        return (List<Parking>) repository.findAll();
    }//لیست تمام اونایی که دیتا دارن تو دیتابیس
}
