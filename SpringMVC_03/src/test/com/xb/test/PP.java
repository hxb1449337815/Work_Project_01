package com.xb.test;

import net.sf.json.JSONObject;

import java.net.URLEncoder;
import java.util.Date;

public class PP {

    public static String excute(String province,String city,String county){
        String url=//此处以返回json格式数据示例,所以format=2,以根据城市名称为例,cityName传入中文
                "https://wis.qq.com/weather/common?source=pc&weather_type=observe&province="+province+"&city="+city+"&county="+county+"&_="+new Date().getTime();
        return PureNetUtil.get(url);//通过工具类获取返回数据
    }


    public static JSONObject GetTodayTemperatureByCity(String province,String city,String county) {
        String result=excute(province,city,county);
        return JSONObject.fromObject(result);
    }


    public static void main(String[] args) {

        JSONObject jsonObject = GetTodayTemperatureByCity("陕西","汉中","镇巴");
        jsonObject=JSONObject.fromObject(JSONObject.fromObject(jsonObject.getString("data")).getString("observe"));

        System.out.println(jsonObject);
    }


}
