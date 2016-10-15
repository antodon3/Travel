package com.oy.travel;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.oy.activity.BaseActivity;
import com.oy.adapter.CityDetailListAdapter;
import com.oy.entity.CityDetailEntity;
import com.oy.util.Constants;
import com.oy.util.DownUtil;
import com.oy.util.JSONUtil;
import com.oy.widget.MyListView;

import java.util.List;

/**
 * Created by Administrator on 2016/10/4.
 */
public class CityDetailActivity extends BaseActivity implements DownUtil.OnDownListener, View.OnClickListener {
    public int id;
    private ImageView city_detail_iv;
    private TextView name_tv,en_tv;
    private LinearLayout add_ll;
    private MyListView detail_lv;
    private CityDetailListAdapter adapter;
    private ImageView iv_back;
    @Override
    protected int setContentId() {
        return R.layout.city_detail_layout;
    }

    @Override
    protected void init() {
        Intent intent = getIntent();
        id = intent.getIntExtra("cityid", 1);

        city_detail_iv = (ImageView) findViewById(R.id.city_detail_iv);
        name_tv = (TextView) findViewById(R.id.name_tv);
        en_tv = (TextView) findViewById(R.id.en_tv);
        add_ll = (LinearLayout) findViewById(R.id.add_ll);
        //listview
        detail_lv = (MyListView) findViewById(R.id.detail_lv);
        adapter = new CityDetailListAdapter(this);
        detail_lv.setAdapter(adapter);
        //imageview back
        iv_back = (ImageView) findViewById(R.id.iv_back);
        iv_back.setOnClickListener(this);
    }

    @Override
    protected void loadData() {
        String url = String.format(Constants.DETAIL_URL,id);
        new DownUtil().setOnDownListener(this).downJSON(url);
    }

    @Override
    public Object paresJson(String json) {
        if (json!=null){
            //解析json
            return JSONUtil.getCityDetail(json);
        }
        return null;
    }

    @Override
    public void downSucc(Object object) {
        if (object !=null){
            CityDetailEntity cityDetailEntity = (CityDetailEntity) object;
            //添加头部图片 文字
            Glide.with(this)
                    .load(cityDetailEntity.getPhoto_url())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .thumbnail(0.1f)
                    .placeholder(R.drawable.city_default)
                    .into(city_detail_iv);
            name_tv.setText(cityDetailEntity.getName());
            en_tv.setText(cityDetailEntity.getName_en());
            //添加横向的scrollview
            for (int i = 0;i<cityDetailEntity.getGoods().size();i++){
                //获得屏幕的宽度的1/4
                int width = getResources().getDisplayMetrics().widthPixels/4;

                View scrollview = LayoutInflater.from(this).inflate(R.layout.city_detail_goods_layout,null);

                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, ViewGroup.LayoutParams.WRAP_CONTENT);
                //获得图片
                ImageView goods_iv = (ImageView) scrollview.findViewById(R.id.goods_iv);
                String photo_url = cityDetailEntity.getGoods().get(i).getPhoto_url();
                Glide.with(this).load(photo_url)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .centerCrop()
                        .into(goods_iv);

                //文字
                TextView goods_name = (TextView) scrollview.findViewById(R.id.goods_name);
                goods_name.setText(cityDetailEntity.getGoods().get(i).getTitle());
                add_ll.addView(scrollview,layoutParams);
            }
           //adapter
            adapter.setDatas(cityDetailEntity.getSections());
        }

    }

    @Override
    public void onClick(View v) {
        setResult(0x123);
        this.finish();
    }
}
