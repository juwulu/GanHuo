package com.jwl.mvp.contract;

import com.jwl.mvp.base.BasePresenter;
import com.jwl.mvp.base.BaseView;
import com.jwl.mvp.bean.Temperature;

/**
 * Created by lujunwu on 2018/3/8.
 */

public class MainContract {

    public interface Presenter extends BasePresenter{
        void showTemperature();
    }

    public interface View extends BaseView<Presenter>{
        void showTemperature(Temperature temperature);

    }
}
