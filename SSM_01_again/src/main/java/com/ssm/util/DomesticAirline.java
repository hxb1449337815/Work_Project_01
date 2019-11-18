package com.ssm.util;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class DomesticAirline  {



    @SuppressWarnings("all")
    public static List<CityInfo> getDomesticCityString () throws Exception{
        String url = "/webservices/DomesticAirline.asmx/getDomesticCity";
        String host = "www.webxml.com.cn";

        @SuppressWarnings("deprecation")
        HttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet("http://"+host+url+"");
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String responseBody = httpclient.execute(httpget, responseHandler);
        List<CityInfo> cityList = getDomesticCity(responseBody);
//              System.out.println(responseBody);
        httpclient.getConnectionManager().shutdown();
        return cityList;


    }
    @SuppressWarnings("all")
    private static List<CityInfo>  getDomesticCity(String xmlString) {
        // 使用 SAXReader 解析 XML
        SAXReader saxReader = new SAXReader();
        Document document = null;
        try {
            document =  DocumentHelper.parseText(xmlString);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        // 获取根节点
        Element root = document.getRootElement();
        // 打印节点名称
        //        System.out.println("<" + root.getName() + ">");

        // 获取根节点下的子节点遍历
        Iterator<?> iter = root.elementIterator("diffgram");
        //创建一个list集合用来存储获取到的信息
        Map<String, AirLineInfo> map=new HashMap<String, AirLineInfo>();
        List<CityInfo> list=new ArrayList<CityInfo>();
        // 遍历diffgram节点
        while (iter.hasNext()) {
            // 获取第一个diffgram节点
            Element empEle = (Element) iter.next();
            //           System.out.println("<" + empEle.getName() + ">");
            //获取Airlines节点
            Iterator elementIterator = empEle.elementIterator("Airline1");
            while (elementIterator.hasNext()) {
                Element object = (Element) elementIterator.next();
                Iterator airlinesTimes = object.elementIterator("Address");
                //创建CityInfo对象
                CityInfo city=null;
                while (airlinesTimes.hasNext()) {
                    city=new CityInfo();
                    //循环遍历出了每一个AirlinesTime元素
                    Element airlinesTime = (Element) airlinesTimes.next();
//                      System.out.println(airlinesTime.getName());
                    Iterator everyElement = airlinesTime.elementIterator();
                    int count=1;
                    while (everyElement.hasNext()) {
                        Element every = (Element) everyElement.next();
                        if(count==1){
                            city.setEnCityName(every.getStringValue());
                        }else if (count==2) {
                            city.setCnCityName(every.getStringValue());
                        }else if (count==3) {
                            city.setAbbreviation(every.getStringValue());
                        }
//                          System.out.println(every.getStringValue());
                        count++;
                    }
                    //把对象添加到集合中
                    list.add(city);
                    //保证count为 1~3
                    count=1;
                }
            }
        }
        return list;
    }

}
