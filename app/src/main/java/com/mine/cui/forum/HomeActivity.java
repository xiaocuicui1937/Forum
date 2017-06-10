package com.mine.cui.forum;

import android.os.Bundle;

import com.mine.cui.forum.ui.BaseActivity;

public class HomeActivity extends BaseActivity {

    @Override
    public void initData(Bundle savedInstanceState) {
        super.initData(savedInstanceState);
        setTitle("手机论坛");
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public Object newP() {
        return null;
    }

    @Override
    public boolean isShowBack() {
        return true;
    }
}
