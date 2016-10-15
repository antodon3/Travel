package com.oy.fragment;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.oy.travel.R;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/8.
 */
public class PhotoFragment extends BaseFragment {
    //图片
    @BindView(R.id.photo_item_iv)
    public ImageView photo_item_iv;
    public String photo_url;
    public  PhotoFragment getInstance(String photo_url){
        this.photo_url = photo_url;
        return this;
    }
    @Override
    public int getLayoutId() {
        return R.layout.photo_item_layout;
    }

    @Override
    public void init(View view) {


    }

    @Override
    public void loadDatas() {
        //下载图片
        Glide.with(getActivity())
                .load(photo_url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(photo_item_iv);
    }
}
