package com.fly.controller;

import com.alibaba.fastjson.JSONObject;
import com.fly.model.*;
import com.fly.service.BasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class BasicDataController {

    @Autowired
    private BasicDataService basicDataService;




    @RequestMapping("basicIndex")
    public String basicIndex(HttpServletRequest req){

        List<FAircompanytBasicData> companyList = basicDataService.getCompanyList();
        req.setAttribute("companyList",companyList);

        List<FAircraftBasicData> airList = basicDataService.getAirList();
        req.setAttribute("airList",airList);

        List<FAirportBasicData> airportList = basicDataService.getAirportList();
        req.setAttribute("airportList",airportList);

        List<FChannelBasicData> channelList = basicDataService.getChannelList();
        req.setAttribute("channelList",channelList);

        List<FCheckinBasicData> checkinList = basicDataService.getCheckinList();
        req.setAttribute("checkinList",checkinList);

        List<FGateBasicData> gateList = basicDataService.getGateList();
        req.setAttribute("gateList",gateList);

        List<FPassenger> passengerList = basicDataService.getPassengerList();
        req.setAttribute("passengerList",passengerList);

        List<FReasonBasicData> reasonList = basicDataService.getReasonList();
        req.setAttribute("reasonList",reasonList);

        List<FRecBasicData> reclList = basicDataService.getReclList();
        req.setAttribute("reclList",reclList);

        List<FRunwayBasicData> runwayList = basicDataService.getRunwayList();
        req.setAttribute("runwayList",runwayList);

        List<FSeatBasicData> seatList = basicDataService.getSeatList();
        req.setAttribute("seatList",seatList);

        List<FTaskBasicData> taskList = basicDataService.getTaskList();
        req.setAttribute("taskList",taskList);

        List<FTerminalBasicData> terminalList = basicDataService.getTerminalList();
        req.setAttribute("terminalList",terminalList);

        List<FTurntableBasicData> turntableList = basicDataService.getTurntableList();
        req.setAttribute("turntableList",turntableList);


        for (FTurntableBasicData fAircompanytBasicData : turntableList) {
            System.out.println(fAircompanytBasicData);
        }

        return "BD-maintenance";
    }


    @RequestMapping("deleteBasicData")
    public void deleteBasicData(int id,String name){

        int i = basicDataService.nqBasicData(id, name);
        System.out.println(i);

    }


    @RequestMapping("byId")
    public void byId(int id, int num,HttpServletResponse resp){

        Object objects = basicDataService.selectByPrimaryKey(id,num);

        Object o = JSONObject.toJSON(objects);
        System.out.println(objects);
        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().print(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("objectUpdate")
    public void objectUpdate(FAircompanytBasicData fAircompanytBasicData){
        System.out.println(fAircompanytBasicData);
        int i = basicDataService.nqByPrimaryKey(fAircompanytBasicData);
        System.out.println(i);
    }



}
