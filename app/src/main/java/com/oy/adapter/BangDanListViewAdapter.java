package com.oy.adapter;

import android.content.Context;
import android.util.Log;

import com.oy.entity.CityDetailEntity;
import com.oy.travel.R;

/**
 * Created by Administrator on 2016/10/5.
 */
public class BangDanListViewAdapter extends TypeMoreAdapter<CityDetailEntity.SectionsBean.ModelsBean> {
    public BangDanListViewAdapter(Context context) {
        super(context, R.layout.city_detail_bangdan_layout);
    }

    @Override
    protected void bindData(ViewHolder viewHolder, CityDetailEntity.SectionsBean.ModelsBean data, int typeView) {
        viewHolder.bindImageView(R.id.bangdan_iv,data.getPhoto_url(),R.drawable.city_default);
        viewHolder.bindTextView(R.id.bangdan_title_tv, data.getTitle());
        viewHolder.bindTextView(R.id.bangdan_summary_tv,data.getSummary());
    }
}
