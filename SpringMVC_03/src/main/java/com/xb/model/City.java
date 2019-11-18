package com.xb.model;

public class City {

    private Integer ID;
    private String name;

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
