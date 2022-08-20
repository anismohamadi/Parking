package com.anis.parking.repository;

import com.anis.parking.parking.model.Parking;
import com.anis.parking.parking.model.Vehicle;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle,Long> {

}