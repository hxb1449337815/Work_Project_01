package com.fly.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FAdminRole {
    private Integer id;

    private String name;

    private String menuId;

    private Date addTime;

    private List<FMenu> menus;

    public List<FMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<FMenu> menus) {
        this.menus = menus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}