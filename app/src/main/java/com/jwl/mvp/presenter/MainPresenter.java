package com.jwl.mvp.presenter;

import android.os.Handler;

import com.jwl.mvp.bean.Temperature;
import com.jwl.mvp.contract.MainContract;
import com.jwl.mvp.model.MainModel;


/**
 * Created by lujunwu on 2018/3/8.
 */

public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mView;
    private final MainModel mMainModel;

    public MainPresenter(MainContract.View view) {
        mView = view;
        mMainModel = new MainModel();
        mView.setPresenter(this);
    }

    @Override
    public void showTemperature() {
        final Temperature temperature = mMainModel.queryTemperature();
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                mView.showTemperature(temperature);
            }
        });
    }
}
