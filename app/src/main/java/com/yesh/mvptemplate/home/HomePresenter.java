package com.yesh.mvptemplate.home;

import android.util.Log;

/**
 * Created by yesh on 8/9/17.
 */

public class HomePresenter implements HomeContract.Presenter {

    private final HomeContract.View homeView;

    public HomePresenter(HomeContract.View mView) {
        homeView = mView;
        homeView.setPresenter(this);
    }

    @Override
    public void start() {
        Log.d("yesh","HomePresenter---- start called");
    }

    @Override
    public void presenterMethod1() {
        Log.d("yesh ","HomePresenter---- presenterMethod1 called");
        homeView.viewMethod2();
    }

    @Override
    public void presenterMethod2() {
        Log.d("yesh ","HomePresenter---- presenterMethod2 called");
    }
}
