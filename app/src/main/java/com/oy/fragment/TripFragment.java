package com.oy.fragment;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import com.oy.adapter.TripListViewAdapter;
import com.oy.entity.TripEntity;
import com.oy.travel.R;
import com.oy.util.Constants;
import com.oy.util.DownUtil;
import com.oy.util.JSONUtil;

import org.json.JSONTokener;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/1.
 */
public class TripFragment extends BaseFragment implements DownUtil.OnDownListener, SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {
    //listview
    @BindView(R.id.trip_lv)
    public ListView trip_lv;
    public TripListViewAdapter tripListViewAdapter;
    @BindView(R.id.sRefresh)
    public SwipeRefreshLayout swipeRefreshLayout;
    public Handler handler = new Handler();
    @BindView(R.id.fab)
    public FloatingActionButton fab;
    @Override
    public int getLayoutId() {
        return R.layout.trip_layout;
    }

    @Override
    public void init(View view) {
        tripListViewAdapter = new TripListViewAdapter(getActivity());
        trip_lv.setAdapter(tripListViewAdapter);
        //设置swipeRefreshLayout属性
        //背景颜色
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(Color.WHITE);
       //设置光标的颜色
        swipeRefreshLayout.setColorSchemeColors(Color.parseColor("#66ece7"));
        //
        swipeRefreshLayout.setSize(SwipeRefreshLayout.DEFAULT);
        //设置向下拉多少出现刷新  
       swipeRefreshLayout.setDistanceToTriggerSync(20);
       //设置刷新出现的位置  
//        swipeRefreshLayout.setProgressViewEndTarget(false,200);
    }

    @Override
    public void loadDatas() {
        new DownUtil().setOnDownListener(this).downJSON(Constants.TRIP_URL);
    }

    @Override
    public Object paresJson(String json) {
        if (json!=null){
            return JSONUtil.getTrip(json);
        }
        return null;
    }

    @Override
    public void downSucc(Object object) {
        if (object!=null){
            List<TripEntity> tripEntityList = (List<TripEntity>) object;
            tripListViewAdapter.setDatas(tripEntityList);
        }

    }

    @Override
    public void setListener() {
        swipeRefreshLayout.setOnRefreshListener(this);
        fab.setOnClickListener(this);
    }
    //swipeRefreshLayout刷新方法
    @Override
    public void onRefresh() {
        loadDatas();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //2秒之后停止刷新
                handler.post(new Runnable() {
                   @Override
                   public void run() {
                       swipeRefreshLayout.setRefreshing(false);
                   }
               });
            }
        }.start();
    }

    @Override
    public void onClick(View v) {

    }
}
