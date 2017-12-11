package com.hengsheng.googlemvpdemo.login.model;

/**
 * Created by zhangb on 2017/12/11/011.
 */

public interface LoginModel {

    interface onLoadDateListener {

        void onLoadDateStart();

        void onLoadDateFinish();
    }

    void getDate(onLoadDateListener onLoadDateListener);
}
