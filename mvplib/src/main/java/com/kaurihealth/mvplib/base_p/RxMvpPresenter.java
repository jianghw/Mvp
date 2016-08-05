package com.kaurihealth.mvplib.base_p;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by jianghw on 2016/8/5.
 * <p>
 * 描述：对rxjava使用扩展
 */
public abstract class RxMvpPresenter<V extends MvpView> extends MvpPresenter<V> {
    private CompositeSubscription mSubscriptions;

    @Override
    public void attachView(V view) {
        super.attachView(view);
        mSubscriptions = new CompositeSubscription();
        onSubscribe();

        prepareData();
    }

    public abstract void prepareData();

    protected void onSubscribe() {
        mSubscriptions.clear();
    }

    protected void addSubScription(Subscription subscription) {
        mSubscriptions.add(subscription);
    }

    protected void unSubscribe() {
        mSubscriptions.clear();
    }

    @Override
    public void detachView() {
        super.detachView();
        unSubscribe();
        mSubscriptions = null;
    }
}
