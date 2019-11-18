package com.fly.service;

import com.fly.model.*;

import java.util.List;


public interface BasicDataService {

    List<FAircompanytBasicData> getCompanyList();
    List<FAircraftBasicData> getAirList();
    List<FAirportBasicData> getAirportList();
    List<FChannelBasicData> getChannelList();
    List<FCheckinBasicData> getCheckinList();
    List<FGateBasicData> getGateList();
    List<FPassenger> getPassengerList();
    List<FReasonBasicData> getReasonList();
    List<FRecBasicData> getReclList();
    List<FRunwayBasicData> getRunwayList();
    List<FSeatBasicData> getSeatList();
    List<FTaskBasicData> getTaskList();
    List<FTerminalBasicData> getTerminalList();
    List<FTurntableBasicData> getTurntableList();
    int nqBasicData(int id,String name);
    Object selectByPrimaryKey(Integer id,int num);

    //修改航空公司
    int nqByPrimaryKey(FAircompanytBasicData record);

}
