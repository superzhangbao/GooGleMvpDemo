package com.hengsheng.googlemvpdemo.taskdetail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.hengsheng.googlemvpdemo.R;

public class MainActivity extends AppCompatActivity implements TaskDetailContract.View{

    private Toolbar mToolbar;
    private TaskDetailContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new TaskDetailPresenter("asdsad",this);
    }

    @Override
    public void setPresenter(TaskDetailContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showMissingTask() {

    }

    @Override
    public void hideTitle() {

    }

    @Override
    public void showTitle(String title) {

    }

    @Override
    public void hideDescription(String description) {

    }

    @Override
    public void showCompletionStatus(boolean complete) {

    }

    @Override
    public void showEditTask(String taskId) {

    }

    @Override
    public void showTaskDeleted() {

    }

    @Override
    public void showTaskMarkedComplete() {

    }

    @Override
    public void showTaskMarkedActive() {

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
