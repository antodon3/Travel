package com.oy.adapter;

import android.content.Context;
import android.widget.ListView;
import android.widget.TextView;

import com.oy.entity.PlansDetailEntity;
import com.oy.travel.R;

/**
 * Created by Administrator on 2016/10/6.
 */
public class PlansDetailAdapter extends TypeMoreAdapter<PlansDetailEntity.DaysBean> {
    public ListView plans_lv2;
    public Context context;
    public PlansDetailAdapter(Context context) {
        super(context, R.layout.city_detail_plans_item);
        this.context = context;
    }

    @Override
    protected void bindData(ViewHolder viewHolder, PlansDetailEntity.DaysBean data, int typeView) {
       //标题
        TextView day_tv = (TextView) viewHolder.getView(R.id.day_tv);
        day_tv.setText("DAY"+data.getPosition()+":"+data.getDestination_name());
        //描述
       TextView plans_description = (TextView) viewHolder.getView(R.id.plans_description);
        plans_description.setText(data.getDescription());
        //points
        //listview  adapter
        plans_lv2 = (ListView) viewHolder.getView(R.id.plans_lv2);
        PlansPointsAdapter pointsAdapter = new PlansPointsAdapter(context);
        plans_lv2.setAdapter(pointsAdapter);
        pointsAdapter.setDatas(data.getPoints());

    }
}
