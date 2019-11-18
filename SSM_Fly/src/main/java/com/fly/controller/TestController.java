package com.fly.controller;

import com.fly.model.FFlightRecord;
import com.fly.service.FAdmimService;
import com.fly.service.FFlightRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private FAdmimService fAdminLogService;
    @Autowired
    private FFlightRecordService fFlightRecordService;

    @RequestMapping("test")
    public String test(){

        System.out.println("");

        return "index";
    }


    @RequestMapping("index")
    public ModelMap index(){
        ModelMap map=new ModelMap();
        List<FFlightRecord> query = fFlightRecordService.query();
        for (FFlightRecord f : query) {
            System.out.println(f);
        }

        map.addAttribute("msg",query);
        return map;
    }

}
