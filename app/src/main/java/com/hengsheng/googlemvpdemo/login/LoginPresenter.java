package com.hengsheng.googlemvpdemo.login;

import com.hengsheng.googlemvpdemo.login.model.LoginModel;
import com.hengsheng.googlemvpdemo.login.model.LoginModelImpl;

/**
 * Created by zhangb on 2017/12/11/011.
 */

public class LoginPresenter implements LoginContract.Presenter, LoginModel.onLoadDateListener {

    private final LoginModel mLoginModel;
    private final LoginContract.View mLoginView;

    public LoginPresenter(LoginContract.View mLoginView) {
        this.mLoginModel = new LoginModelImpl();
        this.mLoginView = mLoginView;
        mLoginView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getDate() {
        mLoginModel.getDate(this);
    }

    @Override
    public void onLoadDateStart() {
        mLoginView.showTitle();
    }

    @Override
    public void onLoadDateFinish() {
        mLoginView.hideTitle();
    }
}
