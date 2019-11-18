package com.ssm.util;

import net.sf.json.JSONObject;

import java.util.Date;

public class PP {

    public String excute(String province,String city,String county){
        String url=//此处以返回json格式数据示例,所以format=2,以根据城市名称为例,cityName传入中文
                //"https://wis.qq.com/weather/common?source=pc&weather_type=observe&province="+province+"&city="+city+"&county="+county+"&_="+new Date().getTime();
                "https://flights.ctrip.com/process/FlightStatus/FindByCityWithJson?from=KHN&to=BJS&date=20191008&searchKey=43072875EFACE0A4F93DC3C7692D57C2534FB2E1F134F003BAEA0F94947D6056D6F93C1DFA715C75";
        System.out.println(url);
        return new PureNetUtil().get(url);//通过工具类获取返回数据
    }

    public String excute(){
        String url=//此处以返回json格式数据示例,所以format=2,以根据城市名称为例,cityName传入中文
                "http://ws.webxml.com.cn/webservices/DomesticAirline.asmx/getDomesticCity";
        System.out.println(url);
        return new PureNetUtil().get(url);//通过工具类获取返回数据
    }


    public JSONObject GetTodayTemperatureByCity(String province,String city,String county) {
        String result=excute(province,city,county);
        return JSONObject.fromObject(result);
    }


    /*public static void main(String[] args) {

        JSONObject jsonObject = GetTodayTemperatureByCity("陕西","汉中","镇巴");
        jsonObject=JSONObject.fromObject(JSONObject.fromObject(jsonObject.getString("data")).getString("observe"));

        System.out.println(jsonObject);
    }*/


}
