package com.fly.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class FFlightRecord {
    private Integer id;

    private Integer code;

    private Date doDate;

    private String airCode;

    private String flightNo;

    private String no;

    private String nature;

    private String task;

    private String attribute;

    private String seat;

    private String gate;

    private String luggageTurntable;

    private Integer relationId;

    private Integer airlineId;

    private String airlineCompany;

    private String flightMission;

    private String flightAgent;

    private String airportStart;

    private String airportEnd;

    private String airportEndSpare;

    private Integer adultNum;

    private Integer childNum;

    private Integer babyNum;

    private Integer luggageNum;

    private BigDecimal cargoWeight;

    private Date planTakeTime;

    private Date planLandTime;

    private Date realTakeTime;

    private Date realLandTime;

    private Date blockTime;

    private Date removeTime;

    private String delayRemark;

    private Integer delayTime;

    private String terminal;

    private Date doorOpenTime;

    private Date doorCloseTime;

    private Date cargodoorOpenTime;

    private Date cargodoorCloseTime;

    private FAircraftBasicData fabd;

    public FAircraftBasicData getFabd() {
        return fabd;
    }

    public void setFabd(FAircraftBasicData fabd) {
        this.fabd = fabd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getDoDate() {
        return doDate;
    }

    public void setDoDate(Date doDate) {
        this.doDate = doDate;
    }

    public String getAirCode() {
        return airCode;
    }

    public void setAirCode(String airCode) {
        this.airCode = airCode == null ? null : airCode.trim();
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo == null ? null : flightNo.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate == null ? null : gate.trim();
    }

    public String getLuggageTurntable() {
        return luggageTurntable;
    }

    public void setLuggageTurntable(String luggageTurntable) {
        this.luggageTurntable = luggageTurntable == null ? null : luggageTurntable.trim();
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        this.airlineCompany = airlineCompany == null ? null : airlineCompany.trim();
    }

    public String getFlightMission() {
        return flightMission;
    }

    public void setFlightMission(String flightMission) {
        this.flightMission = flightMission == null ? null : flightMission.trim();
    }

    public String getFlightAgent() {
        return flightAgent;
    }

    public void setFlightAgent(String flightAgent) {
        this.flightAgent = flightAgent == null ? null : flightAgent.trim();
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

    public Integer getAdultNum() {
        return adultNum;
    }

    public void setAdultNum(Integer adultNum) {
        this.adultNum = adultNum;
    }

    public Integer getChildNum() {
        return childNum;
    }

    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

    public Integer getBabyNum() {
        return babyNum;
    }

    public void setBabyNum(Integer babyNum) {
        this.babyNum = babyNum;
    }

    public Integer getLuggageNum() {
        return luggageNum;
    }

    public void setLuggageNum(Integer luggageNum) {
        this.luggageNum = luggageNum;
    }

    public BigDecimal getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(BigDecimal cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public Date getPlanTakeTime() {
        return planTakeTime;
    }

    public void setPlanTakeTime(Date planTakeTime) {
        this.planTakeTime = planTakeTime;
    }

    public Date getPlanLandTime() {
        return planLandTime;
    }

    public void setPlanLandTime(Date planLandTime) {
        this.planLandTime = planLandTime;
    }

    public Date getRealTakeTime() {
        return realTakeTime;
    }

    public void setRealTakeTime(Date realTakeTime) {
        this.realTakeTime = realTakeTime;
    }

    public Date getRealLandTime() {
        return realLandTime;
    }

    public void setRealLandTime(Date realLandTime) {
        this.realLandTime = realLandTime;
    }

    public Date getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Date blockTime) {
        this.blockTime = blockTime;
    }

    public Date getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(Date removeTime) {
        this.removeTime = removeTime;
    }

    public String getDelayRemark() {
        return delayRemark;
    }

    public void setDelayRemark(String delayRemark) {
        this.delayRemark = delayRemark == null ? null : delayRemark.trim();
    }

    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal == null ? null : terminal.trim();
    }

    public Date getDoorOpenTime() {
        return doorOpenTime;
    }

    public void setDoorOpenTime(Date doorOpenTime) {
        this.doorOpenTime = doorOpenTime;
    }

    public Date getDoorCloseTime() {
        return doorCloseTime;
    }

    public void setDoorCloseTime(Date doorCloseTime) {
        this.doorCloseTime = doorCloseTime;
    }

    public Date getCargodoorOpenTime() {
        return cargodoorOpenTime;
    }

    public void setCargodoorOpenTime(Date cargodoorOpenTime) {
        this.cargodoorOpenTime = cargodoorOpenTime;
    }

    public Date getCargodoorCloseTime() {
        return cargodoorCloseTime;
    }

    public void setCargodoorCloseTime(Date cargodoorCloseTime) {
        this.cargodoorCloseTime = cargodoorCloseTime;
    }
}