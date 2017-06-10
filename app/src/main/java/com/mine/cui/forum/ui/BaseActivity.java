package com.mine.cui.forum.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.mine.cui.forum.R;

import butterknife.BindView;
import cn.droidlover.xdroidmvp.kit.Kits;
import cn.droidlover.xdroidmvp.mvp.XActivity;

/**
 * Created by zxkjc3 on 2017/6/10.
 */

public abstract class BaseActivity extends XActivity {
    @BindView(R.id.toolbar)Toolbar mTb;
    @BindView(R.id.title)TextView mTitle;//工具栏中间的文字
    @BindView(R.id.subtitle)TextView mSubTitle;//工具栏右侧的文字
    @Override
    public void initData(Bundle savedInstanceState) {
        initToolbar();//初始化工具栏
    }

    /**
     * @author cui
     * @function 初始化工具栏
     */
    private void initToolbar() {
        if (Kits.Empty.isNotEmpty(mTb)){
            setSupportActionBar(mTb);//使用Toolbar替代ActionBar
            //显示title和subTitle
            getSupportActionBar().setDisplayShowTitleEnabled(true);

            mTb.setBackgroundResource(R.color.colorPrimary);
        }
        showBack();
    }

    /**
     * @author cui
     * @function 是否显示back 回退键
     */
    private void showBack(){
        //默认不显示返回键图标
        if (isShowBack()){
            mTb.setNavigationIcon(R.drawable.back);
            mTb.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

    }

    public boolean isShowBack(){
        return false;
    }

    /**
     * @author cui
     * @function 设置Title的文本
     * @param title
     */
    public void setMineTitle(String title) {
        mTitle.setText(title);
    }

    /**
     * @author cui
     * @function 设置次title文本内容
     * @param subTitle
     */
    public void setMineSubTitle(String subTitle){
        mSubTitle.setText(subTitle);
    }
}
