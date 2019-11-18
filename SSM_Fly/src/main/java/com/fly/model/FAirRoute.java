package com.fly.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class FAirRoute {
    private Integer id;

    private String airportStart;

    private String airportEnd;

    private String airportEndSpare;

    private BigDecimal mileage;

    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirportStart() {
        return airportStart;
    }

    public void setAirportStart(String airportStart) {
        this.airportStart = airportStart == null ? null : airportStart.trim();
    }

    public String getAirportEnd() {
        return airportEnd;
    }

    public void setAirportEnd(String airportEnd) {
        this.airportEnd = airportEnd == null ? null : airportEnd.trim();
    }

    public String getAirportEndSpare() {
        return airportEndSpare;
    }

    public void setAirportEndSpare(String airportEndSpare) {
        this.airportEndSpare = airportEndSpare == null ? null : airportEndSpare.trim();
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}