package com.fly.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fly.model.FFlightRecord;
import com.fly.service.FFlightRecordService;
import com.fly.util.AirLineInfo;
import com.fly.util.CityInfo;
import com.fly.util.DomesticAirline;
import com.fly.util.getDomesticAirlinesTimeString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class FlightRecordController {

    @Autowired
    private FFlightRecordService fFlightRecordService;


    @RequestMapping("FlightRecord_index")
    public String index(HttpServletRequest req){
        List<FFlightRecord> query = fFlightRecordService.query();
        for (FFlightRecord f : query) {
            System.out.println(f);
        }

        req.setAttribute("list",query);

        return "Flight-dynamics";
    }

    @RequestMapping("selectByPrimaryKey")
    public void selectByPrimaryKey(int id,HttpServletResponse resp){
        FFlightRecord fFlightRecord = fFlightRecordService.selectByPrimaryKey(id);
        System.out.println(fFlightRecord);
        Object o = JSONObject.toJSON(fFlightRecord);
        resp.setContentType("text/json;charset=utf-8");
        try {
            resp.getWriter().println(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("AirLineInfo")
    public void AirLineInfo(HttpServletResponse resp,String startCity,String lastCity,String theDate) throws UnsupportedEncodingException {


        List<AirLineInfo> domesticAirlinesTime = getDomesticAirlinesTimeString.getDomesticAirlinesTime(startCity, lastCity, theDate);
        System.out.println(domesticAirlinesTime);
        JSONArray objects = JSON.parseArray(domesticAirlinesTime.toString());

        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().print(objects);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
