package com.xb.controller;

import com.xb.model.News;
import com.xb.model.Product;
import com.xb.service.NewsService;
import com.xb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.weixin4j.spring.web.WeixinJieruController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TestController extends WeixinJieruController{


    @Autowired
    private NewsService newsService;

    @Autowired
    private ProductService productService;


    @RequestMapping("test")
    public String test(HttpServletRequest req){

        System.out.println("ok");
        List<News> newsList = newsService.getNewsList();
        req.setAttribute("newsList",newsList);
        List<Product> discountList = productService.getDiscountList();
        req.setAttribute("discountList",discountList);
        List<Product> hotList = productService.getHotList();
        req.setAttribute("hotList",hotList);

        return "index";
    }


    @RequestMapping("more")
    public String more(HttpServletRequest req){

        List<Product> productList = productService.getProductList();
        req.setAttribute("productList",productList);

        return "more";
    }

    @RequestMapping("unlook")
    public String unlook(HttpServletRequest req){

        List<Product> unlookList = productService.getUnlookList();
        req.setAttribute("unlookList",unlookList);

        return "unlook";
    }

    @RequestMapping("details")
    public String details(HttpServletRequest req,Integer id){

        Product productById = productService.getProductById(id);
        req.setAttribute("productById",productById);
        String typeById = productService.getTypeById(productById.getType());
        req.setAttribute("typeById",typeById);

        return "details";
    }


}
