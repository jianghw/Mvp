package com.kauriheakth.kaurihealth.base_v;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by jianghw on 2016/8/5.
 * <p/>
 * 描述：fragment的基础父类
 */
public abstract class CommonFragment extends Fragment {

    private CommonActivity mActivity;//获取父类activity

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mActivity = (CommonActivity) activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getFragmentLayoutID(), container, false);
        ButterKnife.bind(this, view);
        initFragmentView(view, savedInstanceState);
        return view;
    }

    /**
     * 子类实现
     *
     * @return 布局id
     */
    protected abstract int getFragmentLayoutID();

    protected abstract void initFragmentView(View view, Bundle savedInstanceState);

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
