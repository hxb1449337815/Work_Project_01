package com.fly.model;


import lombok.Data;

@Data
public class FAirportBasicData {
    private Integer id;

    private String code;

    private String name;

    private String routeAbb;

    private String enAbb;

    private String attribute;

    private String threeCode;

    private String fourCode;

    private String city;

    private String level;

    private String address;

    private String tel;

    private String province;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRouteAbb() {
        return routeAbb;
    }

    public void setRouteAbb(String routeAbb) {
        this.routeAbb = routeAbb == null ? null : routeAbb.trim();
    }

    public String getEnAbb() {
        return enAbb;
    }

    public void setEnAbb(String enAbb) {
        this.enAbb = enAbb == null ? null : enAbb.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getThreeCode() {
        return threeCode;
    }

    public void setThreeCode(String threeCode) {
        this.threeCode = threeCode == null ? null : threeCode.trim();
    }

    public String getFourCode() {
        return fourCode;
    }

    public void setFourCode(String fourCode) {
        this.fourCode = fourCode == null ? null : fourCode.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}