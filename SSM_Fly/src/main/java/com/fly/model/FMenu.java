package com.fly.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FMenu {
    private Integer id;

    private String name;

    private String url;

    private Integer pid;

    private List<FMenu> children=null;

    private String icon;


    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<FMenu> getChildren() {
        return children;
    }

    public void setChildren(List<FMenu> children) {
        this.children = children;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}