package com.kaurihealth.mvplib.base_p;

import android.support.annotation.UiThread;

/**
 * Created by jianghw on 2016/8/4.
 * <p/>
 * 描述：mvp基层p
 */
public abstract class MvpPresenter<V extends MvpView> {

    private V mvpView;

    @UiThread
    public void attachView(V view) {
        mvpView = view;
    }

    @UiThread
    public void detachView() {
        mvpView = null;
    }

    public V getMvpView() {
        return mvpView;
    }
}
