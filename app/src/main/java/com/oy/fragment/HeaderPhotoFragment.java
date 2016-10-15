package com.oy.fragment;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.oy.travel.R;

/**
 * Created by Administrator on 2016/10/8.
 */
public class HeaderPhotoFragment extends BaseFragment {
    public String photo_url;
    public ImageView home_iv;
    public HeaderPhotoFragment getPhotoString(String photo_url){
        this.photo_url = photo_url;
        return this;
    }
    @Override
    public int getLayoutId() {
        return R.layout.home_headerphoto_layout;
    }

    @Override
    public void init(View view) {
        home_iv = (ImageView) view.findViewById(R.id.home_iv);
    }

    @Override
    public void loadDatas() {
        Glide.with(getActivity())
                .load(photo_url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(home_iv);
    }
}
