package com.hengsheng.googlemvpdemo.taskdetail;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by zhangb on 2017/12/11/011.
 */

public class TaskDetailPresenter implements TaskDetailContract.Presenter {

    private final TaskDetailContract.View mTaskDetailView;

    @Nullable
    private String mTaskId;

    public TaskDetailPresenter(@Nullable String taskId,
                               @NonNull TaskDetailContract.View taskDetailView) {
        mTaskId = taskId;
        mTaskDetailView = taskDetailView;
        mTaskDetailView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void editTask() {

    }

    @Override
    public void deleteTask() {

    }

    @Override
    public void completeTask() {

    }

    @Override
    public void activateTask() {

    }
}
