package com.fly.util;

import com.fly.model.FMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuLsitUtil {

    public static List<FMenu> forPmenu(List<FMenu> menuList){
        List<FMenu> p=new ArrayList<FMenu>();
        for (FMenu fMenu : menuList) {
            if (fMenu.getPid()==0){
                //System.out.println(fMenu);
                fMenu.setChildren(forChildren(menuList,fMenu.getId()));
                p.add(fMenu);
            }
        }
        return p;
    }

    public static List<FMenu> forChildren(List<FMenu> menuList,int pid) {
        List<FMenu> children=new ArrayList<FMenu>();
        for (FMenu fMenu : menuList) {
            if (fMenu.getPid()!=0&&fMenu.getPid()==pid){
                fMenu.setChildren(forChildren(menuList,fMenu.getId()));
                children.add(fMenu);
            }
        }

        return children;
    }


}
