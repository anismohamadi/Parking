package com.anis.parking.parking.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="PriceRate")
@Data

public class PriceRate {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY) //ایدی تولید میکنه
    private  Long id;

    @NotNull
    @Column(name="hour_rate")
    private Date hourRate;

    @NotNull
    @Column(name="day_rate")
    private Date dayRate;

    @NotNull
    @Column(name="month_rate")
    private Date monthRate;




}
