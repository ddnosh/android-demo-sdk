package com.androidwind.demo.sdk.api;

import android.text.TextUtils;

import com.androidwind.demo.sdk.business.TinyCarManager;
import com.androidwind.demo.sdk.business.TinyUserManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class TinySDK {

    private Map<String, Object> mManagerCache = null;

    private static volatile TinySDK sInstance = null;

    private TinySDK() {
        mManagerCache = new HashMap<>();
    }

    public static TinySDK getInstance() {
        if (sInstance == null) {
            synchronized (TinySDK.class) {
                if (sInstance == null) {
                    sInstance = new TinySDK();
                }
            }
        }
        return sInstance;
    }

    public synchronized void initSDK(String appId, int type) {

        switch (type) {
            case 0:
                mManagerCache.put("userManager", new TinyUserManager());
                break;
            case 1:
                mManagerCache.put("userManager", new TinyUserManager());
                mManagerCache.put("carManager", new TinyCarManager());
                break;
            default:

                break;
        }
    }

    public Object getSDKManager(String managerName) {
        if (TextUtils.isEmpty(managerName)) {
            throw new IllegalArgumentException("empty manager name!");
        }
        Object obj = mManagerCache.get(managerName);
        if (obj == null) {
            throw new IllegalArgumentException("illegal manager name!");
        } else {
            return obj;
        }
    }
}
