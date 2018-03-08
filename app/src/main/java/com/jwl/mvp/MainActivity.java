package com.jwl.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.jwl.mvp.bean.Temperature;
import com.jwl.mvp.contract.MainContract;
import com.jwl.mvp.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    private MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainPresenter(this);
        mPresenter.showTemperature();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showTemperature(Temperature temperature) {
        Toast.makeText(this, temperature.getDegreee()+"", Toast.LENGTH_SHORT).show();
    }
}
