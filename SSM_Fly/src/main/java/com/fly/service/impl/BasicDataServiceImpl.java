package com.fly.service.impl;

import com.fly.mapper.*;
import com.fly.model.*;
import com.fly.service.BasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicDataServiceImpl implements BasicDataService {

    @Autowired
    private FAircompanytBasicDataMapper fAircompanytBasicDataMapper;

    @Autowired
    private FAircraftBasicDataMapper fAircraftBasicDataMapper;

    @Autowired
    private FAirportBasicDataMapper fAirportBasicDataMapper;

    @Autowired
    private FChannelBasicDataMapper fChannelBasicDataMapper;

    @Autowired
    private FCheckinBasicDataMapper fCheckinBasicDataMapper;

    @Autowired
    private FGateBasicDataMapper fGateBasicDataMapper;

    @Autowired
    private FPassengerMapper fPassengerMapper;

    @Autowired
    private FReasonBasicDataMapper fReasonBasicDataMapper;

    @Autowired
    private FRecBasicDataMapper fRecBasicDataMapper;

    @Autowired
    private FRunwayBasicDataMapper fRunwayBasicDataMapper;

    @Autowired
    private FSeatBasicDataMapper fSeatBasicDataMapper;

    @Autowired
    private FTaskBasicDataMapper fTaskBasicDataMapper;

    @Autowired
    private FTerminalBasicDataMapper fTerminalBasicDataMapper;

    @Autowired
    private FTurntableBasicDataMapper fTurntableBasicDataMapper;

    @Autowired
    private FAdminLogMapper fAdminLogMapper;


    @Override
    public List<FAircompanytBasicData> getCompanyList() {
        return fAircompanytBasicDataMapper.getList();
    }

    @Override
    public List<FAircraftBasicData> getAirList() {
        return fAircraftBasicDataMapper.getList();
    }

    @Override
    public List<FAirportBasicData> getAirportList() {
        return fAirportBasicDataMapper.getAirportList();
    }

    @Override
    public List<FChannelBasicData> getChannelList() {
        return fChannelBasicDataMapper.getChannelList();
    }

    @Override
    public List<FCheckinBasicData> getCheckinList() {
        return fCheckinBasicDataMapper.getCheckinList();
    }

    @Override
    public List<FGateBasicData> getGateList() {
        return fGateBasicDataMapper.getGateList();
    }

    @Override
    public List<FPassenger> getPassengerList() {
        return fPassengerMapper.getPassengerList();
    }

    @Override
    public List<FReasonBasicData> getReasonList() {
        return fReasonBasicDataMapper.getReasonList();
    }

    @Override
    public List<FRecBasicData> getReclList() {
        return fRecBasicDataMapper.getReclList();
    }

    @Override
    public List<FRunwayBasicData> getRunwayList() {
        return fRunwayBasicDataMapper.getRunwayList();
    }

    @Override
    public List<FSeatBasicData> getSeatList() {
        return fSeatBasicDataMapper.getSeatList();
    }

    @Override
    public List<FTaskBasicData> getTaskList() {
        return fTaskBasicDataMapper.getTaskList();
    }

    @Override
    public List<FTerminalBasicData> getTerminalList() {
        return fTerminalBasicDataMapper.getTerminalList();
    }

    @Override
    public List<FTurntableBasicData> getTurntableList() {
        return fTurntableBasicDataMapper.getTurntableList();
    }

    @Override
    public int nqBasicData(int id, String name) {
        return fAdminLogMapper.nqBasicData(id,name);
    }

    @Override
    public Object selectByPrimaryKey(Integer id, int num) {

        Object o=null;

        if (num==1){
            o=fAircompanytBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==2) {
            o=fAircraftBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==3){
            o=fAirportBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==4){
            o=fChannelBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==5){
            o=fCheckinBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==6){
            o=fGateBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==7){
            o=fPassengerMapper.selectByPrimaryKey(id);
        }else if(num==8){
            o=fPassengerMapper.selectByPrimaryKey(id);
        }else if(num==9){
            o=fReasonBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==10){
            o=fRecBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==11){
            o=fRunwayBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==12){
            o=fSeatBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==13){
            o=fTaskBasicDataMapper.selectByPrimaryKey(id);
        }else if(num==14){
            o=fTerminalBasicDataMapper.selectByPrimaryKey(id);
        }else{
            o=fTurntableBasicDataMapper.selectByPrimaryKey(id);
        }

        return o;
    }

    @Override
    public int nqByPrimaryKey(FAircompanytBasicData record) {
        return fAircompanytBasicDataMapper.updateByPrimaryKey(record);
    }


}
