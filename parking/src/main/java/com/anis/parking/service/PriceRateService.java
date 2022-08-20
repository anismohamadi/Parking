package com.anis.parking.service;

import com.anis.parking.parking.model.PriceRate;
import com.anis.parking.repository.PriceRateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PriceRateService implements IPriceRateService {

    private final PriceRateRepository repository;


    @Override
    public PriceRate save(PriceRate price_rate) {

        return repository.save(price_rate);
    }

    @Override
    public PriceRate update(PriceRate price_rate) {
        PriceRate lastSaved = getById(price_rate.getId());
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public PriceRate getById(Long id) {
        Optional<PriceRate> optionalPrice_rate = repository.findById(id);
        if (!optionalPrice_rate.isPresent()) {
            throw new RuntimeException("Not Found");
        }
        return optionalPrice_rate.get();
    }

    @Override
    public List<PriceRate> getAll() {
        return (List<PriceRate>) repository.findAll();
    }
}
