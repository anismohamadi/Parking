package com.anis.parking.mapper;

import com.anis.parking.DTO.VehicleDTO;
import com.anis.parking.parking.model.Vehicle;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "Spring")
public interface VehicleMapper {


    Vehicle toVehicle(VehicleDTO vehicleDTO);
    VehicleDTO toVehicleDTO(Vehicle vehicle);
    List<Vehicle> toVehicleList(List<VehicleDTO> vehicleDTOS);
    List<VehicleDTO> toVehicleDTO(List<Vehicle> vehicleList);
}
