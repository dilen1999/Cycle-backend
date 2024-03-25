package com.example.CycleSharingSystemBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Station")
public class Station {
    private String Station_name;
    private String Location;
    private Integer Total_bikes;
    private Integer Capacity;

}
