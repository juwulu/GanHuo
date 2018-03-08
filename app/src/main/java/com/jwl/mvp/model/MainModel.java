package com.jwl.mvp.model;

import com.jwl.mvp.bean.Temperature;

import java.util.Random;

/**
 * Created by lujunwu on 2018/3/8.
 */

public class MainModel {

    public Temperature queryTemperature() {

        Temperature temperature = new Temperature();
        temperature.setDegreee(20 + new Random().nextInt(20));
        return temperature;
    }
}
