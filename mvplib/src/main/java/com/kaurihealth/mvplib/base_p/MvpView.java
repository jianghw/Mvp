package com.kaurihealth.mvplib.base_p;

import android.support.annotation.UiThread;

/**
 * Created by jianghw on 2016/8/4.
 * <p/>
 * 描述：
 */
public interface MvpView {
    @UiThread
    void displayLoadingDialog();

    @UiThread
    void dismissLoadingDialog();

    @UiThread
    void showToastMessage();

    @UiThread
    void switchPageUI();
}
