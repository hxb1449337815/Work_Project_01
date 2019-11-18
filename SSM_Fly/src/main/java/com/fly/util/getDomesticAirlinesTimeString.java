package com.fly.util;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpProtocolParams;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class getDomesticAirlinesTimeString {

    public static String post(String startCity,String lastCity,String theDate) {
        Map<String, String> param=null;
        String url="http://www.webxml.com.cn/webservices/DomesticAirline.asmx/getDomesticAirlinesTime?startCity="+startCity+"&lastCity="+lastCity+"&theDate="+theDate+"&userID=";
        HttpURLConnection conn = null;
        try {
            URL u = new URL(url);
            conn = (HttpURLConnection) u.openConnection();
            StringBuffer sb = null;
            if (param != null) {// 如果请求参数不为空
                sb = new StringBuffer();
                /*
                 * A URL connection can be used for input and/or output. Set the
                 * DoOutput flag to true if you intend to use the URL connection
                 * for output, false if not. The default is false.
                 */
                // 默认为false,post方法需要写入参数,设定true
                conn.setDoOutput(true);
                // 设定post方法,默认get
                conn.setRequestMethod("POST");
                // 获得输出流
                OutputStream out = conn.getOutputStream();
                // 对输出流封装成高级输出流
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
                // 将参数封装成键值对的形式
                for (Map.Entry<String, String> s : param.entrySet()) {
                    sb.append(s.getKey()).append("=").append(s.getValue()).append("&");
                }
                // 将参数通过输出流写入
                writer.write(sb.deleteCharAt(sb.toString().length() - 1).toString());
                writer.close();// 一定要关闭,不然可能出现参数不全的错误
                sb = null;
            }
            conn.connect();// 建立连接
            sb = new StringBuffer();
            // 获取连接状态码
            int recode = conn.getResponseCode();
            BufferedReader reader = null;
            if (recode == 200) {
                // Returns an input stream that reads from this open connection
                // 从连接中获取输入流
                InputStream in = conn.getInputStream();
                // 对输入流进行封装
                reader = new BufferedReader(new InputStreamReader(in));
                String str = null;
                sb = new StringBuffer();
                // 从输入流中读取数据
                while ((str = reader.readLine()) != null) {
                    sb.append(str).append(System.getProperty("line.separator"));
                }
                // 关闭输入流
                reader.close();
                if (sb.toString().length() == 0) {
                    return null;
                }
                return sb.toString().substring(0,
                        sb.toString().length() - System.getProperty("line.separator").length());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (conn != null)// 关闭连接
                conn.disconnect();
        }
        return null;
    }


    public static List<AirLineInfo> getDomesticAirlinesTime(String startCity,String lastCity,String theDate){

        String post = post(startCity, lastCity, theDate);

        return getDomesticAirlinesTime(post);
    }



    public static List<AirLineInfo> getDomesticAirlinesTimeString(String startCity , String lastCity, String theDate, String userID) throws Exception{
        String url = "/webservices/DomesticAirline.asmx/getDomesticAirlinesTime";
        String host = "www.webxml.com.cn";
        String param = "startCity="+ URLEncoder.encode(startCity, "utf-8")+"&lastCity="+URLEncoder.encode(lastCity, "utf-8")+"&theDate="+theDate+"+&userID="+userID+"";
        HttpClient httpclient = new DefaultHttpClient();
        httpclient.getParams().setParameter(HttpProtocolParams.HTTP_CONTENT_CHARSET,"UTF-8");

        HttpGet httpget = new HttpGet("http://"+host+url+"?"+param);

        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String responseBody = httpclient.execute(httpget, responseHandler);
//              System.out.println(responseBody);
        List<AirLineInfo> airList = getDomesticAirlinesTime(responseBody);
        httpclient.getConnectionManager().shutdown();
        return airList;

    }
    //解析xml字符串
    /**
     *
     * @param xmlString 需要解析的xml字符串,也即xml中的字符串
     * @return
     */
    @SuppressWarnings("all")
    private static List<AirLineInfo>  getDomesticAirlinesTime (String xmlString) {
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
        List<AirLineInfo> list=new ArrayList<AirLineInfo>();
        // 遍历diffgram节点
        while (iter.hasNext()) {
            // 获取第一个diffgram节点
            Element empEle = (Element) iter.next();
            //           System.out.println("<" + empEle.getName() + ">");
            //获取Airlines节点
            Iterator elementIterator = empEle.elementIterator("Airlines");
            while (elementIterator.hasNext()) {
                Element object = (Element) elementIterator.next();
                Iterator airlinesTimes = object.elementIterator("AirlinesTime");
                //创建AirLineInfo对象
                AirLineInfo air=null;
                while (airlinesTimes.hasNext()) {
                    air=new AirLineInfo();
                    //循环遍历出了每一个AirlinesTime元素
                    Element airlinesTime = (Element) airlinesTimes.next();
//                          System.out.println(airlinesTime.getName());
                    Iterator everyElement = airlinesTime.elementIterator();
                    int count=1;
                    while (everyElement.hasNext()) {
                        Element every = (Element) everyElement.next();
//                              Item(Company)航空公司、
//                              Item(AirlineCode)航班号、
//                              Item(StartDrome)出发机场、
//                              Item(ArriveDrome)到达机场、
//                              Item(StartTime)出发时间、
//                              Item(ArriveTime)到达时间、
//                              Item(Mode)机型、
//                              Item(AirlineStop)经停
//                              、Item(Week)飞行周期（星期）
                        if(count==1){
                            air.setCompany(every.getStringValue());
                        }else if (count==2) {
                            air.setAirlineCode(every.getStringValue());
                        }else if (count==3) {
                            air.setStartDrome(every.getStringValue());
                        }else if (count==4) {
                            air.setArriveDrome(every.getStringValue());
                        }else if (count==5) {
                            air.setStartTime(every.getStringValue());
                        }else if (count==6) {
                            air.setArriveTime(every.getStringValue());
                        }else if (count==7) {
                            air.setMode(every.getStringValue());
                        }else if (count==8) {
                            air.setAirlineStop(every.getStringValue());
                        }else if (count==9) {
                            air.setWeek(every.getStringValue());
                        }
//                              System.out.println(every.getStringValue());
                        count++;
                    }
                    //把对象添加到集合中
                    list.add(air);
                    //保证count为 1~6
                    count=1;
                }
            }
        }
        //循环遍历list集合
//              for (AirLineInfo airLineInfo : list) {
//                  System.out.println(airLineInfo);
//              }
        return list;
    }

}
