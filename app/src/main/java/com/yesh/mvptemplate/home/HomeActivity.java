package com.yesh.mvptemplate.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.yesh.mvptemplate.R;

/**
 * Created by yesh on 8/9/17.
 */

public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    private HomePresenter homePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homePresenter = new HomePresenter(this);
        viewMethod1();
//        viewMethod2();
    }

    @Override
    public void setPresenter(HomeContract.Presenter basePresenter) {
    }

    @Override
    public void viewMethod1() {
        Log.d("yesh ","HomeActivity---- viewMethod1 called");
        homePresenter.presenterMethod1();
//        homePresenter.presenterMethod2();
    }

    @Override
    public void viewMethod2() {
        Log.d("yesh ","HomeActivity---- viewMethod2 called");
//        homePresenter.start();
    }
}
