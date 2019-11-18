package com.ssm.controller;


import com.ssm.mapper.StudentMapper;
import com.ssm.model.Student;
import com.ssm.util.PP;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@Controller
public class MainController {

    @RequestMapping("test")
    public String test(){
        System.out.println("ok");

        return "index";
    }

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("All")
    public String All(){
        for (Student s : studentMapper.selectAll()) {
            System.out.println(s);
        }


        return "index";
    }

    @RequestMapping("tq")
    private ModelMap tq(){
        ModelMap map=new ModelMap();
        PP p=new PP();

        JSONObject jsonObject = null;
        try {
            jsonObject = p.GetTodayTemperatureByCity(URLEncoder.encode("陕西", "utf-8"), URLEncoder.encode("汉中", "utf-8"), URLEncoder.encode("镇巴", "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //map.addAttribute("obj",jsonObject);
        System.out.println(jsonObject);
        return map;
    }




}
