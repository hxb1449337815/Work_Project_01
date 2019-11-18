package com.fly.model;

import lombok.Data;

@Data
public class FSeatBasicData {
    private Integer id;

    private String code;

    private String number;

    private String model;

    private String attribute;

    private Integer lengt;

    private Integer breadth;

    private Integer type;

    private Integer states;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public Integer getLengt() {
        return lengt;
    }

    public void setLengt(Integer lengt) {
        this.lengt = lengt;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public void setBreadth(Integer breadth) {
        this.breadth = breadth;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }
}