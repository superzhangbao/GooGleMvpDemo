package com.hengsheng.googlemvpdemo.login;

import com.hengsheng.googlemvpdemo.BasePresenter;
import com.hengsheng.googlemvpdemo.BaseView;

/**
 * Created by zhangb on 2017/12/11/011.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {
        void showTitle();

        void hideTitle();

    }

    interface Presenter extends BasePresenter {
        void getDate();
    }
}
