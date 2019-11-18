package com.fly.model;

import lombok.Data;

import java.util.Date;
@Data
public class FPassenger {
    private Integer id;

    private String code;

    private Integer relationId;

    private String flightNo;

    private String name;

    private String idNumber;

    private String tel;

    private Boolean sex;

    private String email;

    private Boolean isVip;

    private String seat;

    private String cabin;

    private String voyage;

    private Date checkTime;

    private String checkCounter;

    private Date securityTime;

    private String securityChannel;

    private Date boardingTime;

    private String peer;

    private String recentTakeoffFlight;

    private Integer recentTakeoffTime;

    private String destination;

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

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo == null ? null : flightNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin == null ? null : cabin.trim();
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage == null ? null : voyage.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckCounter() {
        return checkCounter;
    }

    public void setCheckCounter(String checkCounter) {
        this.checkCounter = checkCounter == null ? null : checkCounter.trim();
    }

    public Date getSecurityTime() {
        return securityTime;
    }

    public void setSecurityTime(Date securityTime) {
        this.securityTime = securityTime;
    }

    public String getSecurityChannel() {
        return securityChannel;
    }

    public void setSecurityChannel(String securityChannel) {
        this.securityChannel = securityChannel == null ? null : securityChannel.trim();
    }

    public Date getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(Date boardingTime) {
        this.boardingTime = boardingTime;
    }

    public String getPeer() {
        return peer;
    }

    public void setPeer(String peer) {
        this.peer = peer == null ? null : peer.trim();
    }

    public String getRecentTakeoffFlight() {
        return recentTakeoffFlight;
    }

    public void setRecentTakeoffFlight(String recentTakeoffFlight) {
        this.recentTakeoffFlight = recentTakeoffFlight == null ? null : recentTakeoffFlight.trim();
    }

    public Integer getRecentTakeoffTime() {
        return recentTakeoffTime;
    }

    public void setRecentTakeoffTime(Integer recentTakeoffTime) {
        this.recentTakeoffTime = recentTakeoffTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }
}