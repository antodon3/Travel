package com.oy.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.oy.entity.CityDetailEntity;
import com.oy.fragment.PhotoFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
public class PhotoViewPagerAdapter extends FragmentPagerAdapter{
    public List<CityDetailEntity.SectionsBean.ModelsBean.ContentsBean> contentsBeans;
    public PhotoViewPagerAdapter(FragmentManager fm,List<CityDetailEntity.SectionsBean.ModelsBean.ContentsBean> contentsBeans) {
        super(fm);
        this.contentsBeans = contentsBeans;
    }

    @Override
    public Fragment getItem(int position) {
        return new PhotoFragment().getInstance(contentsBeans.get(position).getPhoto_url());
    }

    @Override
    public int getCount() {
        return contentsBeans.size();
    }
}
