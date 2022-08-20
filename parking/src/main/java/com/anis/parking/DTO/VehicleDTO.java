package com.anis.parking.DTO;

import com.anis.parking.parking.model.VehicleType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
public class VehicleDTO {


    @ApiModelProperty(required = false, hidden = true)
    private  Long id;

    @ApiModelProperty(required = true, hidden = false)
    private VehicleType vehicleType;

    @ApiModelProperty(required = true, hidden = false)
    private String carCode;
}
