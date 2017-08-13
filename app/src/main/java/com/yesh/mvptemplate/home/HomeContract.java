package com.yesh.mvptemplate.home;

import com.yesh.mvptemplate.BasePresenter;
import com.yesh.mvptemplate.BaseView;

/**
 * Created by yesh on 8/9/17.
 */

public interface HomeContract {

    interface View extends BaseView<Presenter> {

        void viewMethod1();

        void viewMethod2();
    }

    interface Presenter extends BasePresenter {

        void presenterMethod1();

        void presenterMethod2();
    }

}
