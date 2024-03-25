package com.example.CycleSharingSystemBackend.model;

import jakarta.persistence.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name= "Bikes")
public class Bikes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Bike_id;
    private String brand;
    private String bikeModel;
    private Long bike_code;
    private Date last_maintenance_date;
//    private String onRide;
//    private String currentLocation;
    private String color;


    @Transient
    private String formattedMaintenanceDate; // Transient field to hold formatted date

    @ManyToOne
    private Station station;
    public Long getBike_id() {
        return Bike_id;
    }

    public void setBike_id(Long bike_id) {
        Bike_id = bike_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public Long getBike_code() {
        return bike_code;
    }

    public void setBike_code(Long bike_code) {
        this.bike_code = bike_code;
    }

    public Date getLast_maintenance_date() {
        return last_maintenance_date;
    }

    public void setLast_maintenance_date(Date last_maintenance_date) {
        this.last_maintenance_date = last_maintenance_date;
    }

    public String getFormattedMaintenanceDate() {
        // Format the last maintenance date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        formattedMaintenanceDate = sdf.format(last_maintenance_date);
        return formattedMaintenanceDate;
    }

//    public String getOnRide() {
//        return onRide;
//    }

//    public void setOnRide(String onRide) {
//        this.onRide = onRide;
//    }

//    public String getCurrentLocation() {
//        return currentLocation;
//    }
//
//    public void setCurrentLocation(String currentLocation) {
//        this.currentLocation = currentLocation;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
