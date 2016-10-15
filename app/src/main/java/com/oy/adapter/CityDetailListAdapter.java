package com.oy.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.oy.entity.CityDetailEntity;
import com.oy.travel.PhotoActivity;
import com.oy.travel.PlansActivity;
import com.oy.travel.R;

import java.io.Serializable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/5.
 */
public class CityDetailListAdapter extends TypeMoreAdapter<CityDetailEntity.SectionsBean> implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    public Context context;

    public RadioGroup plan_rg;
    //旅行榜单listview adapter
    public ListView bangdan_lv;
    public BangDanListViewAdapter bangDanListViewAdapter;
    //经典路线中的集合
    public List<CityDetailEntity.SectionsBean.ModelsBean> modelsBeans;
    public int plan_id;
    public TextView detail_tv2,detail_tv3;
    //相关氢游记中图片集合
    public List<CityDetailEntity.SectionsBean.ModelsBean.ContentsBean> contentsBeans;
    public CityDetailListAdapter(Context context) {
        super(context, R.layout.city_detail_item_layout,
                R.layout.city_detail_item2_layout,
                R.layout.city_detail_item4_layout,
                R.layout.city_detail_item3_layout);
        this.context = context;

    }

    @Override
    protected void bindData(ViewHolder viewHolder, CityDetailEntity.SectionsBean data, int typeView) {

        switch (typeView){
            case 0:
                //目的地
                viewHolder.bindTextView(R.id.detail_title,data.getTitle());
                viewHolder.bindTextView(R.id.bottom_tv,data.getButton_text());
                //动态添加横向的图片
                LinearLayout hs_ll = (LinearLayout) viewHolder.getView(R.id.hs_ll);
                for (int i = 0;i<data.getModels().size();i++){
                    //城市名
                    LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    TextView destination_tv = new TextView(context);
                    destination_tv.setText(data.getModels().get(i).getName());
                    destination_tv.setGravity(Gravity.CENTER);
                    destination_tv.setTextSize(12);

                    TextView destination_tv_pin = new TextView(context);
                    destination_tv_pin.setText(data.getModels().get(i).getName_en());
                    destination_tv_pin.setGravity(Gravity.CENTER);
                    destination_tv_pin.setTextSize(10);
                    //城市图片
                    ImageView destination_iv = new ImageView(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    layoutParams.width = 200;
                    layoutParams.height = 200;
                    layoutParams.setMargins(5,5,5,5);

                    Glide.with(context).load(data.getModels().get(i).getPhoto_url())
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
                            .centerCrop()
                            .into(destination_iv);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(LinearLayout.VERTICAL);
                    linearLayout.addView(destination_iv,layoutParams);
                    linearLayout.addView(destination_tv);
                    linearLayout.addView(destination_tv_pin);

                    hs_ll.addView(linearLayout);

                }
                break;
            case 1:
                //经典路线
                plan_rg = (RadioGroup) viewHolder.getView(R.id.plan_rg);
                plan_rg.removeAllViews();
                //地图id
                ImageView iv = (ImageView) viewHolder.getView(R.id.map_iv);
                iv.setOnClickListener(this);
                //获得地图上的2个textview
                detail_tv2 = (TextView) viewHolder.getView(R.id.detail_tv2);
                detail_tv3 = (TextView) viewHolder.getView(R.id.detail_tv3);
                viewHolder.bindTextView(R.id.title_tv, data.getTitle());
                 modelsBeans =  data.getModels();
                for (int i = 0;i<modelsBeans.size();i++){
                    RadioGroup.LayoutParams lp = new RadioGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    lp.setMargins(5,5,5,5);
                    RadioButton radioButton = new RadioButton(context);
                    String rb_text = modelsBeans.get(i).getDays_count()+"日行程";
                    radioButton.setText(rb_text);
                    radioButton.setTextSize(10);
                    radioButton.setButtonDrawable(null);
                    radioButton.setTag(i);
                    radioButton.setPadding(10, 10, 10, 10);
                    //设置选中/未选中的文字颜色

                    //设置按钮选中/未选中的背景
                    radioButton.setBackground(context.getResources().getDrawable(R.drawable.selector_radiobtn_bg,null));
                    plan_rg.addView(radioButton,lp);
                }
                plan_rg.setOnCheckedChangeListener(this);
                plan_rg.getChildAt(0).performClick();

                break;
            case 2:
                //旅行榜单
                viewHolder.bindTextView(R.id.title_tv,data.getTitle());
                bangdan_lv = (ListView) viewHolder.getView(R.id.bangdan_lv);
                bangDanListViewAdapter = new BangDanListViewAdapter(context);
                bangdan_lv.setAdapter(bangDanListViewAdapter);
                List<CityDetailEntity.SectionsBean.ModelsBean> modelsBeans3 =  data.getModels();
                bangDanListViewAdapter.setDatas(modelsBeans3);
                break;
            case 3:
                //相关氢游记
                //添加标题
                viewHolder.bindTextView(R.id.title_tv,data.getTitle());
                //添加图片
                ImageView imageView = (ImageView) viewHolder.getView(R.id.youji_iv);
                List<CityDetailEntity.SectionsBean.ModelsBean> modelsBeans2 =  data.getModels();
                String photo_url = modelsBeans2.get(0).getContents().get(0).getPhoto_url();
                Glide.with(context)
                        .load(photo_url)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(imageView);
                //图片的张数
                 TextView photo_tv = (TextView) viewHolder.getView(R.id.photo_count_tv);
                photo_tv.setText(""+modelsBeans2.get(0).getContents().size());

                contentsBeans = modelsBeans2.get(0).getContents();
                //点击图片显示所有的图片
                imageView.setOnClickListener(this);
                //用户名
                TextView detail_username = (TextView) viewHolder.getView(R.id.detail_username);
                detail_username.setText(modelsBeans2.get(0).getName());
                //话题 --- 标题
                TextView detail_topic = (TextView) viewHolder.getView(R.id.detail_topic);
                detail_topic.setText(modelsBeans2.get(0).getTopic());
                //话题 --- 描述
                //第三方控件
                ExpandableTextView expTv1 = (ExpandableTextView)viewHolder.getView(R.id.expand_text_view);
                expTv1.setText(modelsBeans2.get(0).getDescription());
                //底部按钮文字
                viewHolder.bindTextView(R.id.button_text,data.getButton_text());

        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioButton radioButton = (RadioButton)group.findViewById(checkedId);
        int k = (int) radioButton.getTag();
        Log.d("msg","---onChecked "+k);
        switch (k){
            case 0:
                detail_tv2.setText(modelsBeans.get(0).getTitle());
                detail_tv3.setText(modelsBeans.get(0).getDays_count() + "天" + ", 22条旅行计划");
                 plan_id = modelsBeans.get(0).getDays().get(0).getPlan_id();
                break;
            case 1:
                detail_tv2.setText(modelsBeans.get(1).getTitle());
                detail_tv3.setText(modelsBeans.get(1).getDays_count() + "天" + ", 22条旅行计划");
                plan_id = modelsBeans.get(1).getDays().get(1).getPlan_id();
                break;
            case 2:
                detail_tv2.setText(modelsBeans.get(2).getTitle());
                detail_tv3.setText(modelsBeans.get(2).getDays_count() + "天" + ", 22条旅行计划");
                plan_id = modelsBeans.get(2).getDays().get(2).getPlan_id();
                break;

        }


    }

    /**
     * 图片点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //点击地图图片
            case R.id.map_iv:
                Intent intent = new Intent(context,PlansActivity.class);
                intent.putExtra("plan_id",plan_id);
                context.startActivity(intent);
                break;
            //点击相关氢游记图片
            case R.id.youji_iv:
                Intent intent1 = new Intent(context, PhotoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("contents", (Serializable) contentsBeans);
                intent1.putExtras(bundle);
                context.startActivity(intent1);
                break;
        }

    }
}
