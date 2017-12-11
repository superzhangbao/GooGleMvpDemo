package com.hengsheng.googlemvpdemo.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.hengsheng.googlemvpdemo.R;

public class LoginActivity extends AppCompatActivity  implements LoginContract.View {

    private static final String TAG = "LoginActivity";
    private LoginContract.Presenter mPresenter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mPresenter = new LoginPresenter(this);
        textView = findViewById(R.id.tv);
        mPresenter.getDate();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showTitle() {
        Toast.makeText(this,"showTitle",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideTitle() {
        Log.e(TAG,Thread.currentThread().getName());
        textView.setText("我结束了");
        Toast.makeText(this,"hideTitle",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
}
