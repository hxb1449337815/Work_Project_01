package com.fly.model;

import lombok.Data;

import java.util.Date;
@Data
public class FFlightStream {
    private Integer id;

    private String flightNo;

    private Integer airlineId;

    private String airlineCompany;

    private Date planTakeTime;

    private Date planLandTime;

    private Date realTakeTime;

    private Date realLandTime;

    private Date blockTime;

    private Date removeTime;

    private String park;

    private Date bridgesTime;

    private Date removeBridgesTime;

    private String delayRemark;

    private Integer delayTime;

    private String abnormalRemark;

    private String terminal;

    private String gate;

    private String luggageTurntable;

    private Date doorOpenTime;

    private Date doorCloseTime;

    private Date cargodoorOpenTime;

    private Date cargodoorCloseTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo == null ? null : flightNo.trim();
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

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park == null ? null : park.trim();
    }

    public Date getBridgesTime() {
        return bridgesTime;
    }

    public void setBridgesTime(Date bridgesTime) {
        this.bridgesTime = bridgesTime;
    }

    public Date getRemoveBridgesTime() {
        return removeBridgesTime;
    }

    public void setRemoveBridgesTime(Date removeBridgesTime) {
        this.removeBridgesTime = removeBridgesTime;
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

    public String getAbnormalRemark() {
        return abnormalRemark;
    }

    public void setAbnormalRemark(String abnormalRemark) {
        this.abnormalRemark = abnormalRemark == null ? null : abnormalRemark.trim();
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal == null ? null : terminal.trim();
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