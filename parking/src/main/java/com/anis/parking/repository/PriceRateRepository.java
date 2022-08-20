package com.anis.parking.repository;

import com.anis.parking.parking.model.PriceRate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PriceRateRepository extends PagingAndSortingRepository<PriceRate, Long> {
    List<PriceRate> findAllByHourRate(PriceRate pricerate);

}

