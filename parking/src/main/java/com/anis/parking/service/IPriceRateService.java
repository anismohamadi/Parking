package com.anis.parking.service;

import com.anis.parking.parking.model.PriceRate;

import java.util.List;

public interface IPriceRateService {
    PriceRate save(PriceRate price_rate);
    PriceRate update(PriceRate price_rate);
    void  delete (Long id);
    PriceRate getById(Long id);
    List<PriceRate> getAll();
}
