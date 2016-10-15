package com.oy.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.oy.entity.CityEntity;
import com.oy.travel.R;

/**
 * Created by Administrator on 2016/10/2.
 */
public class CityGridViewAdapter extends TypeMoreAdapter<CityEntity.DestinationsBean>{
    public CityEntity.DestinationsBean destinationsBean;
    public CityGridViewAdapter(Context context) {
        super(context, R.layout.home_city_grid_layout);
    }
    @Override
    protected void bindData(ViewHolder viewHolder, CityEntity.DestinationsBean data, int typeView) {
        //imageview
        viewHolder.bindImageView(R.id.city_iv, data.getPhoto_url(), R.drawable.city_default);

        //cityname
        viewHolder.bindTextView(R.id.cityname_tv,data.getName());
        viewHolder.bindTextView(R.id.cityname_tv2, data.getName_en());

    }
}
