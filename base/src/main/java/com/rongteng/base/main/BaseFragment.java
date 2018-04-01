/**
 *
 */
package com.rongteng.base.main;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.rongteng.base.global.Constant;
import com.rongteng.base.volley.IRequest;
import com.rongteng.base.volley.RequestParams;
import com.umeng.analytics.MobclickAgent;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseFragment extends Fragment implements OnClickListener {
    protected String TAG = this.getClass().getSimpleName();
    protected IRequest http;
    protected RequestParams params = new RequestParams();
    protected Map map = new HashMap();
    protected Context context;
    protected String progressTitle = Constant.LOADING;//进度条文字 如果为null则不显示加载进度loading

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
        http = new IRequest(getActivity());
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initView();
        initTitle();
        setEvent();
        setData();
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onResume() {
        MobclickAgent.onPageStart(TAG);
        super.onResume();
    }

    @Override
    public void onPause() {
        MobclickAgent.onPageEnd(TAG);
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    protected abstract void initTitle();

    protected abstract void initView();

    protected abstract void setData();

    protected abstract void setEvent();
}
