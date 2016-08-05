package com.kauriheakth.kaurihealth.base_v;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by jianghw on 2016/8/5.
 * <p/>
 * 描述：activity的基础父类
 */
public abstract class CommonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getActivityLayoutID());
        ButterKnife.bind(this);
        initActivityView();
        initActivityData(savedInstanceState);
    }

    protected abstract int getActivityLayoutID() ;

    protected abstract void initActivityView();

    protected abstract void initActivityData(Bundle savedInstanceState);

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

}
