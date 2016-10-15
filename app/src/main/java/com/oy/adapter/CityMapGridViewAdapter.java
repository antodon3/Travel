package com.oy.adapter;

import android.content.Context;
import android.util.Log;

import com.oy.entity.PlansDetailEntity;
import com.oy.travel.R;

/**
 * Created by Administrator on 2016/10/9.
 */
public class CityMapGridViewAdapter extends TypeMoreAdapter<PlansDetailEntity.DaysBean.PointsBean> {
    public CityMapGridViewAdapter(Context context) {
        super(context, R.layout.city_detail_map_item);
    }

    @Override
    protected void bindData(ViewHolder viewHolder, PlansDetailEntity.DaysBean.PointsBean data, int typeView) {
       int position =  data.getPosition()+1;
        Log.d("msg",data.getPoi().getName());
        viewHolder.bindTextView(R.id.tv_count, ""+position);
        viewHolder.bindTextView(R.id.tv_name,data.getPoi().getName());
    }
}
