package com.fly.model;

import lombok.Data;

import java.util.Date;
@Data
public class FFlightReportWeekly {
    private Integer id;

    private Integer day;

    private Integer flights;

    private Integer passengers;

    private Integer cargoWeight;

    private Boolean rtype;

    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getFlights() {
        return flights;
    }

    public void setFlights(Integer flights) {
        this.flights = flights;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    public Integer getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Integer cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public Boolean getRtype() {
        return rtype;
    }

    public void setRtype(Boolean rtype) {
        this.rtype = rtype;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}