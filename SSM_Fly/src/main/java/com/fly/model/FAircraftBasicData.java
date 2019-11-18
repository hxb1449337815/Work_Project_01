package com.fly.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FAircraftBasicData {
    private Integer id;

    private String code;

    private String no;

    private String model;

    private String company;

    private String attribute;

    private String twoCode;

    private BigDecimal wingspan;

    private BigDecimal length;

    private BigDecimal height;

    private Integer maxSeat;

    private BigDecimal cargo;

    private BigDecimal takeoffWeight;

    private BigDecimal maxRange;

    private BigDecimal maxFuel;

    private String runway;

    private String aircraftType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getTwoCode() {
        return twoCode;
    }

    public void setTwoCode(String twoCode) {
        this.twoCode = twoCode == null ? null : twoCode.trim();
    }

    public BigDecimal getWingspan() {
        return wingspan;
    }

    public void setWingspan(BigDecimal wingspan) {
        this.wingspan = wingspan;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Integer getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(Integer maxSeat) {
        this.maxSeat = maxSeat;
    }

    public BigDecimal getCargo() {
        return cargo;
    }

    public void setCargo(BigDecimal cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getTakeoffWeight() {
        return takeoffWeight;
    }

    public void setTakeoffWeight(BigDecimal takeoffWeight) {
        this.takeoffWeight = takeoffWeight;
    }

    public BigDecimal getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(BigDecimal maxRange) {
        this.maxRange = maxRange;
    }

    public BigDecimal getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(BigDecimal maxFuel) {
        this.maxFuel = maxFuel;
    }

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway == null ? null : runway.trim();
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType == null ? null : aircraftType.trim();
    }
}