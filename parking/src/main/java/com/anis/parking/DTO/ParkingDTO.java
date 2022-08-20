package com.anis.parking.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class ParkingDTO {

        @ApiModelProperty(required = false, hidden = true)
        private  Long id;

        @ApiModelProperty(required = true, hidden = false)
        private Long entryTime;

        @ApiModelProperty(required = true, hidden = false)
        private  Long exitTime;

        @ApiModelProperty(required = true, hidden = false)
        private Long finalPrice;


}





