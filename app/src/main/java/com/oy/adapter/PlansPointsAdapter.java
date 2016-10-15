package com.oy.adapter;

import android.content.Context;

import com.oy.entity.PlansDetailEntity;
import com.oy.travel.R;

/**
 * Created by Administrator on 2016/10/6.
 */
public class PlansPointsAdapter extends TypeMoreAdapter<PlansDetailEntity.DaysBean.PointsBean> {
    public PlansPointsAdapter(Context context) {
        super(context, R.layout.city_detail_plans_item2);
    }

    @Override
    protected void bindData(ViewHolder viewHolder, PlansDetailEntity.DaysBean.PointsBean data, int typeView) {
        viewHolder.bindTextView(R.id.topic, data.getInspiration_activity().getTopic());

        String visit_time =data.getInspiration_activity().getDestination().getName()+"· 建议玩"+data.getInspiration_activity().getVisit_tip();
        viewHolder.bindTextView(R.id.visit_tip,visit_time);
    }
}
