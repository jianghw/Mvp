package com.kaurihealth.mvplib.welcome_p;


import com.kaurihealth.mvplib.base_p.MvpView;
import com.kaurihealth.mvplib.base_p.RxMvpPresenter;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;

/**
 * Created by jianghw on 2016/8/5.
 * <p>
 * 描述：Observer观察者 Subscriber
 */
public class WelcomePresenter<V extends MvpView> extends RxMvpPresenter<V> {

    private IWelcomeView view;

    @Override
    public void prepareData() {
        view = (IWelcomeView) getMvpView();

        //判断是否需要自动登陆
        createSubScription();
    }

    private void createSubScription() {
        Subscription subscription = Observable
                .create(new Observable.OnSubscribe<Object>() {
                    @Override
                    public void call(Subscriber<? super Object> subscriber) {

                    }
                })
                .subscribe(new Subscriber<Object>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Object o) {

                    }
                });
        addSubScription(subscription);
    }

    public boolean automaticLanding() {
        view.switchPageUI();
        return true;
    }
}
