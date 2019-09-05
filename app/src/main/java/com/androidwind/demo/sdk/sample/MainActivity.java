package com.androidwind.demo.sdk.sample;

import android.os.UserManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androidwind.demo.sdk.api.TinySDK;
import com.androidwind.demo.sdk.business.TinyUserManager;
import com.androidwind.demo.sdk.common.log.TinyLog;
import com.androidwind.demo.sdk.common.util.FileUtil;

public class MainActivity extends AppCompatActivity {

    TinyUserManager mTinyUserManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TinyLog.config()
                .setEnable(BuildConfig.DEBUG)
                .setLogLevel(TinyLog.LOG_I);

        //初始化SDK
        TinySDK.getInstance().initSDK("123456", 0);
        //获取user manager
        mTinyUserManager = (TinyUserManager) TinySDK.getInstance().getSDKManager("userManager");
    }

    public void ClickMe(View view) {
        mTinyUserManager.addUser();
    }
}
