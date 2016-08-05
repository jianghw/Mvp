package com.kauriheakth.kaurihealth.welcome_v.activity;

import android.os.Bundle;
import android.view.KeyEvent;

import com.kauriheakth.kaurihealth.R;
import com.kauriheakth.kaurihealth.base_v.CommonActivity;
import com.kaurihealth.mvplib.welcome_p.IWelcomeView;
import com.kaurihealth.mvplib.welcome_p.WelcomePresenter;

/**
 * 欢迎
 */
public class WelcomeActivity extends CommonActivity implements IWelcomeView {

    private WelcomePresenter<IWelcomeView> mPresenter;

    @Override
    protected int getActivityLayoutID() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initActivityView() {

    }

    @Override
    protected void initActivityData(Bundle savedInstanceState) {
        mPresenter = new WelcomePresenter<>();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return keyCode == KeyEvent.KEYCODE_BACK || super.onKeyDown(keyCode, event);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.attachView(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPresenter.detachView();
    }

    /**
     * ----------------------------继承基础mvpView方法----------------------
     **/
    @Override
    public void displayLoadingDialog() {

    }

    @Override
    public void dismissLoadingDialog() {

    }

    @Override
    public void showToastMessage() {

    }

    @Override
    public void switchPageUI() {

    }

}
