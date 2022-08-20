package com.anis.parking.repository;

import com.anis.parking.parking.model.Parking;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends PagingAndSortingRepository<Parking, Long> {

}

