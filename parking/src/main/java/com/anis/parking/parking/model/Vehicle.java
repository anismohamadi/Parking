package com.anis.parking.parking.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity  //به وسیله ی entityدیتا تو دیتابیس ذخیره میشه
@Table(name= "vehicle")  // اسم جدولمون چی باشه
@Data  //این به حای ستر و گتر بود
public class Vehicle {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY) //ایدی تولید میکنه
    private  Long id;

    @NotNull
    @Column(name="vehicle_type")
    private  VehicleType vehicleType;

    @NotNull
    @Column (name="carCode", unique= true)
    private String carCode;

}
