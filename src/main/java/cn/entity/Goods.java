package cn.entity;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private Integer id;
    private Integer typeId;
    private String goodsName;
    private String intorduce;
    private Double price;
    private Double nowPrice;
    private String picture;
    private Date inTime;
    private Integer newGoods;
    private Integer sale;
    private Integer hit;

    public Goods() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getIntorduce() {
        return intorduce;
    }

    public void setIntorduce(String intorduce) {
        this.intorduce = intorduce;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(Double nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Integer getNewGoods() {
        return newGoods;
    }

    public void setNewGoods(Integer newGoods) {
        this.newGoods = newGoods;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }
}
