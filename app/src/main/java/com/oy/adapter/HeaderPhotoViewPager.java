package com.oy.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.oy.fragment.HeaderPhotoFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
public class HeaderPhotoViewPager extends FragmentPagerAdapter {
    List<String> photoList;
    public HeaderPhotoViewPager(FragmentManager fm,List<String> photoList) {
        super(fm);
        this.photoList = photoList;
    }

    @Override
    public Fragment getItem(int position) {
        return new HeaderPhotoFragment().getPhotoString(photoList.get(position));
    }

    @Override
    public int getCount() {
        return photoList.size();
    }
}
