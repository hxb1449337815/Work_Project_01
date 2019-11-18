package com.xb.model;


public class Product {

    private Integer id;
    private String name;
    private Double price;
    private Boolean hot;
    private Boolean discount;
    private Double cutprice;
    private String pic;
    private String remark;
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Product(String name, Double price, Boolean hot, Boolean discount, Double cutprice, String pic,String remark,Integer type) {
        this.name = name;
        this.price = price;
        this.hot = hot;
        this.discount = discount;
        this.cutprice = cutprice;
        this.pic = pic;
        this.remark=remark;
        this.type=type;
    }

    public Product() {
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
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getHot() {
        return hot;
    }

    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public Double getCutprice() {
        return cutprice;
    }

    public void setCutprice(Double cutprice) {
        this.cutprice = cutprice;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", hot=" + hot +
                ", discount=" + discount +
                ", cutprice=" + cutprice +
                ", pic='" + pic + '\'' +
                ", remark='" + remark + '\'' +
                ", type=" + type +
                '}';
    }
}


