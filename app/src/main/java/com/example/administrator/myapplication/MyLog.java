package com.example.administrator.myapplication;

import android.util.Log;

/**
 * Created by Administrator on 2016/12/3 0003.
 */

public class MyLog {
    private volatile static MyLog instatnce;
    private MyLog(){

    }
    public static MyLog getInstatnce(){
        if(instatnce == null){
            synchronized (MyLog.class){
                if(instatnce == null){
                    instatnce = new MyLog();
                    return instatnce;
                }
            }
        }
        return instatnce;
    }
    public void i(String tag,String msg){
        if(BuildConfig.showLog) {
            Log.i(tag, msg);
        }
    }
}
