package com.androidwind.demo.sdk.business;

import com.androidwind.demo.sdk.api.ICar;
import com.androidwind.demo.sdk.business.bean.Car;
import com.androidwind.demo.sdk.common.log.TinyLog;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TinyCarManager implements ICar {

    private String TAG = "TinyCarManager";
    @Override
    public void addCar() {
        TinyLog.i(TAG, "add a user.");
    }

    @Override
    public Car getCar() {
        return null;
    }
}
