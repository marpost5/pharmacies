package com.example.pharmacies.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "apteka")
public class Pharmacy {
    @Id
    Long id;
    String name;
    String location;
    String workingTime;
    Double lon;
    Double lat;
    String phoneNumber;

    public Pharmacy(String name, String location, String workingTime, Double lon, Double lat, String phoneNumber) {

        this.name = name;
        this.location = location;
        this.workingTime = workingTime;
        this.lon = lon;
        this.lat = lat;
        this.phoneNumber = phoneNumber;
    }

    public Pharmacy() {

    }
}
