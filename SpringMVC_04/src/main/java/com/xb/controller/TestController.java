package com.xb.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TestController {

    @RequestMapping("upload")
    public String upload(MultipartFile multipartFile, HttpServletRequest req){

        //获取保存路径
        String path = req.getServletContext().getRealPath("/");

        String ext = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));

        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMDDHHmmssSSSS");
        String fileName = sdf.format(new Date());

        String filePath=path+"upload/"+fileName+ext;

        File f=new File(filePath);

        try {
            FileUtils.copyInputStreamToFile(multipartFile.getInputStream(),f);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "index";
    }

    @RequestMapping("downLoad")
    public ResponseEntity<byte[]> downLoad(String fileName){
        System.out.println(fileName);
        File f=new File("F:\\哈哈哈\\"+fileName);
        boolean directory = f.isDirectory();
        if (directory){
            return null;
        }
        byte[] b=null;
        try {
            InputStream fis=new FileInputStream(f);
            b=new byte[fis.available()];
            fis.read(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpHeaders hh=new HttpHeaders();
        hh.setContentDispositionFormData("attchement",f.getName());
        hh.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        ResponseEntity<byte[]> re=new ResponseEntity<>(b,hh, HttpStatus.OK);
        return re;
    }

    @RequestMapping("getFileList")
    public String getFileList(ModelMap map){

        File f=new File("F:\\哈哈哈");
        File[] files = f.listFiles();
        map.addAttribute("files",files);
        return "list";
    }




}
