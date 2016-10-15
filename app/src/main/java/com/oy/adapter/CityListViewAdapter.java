package com.oy.adapter;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.oy.entity.CityEntity;
import com.oy.travel.CityDetailActivity;
import com.oy.travel.R;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/2.
 */
public class CityListViewAdapter extends TypeMoreAdapter<CityEntity> implements AdapterView.OnItemClickListener {

    public CityGridViewAdapter cityGridViewAdapter;
    public Context context;
    public CityListViewAdapter(Context context) {
        super(context, R.layout.home_city_item_layout);
        this.context = context;
    }

    @Override
    protected void bindData(ViewHolder viewHolder, CityEntity data, int typeView) {
        //head
        viewHolder.bindTextView(R.id.head_tv,data.getName());

        //gridview
        cityGridViewAdapter = new CityGridViewAdapter(context);
        GridView mygridView = (GridView) viewHolder.getView(R.id.mygridView);

        mygridView.setSelector(new ColorDrawable(Color.TRANSPARENT));
        mygridView.setAdapter(cityGridViewAdapter);
        mygridView.setOnItemClickListener(this);
        cityGridViewAdapter.setDatas(data.getDestinations());

        //foot
        viewHolder.bindTextView(R.id.foot_tv, data.getButton_text());
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        CityEntity.DestinationsBean des = (CityEntity.DestinationsBean) parent.getAdapter().getItem(position);
        Intent intent = new Intent(context, CityDetailActivity.class);
        intent.putExtra("cityid", des.getId());
        context.startActivity(intent);
    }
}
