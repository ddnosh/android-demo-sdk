package com.androidwind.demo.sdk.business.bean;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class User {

    private String name;

    private int uid;

    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
