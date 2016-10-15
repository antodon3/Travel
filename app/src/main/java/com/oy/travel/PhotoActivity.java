package com.oy.travel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.TextView;

import com.oy.activity.BaseActivity;
import com.oy.adapter.PhotoViewPagerAdapter;
import com.oy.adapter.ViewPagerAdapter;
import com.oy.entity.CityDetailEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
public class PhotoActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    public List<CityDetailEntity.SectionsBean.ModelsBean.ContentsBean> contentsBeans;
    public ViewPager photo_viewpager;
    public PhotoViewPagerAdapter photoViewPagerAdapter;
    //图片个数
    public TextView now_tv,total_tv;
    @Override
    protected int setContentId() {
        return R.layout.city_detail_photo_layout;
    }
    @Override
    protected void init() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        contentsBeans = (List<CityDetailEntity.SectionsBean.ModelsBean.ContentsBean>) bundle.getSerializable("contents");
        photo_viewpager = (ViewPager) findViewById(R.id.photo_viewpager);
        photoViewPagerAdapter = new PhotoViewPagerAdapter(getSupportFragmentManager(),contentsBeans);
        photo_viewpager.setAdapter(photoViewPagerAdapter);
        //图片个数
        now_tv = (TextView) findViewById(R.id.now_tv);
        total_tv = (TextView) findViewById(R.id.total_tv);
    }

    @Override
    protected void onItemListener() {
        //设置viewpager滑动监听事件
        photo_viewpager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        int now_count = position+1;
        now_tv.setText(""+now_count);
        total_tv.setText("/"+contentsBeans.size());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
