package com.hengsheng.googlemvpdemo.login.model;

import android.os.SystemClock;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by zhangb on 2017/12/11/011.
 */

public class LoginModelImpl implements LoginModel{

    private static final String TAG = "LoginModelImpl";

    @Override
    public void getDate(final onLoadDateListener onLoadDateListener) {
        onLoadDateListener.onLoadDateStart();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SystemClock.sleep(3000);
//                Looper.prepare();
//                onLoadDateListener.onLoadDateFinish();
//                Looper.loop();
//            }
//        }).start();
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                SystemClock.sleep(3000);
                e.onComplete();
            }
        }).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG,"subscribe");
            }

            @Override
            public void onNext(Integer value) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                onLoadDateListener.onLoadDateFinish();
            }
        });
    }
}
