package com.oy.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.oy.entity.TripEntity;
import com.oy.travel.R;
import com.oy.widget.MyScrollView;

import java.util.List;

/**
 * Created by Administrator on 2016/10/3.
 */
public class TripListViewAdapter extends TypeMoreAdapter<TripEntity> {
    public Context context;
    public HorizontalScrollView hoscrollview;
    public LinearLayout scrollview_ll;
    public TripListViewAdapter(Context context) {
        super(context, R.layout.trip_item_layout);
        this.context = context;
    }

    @Override
    protected void bindData(ViewHolder viewHolder, TripEntity data, int typeView) {
        //用户名、头像
        viewHolder.bindTextView(R.id.user_name_tv,data.getActivity().getUser().getName());
        viewHolder.bindImageView(R.id.user_head_iv,data.getActivity().getUser().getPhoto_url(),R.drawable.home_user_place_holder);

        viewHolder.bindTextView(R.id.user_name_tv2,data.getUser().getName());
        viewHolder.bindTextView(R.id.topic_tv, data.getActivity().getTopic());

        viewHolder.bindTextView(R.id.description_tv, data.getActivity().getDescription());
        //图片添加
        viewHolder.bindImageView(R.id.trip_iv,data.getActivity().getContents().get(0).getPhoto_url(),R.drawable.city_default);
        //横向scrollview
        hoscrollview = (HorizontalScrollView) viewHolder.getView(R.id.hoscrollview);
        scrollview_ll = (LinearLayout) viewHolder.getView(R.id.scrollview_ll);
        scrollview_ll.removeAllViews();
        for (int i =0;i<data.getActivity().getContents().size();i++){

            ImageView iv = new ImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.width = 300;
            layoutParams.height = 150;
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            layoutParams.setMargins(0, 5, 5, 0);
//            iv.setLayoutParams(layoutParams);
            Glide.with(context).load(data.getActivity()
                    .getContents().get(i).getPhoto_url())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(iv);
            scrollview_ll.addView(iv,layoutParams);
        }
        //动态添加districts
        LinearLayout district_ll = (LinearLayout) viewHolder.getView(R.id.district_ll);
        district_ll.removeAllViews();
        List<TripEntity.ActivityBean.DistrictsBean> districtsBean = data.getActivity().getDistricts();
        for (int i = 0;i<districtsBean.size();i++){
            TextView tv = new TextView(context);
            tv.setText(districtsBean.get(i).getName());
            tv.setBackgroundResource(R.drawable.shape_district_corner_line);
            tv.setPadding(3, 3, 3, 3);
            tv.setTextSize(10);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.setMargins(15,0,10,0);
            district_ll.addView(tv,lp);
        }
        //底部
        viewHolder.bindTextView(R.id.like_tv,data.getActivity().getLikes_count()+"");
        viewHolder.bindTextView(R.id.comment_tv, data.getActivity().getComments_count() + "");
        viewHolder.bindTextView(R.id.fav_tv,data.getActivity().getFavorites_count()+"");
    }
}
