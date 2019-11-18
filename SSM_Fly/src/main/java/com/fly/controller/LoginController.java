package com.fly.controller;

import com.fly.model.FAdmin;
import com.fly.model.FAdminRole;
import com.fly.model.FMenu;
import com.fly.service.FAdmimService;
import com.fly.util.MenuLsitUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private FAdmimService fAdminService;



    @RequestMapping("login")
    public String login(FAdmin user, HttpServletRequest req, HttpServletResponse resp){

        //System.out.println(user);

        FAdmin login = fAdminService.login(user);

        if (login==null){
            System.out.println("用户不存在");
            return  "Login";
        }else{
            req.getSession().setAttribute("user",login);
            List<FAdminRole> roles = login.getRoles();
            List<FMenu> menuList=new ArrayList<FMenu>();
            for (FAdminRole role : roles) {
                List<FMenu> menus = role.getMenus();
                for (FMenu menu : menus) {
                    menuList.add(menu);
                }
            }


            menuList=MenuLsitUtil.forPmenu(menuList);
            req.getSession().setAttribute("menuList",menuList);


            return "index";
        }
    }



}
