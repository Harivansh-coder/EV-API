package com.assignment.harivansh.crudev.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ev_station")
public class EvStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "station_name")
    private String stationName;
    @Column(name = "station_image")
    private int stationImage;
    @Column(name = "station_pricing")
    private long stationPricing;
    @Column(name = "station_address")
    private String stationAddress;
}
