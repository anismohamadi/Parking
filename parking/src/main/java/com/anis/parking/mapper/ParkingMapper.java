package com.anis.parking.mapper;

import com.anis.parking.DTO.ParkingDTO;
import com.anis.parking.parking.model.Parking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.Date;
import java.util.List;


@Mapper(componentModel = "Spring")
public interface ParkingMapper  {

    @Mappings({
            @Mapping(source = "entryTime", target = "entryTime", ignore = false, qualifiedByName = "parkingTimestampToDate"),
            @Mapping(source = "exitTime", target = "exitTime", ignore = false, qualifiedByName = "parkingTimestampToDate")
    })
    Parking toParking(ParkingDTO parkingDTO);
    @Mappings({
            @Mapping(source = "entryTime", target = "entryTime", ignore = false, qualifiedByName = "parkingDateToTimstamp"),
            @Mapping(source = "exitTime", target = "exitTime", ignore = false, qualifiedByName = "parkingDateToTimstamp")
    })
    ParkingDTO toParkingDTO(Parking parking);
    List<Parking> toParkingList(List<ParkingDTO> parkingDTOS);
    List<ParkingDTO> toParkingDTO(List<Parking> parkingList);

    @Named("parkingTimestampToDate")
        default Date toDate(Long timestamp){
        if (timestamp !=null)
            return new Date(timestamp);

        return null;
    }

    @Named("parkingDateToTimestamp")
    default Long toTimestamp(Date date){
        if (date !=null)
            return date.getTime();

        return null;
    }




}
