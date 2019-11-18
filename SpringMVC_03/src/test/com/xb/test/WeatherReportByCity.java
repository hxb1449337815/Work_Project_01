package com.xb.test;

import net.sf.json.JSONObject;


/**
 * 根据城市名/id查询天气
 * @author silk
 *
 */
public class WeatherReportByCity {
    /**
     * 根据城市名获取
     * @param cityName
     * @return
     */
    public static String excute(String cityName){
        String url=//此处以返回json格式数据示例,所以format=2,以根据城市名称为例,cityName传入中文
                "http://v.juhe.cn/weather/index?cityname="+cityName+"&dtype=&format=&key=77d4801bf2136c6794b7ecc0f4ff7801";
        return PureNetUtil.get(url);//通过工具类获取返回数据
    }
    /**
     * 获取返回数据中的一个属性示例,此处以获取今日温度为例
     * "temperature": "8℃~20℃"     今日温度
     * @param
     * @return
     */
    public static JSONObject GetTodayTemperatureByCity(String city) {
        String result=excute(city);
        if(result!=null){
            JSONObject obj=JSONObject.fromObject(result);
            /*获取返回状态码*/
            result=obj.getString("resultcode");
            /*如果状态码是200说明返回数据成功*/
            if(result!=null&&result.equals("200")){
                result=obj.getString("result");
                //此时result中数据有多个key,可以对其key进行遍历,得到对个属性
                obj=JSONObject.fromObject(result);
                //今日温度对应的key是today
                result=obj.getString("today");
                obj=JSONObject.fromObject(result);
                //今日温度对应当key是temperature
                result=obj.getString("temperature");
                return obj;
            }
        }
        result="{code:\"查询失败\"}";
        return JSONObject.fromObject(result);
    }
    public static void main(String[] args) {
        JSONObject object = GetTodayTemperatureByCity("长沙");
        System.out.println(object);
    }
}
