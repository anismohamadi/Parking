package com.anis.parking.parking.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name= "parking")
@Data
public class Parking {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY) //ایدی تولید میکنه
    private  Long id;


    @NotNull
    @Column(name="entry_Time")
    private Date entryTime;


    @NotNull
    @Column(name="exit_time")
    private  Date exitTime;

    @NotNull
    @Column(name="final_price")
    private Long finalPrice;


}
