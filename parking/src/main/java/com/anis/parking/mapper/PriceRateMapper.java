package com.anis.parking.mapper;

import com.anis.parking.DTO.ParkingDTO;
import com.anis.parking.DTO.PriceRateDTO;
import com.anis.parking.parking.model.Parking;
import com.anis.parking.parking.model.PriceRate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.Date;
import java.util.List;

@Mapper(componentModel = "Spring")
public interface PriceRateMapper {

    @Mappings({
            @Mapping(source = "hourRate", target = "hourRate", ignore = false, qualifiedByName = "priceRateTimestampToDate"),
            @Mapping(source = "dayRate", target = "dayRate", ignore = false, qualifiedByName = "priceRateTimestampToDate"),
            @Mapping(source = "monthRate", target = "monthRate", ignore = false, qualifiedByName = "priceRateTimestampToDate"),
    })
    PriceRate toPriceRate(PriceRateDTO priceRateDTO);

    @Mappings({
            @Mapping(source = "hourRate", target = "hourRate", ignore = false, qualifiedByName = "priceRateDateToTimestamp"),
            @Mapping(source = "dayRate", target = "dayRate", ignore = false, qualifiedByName = "priceRateDateToTimestamp"),
            @Mapping(source = "monthRate", target = "monthRate", ignore = false, qualifiedByName = "priceRateDateToTimestamp"),
    })
    PriceRateDTO toPriceRateDTO(PriceRate priceRate);

    List<PriceRate> toPriceRateList(List<PriceRateDTO> priceRateDTO);

    List<PriceRateDTO> toPriceRateDTO(List<PriceRate> priceRateList);

    @Named("priceRateTimestampToDate")
    default Date toDate(Long timestamp){
        if (timestamp !=null)
            return new Date(timestamp);

        return null;
    }

    @Named("PriceRateDateToTimestamp")
    default Long toTimestamp(Date date){
        if (date !=null)
            return date.getTime();

        return null;
    }
}
