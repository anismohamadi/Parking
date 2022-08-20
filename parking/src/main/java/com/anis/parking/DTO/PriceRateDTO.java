package com.anis.parking.DTO;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PriceRateDTO {

    @ApiModelProperty(required = false , hidden = true)
    private  Long id;

    @ApiModelProperty(required = true , hidden = false)
    private Long hourRate;

    @ApiModelProperty(required = true , hidden = false)
    private Long dayRate;

    @ApiModelProperty(required = true , hidden = false)
    private Long monthRate;
}
