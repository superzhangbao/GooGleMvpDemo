package com.hengsheng.googlemvpdemo.taskdetail;

import com.hengsheng.googlemvpdemo.BasePresenter;
import com.hengsheng.googlemvpdemo.BaseView;

/**
 * Created by zhangb on 2017/12/11/011.
 * 契约类
 */

public interface TaskDetailContract {

    /**
     * 继承BaseView并传入Presenter
     */
    interface View extends BaseView<Presenter> {
        void setLoadingIndicator(boolean active);

        void showMissingTask();

        void hideTitle();

        void showTitle(String title);

        void hideDescription(String description);

        void showCompletionStatus(boolean complete);

        void showEditTask(String taskId);

        void showTaskDeleted();

        void showTaskMarkedComplete();

        void showTaskMarkedActive();

        boolean isActive();
    }

    /**
     * 继承BasePresenter
     */
    interface Presenter extends BasePresenter {
        void editTask();

        void deleteTask();

        void completeTask();

        void activateTask();
    }
}
