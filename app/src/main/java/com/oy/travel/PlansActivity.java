package com.oy.travel;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.oy.activity.BaseActivity;
import com.oy.adapter.PlansDetailAdapter;
import com.oy.entity.PlansDetailEntity;
import com.oy.util.Constants;
import com.oy.util.DownUtil;
import com.oy.util.JSONUtil;
import com.oy.widget.MyListView;

import java.io.Serializable;
import java.util.List;

import de.greenrobot.event.EventBus;

/**
 * Created by Administrator on 2016/10/6.
 */
public class PlansActivity extends BaseActivity implements DownUtil.OnDownListener, View.OnClickListener {
    //listview adapter
    private ListView listView;
    private PlansDetailAdapter adapter;
    private int plan_id;
    private PlansDetailEntity plansDetailEntity;
    private TextView plans_title;
    private ImageView iv_back;
    private ImageView map_iv;
    @Override
    protected int setContentId() {
        return R.layout.city_detail_plans_layout;
    }

    @Override
    protected void init() {
        //plan_id
        Intent intent = getIntent();
        plan_id = intent.getIntExtra("plan_id",0);
        Log.d("msg", "init: "+plan_id);
        //listview
        listView = (ListView) findViewById(R.id.plans_lv);
        adapter = new PlansDetailAdapter(this);
        listView.setAdapter(adapter);
        //title
        plans_title = (TextView) findViewById(R.id.plans_title);
        //返回imageview
        iv_back = (ImageView) findViewById(R.id.plans_iv_back);
        iv_back.setOnClickListener(this);
        //地图定位
        map_iv = (ImageView) findViewById(R.id.map_iv);
        map_iv.setOnClickListener(this);
    }

    @Override
    protected void loadData() {
        String url = String.format(Constants.PLAN_URL,plan_id);
        new DownUtil().setOnDownListener(this).downJSON(url);
    }

    @Override
    public Object paresJson(String json) {
        if (json!=null){
            return JSONUtil.getPlansDetail(json);
        }
        return null;
    }

    @Override
    public void downSucc(Object object) {
        if (object!=null){
            plansDetailEntity = (PlansDetailEntity) object;
            plans_title.setText(plansDetailEntity.getTitle());
            adapter.setDatas(plansDetailEntity.getDays());

        }

    }

    /**
     * 返回上一个页面
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plans_iv_back:
                setResult(0x789);
                this.finish();
                break;
            case R.id.map_iv:
                Intent intent = new Intent(PlansActivity.this,MapActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("days", (Serializable) plansDetailEntity.getDays());
                intent.putExtras(bundle);
                startActivity(intent);
                break;
        }

    }
}
