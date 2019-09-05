package com.androidwind.demo.sdk.api;

import com.androidwind.demo.sdk.business.bean.User;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface IUser {

    void addUser();

    User getUser(int uid);
}
