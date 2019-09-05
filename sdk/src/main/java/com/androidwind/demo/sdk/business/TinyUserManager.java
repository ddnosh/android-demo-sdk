package com.androidwind.demo.sdk.business;

import com.androidwind.demo.sdk.api.IUser;
import com.androidwind.demo.sdk.business.bean.User;
import com.androidwind.demo.sdk.common.log.TinyLog;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TinyUserManager implements IUser {

    private String TAG = "TinyCarManager";

    @Override
    public void addUser() {
        TinyLog.i(TAG, "add a car.");
    }

    @Override
    public User getUser(int uid) {
        return null;
    }
}
