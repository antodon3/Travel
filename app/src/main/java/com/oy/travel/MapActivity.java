package com.oy.travel;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.model.LatLng;
import com.oy.adapter.CityMapGridViewAdapter;
import com.oy.entity.PlansDetailEntity;
import com.oy.widget.MyGridView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2016/10/8.
 */
public class MapActivity extends AppCompatActivity {
    //地图相关控件显示
    private MapView mapView;
    private BaiduMap baiduMap;
    private List<PlansDetailEntity.DaysBean> daysBeans;
    private List<PlansDetailEntity.DaysBean.PointsBean> pointsBeans;
    private HorizontalScrollView horizontalScrollView;
    private LinearLayout scroll_ll;
    //经纬度
    private double lantitude,longtitude;
    private LatLng lat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
//        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.city_detail_map_layout);
        init();
        load();
    }


    public void init() {
        Intent intent = getIntent();
        daysBeans = (List<PlansDetailEntity.DaysBean>) intent.getExtras().getSerializable("days");
        //初始化控件
        mapView = (MapView) findViewById(R.id.bmapView);
        baiduMap = mapView.getMap();
         lantitude = Double.valueOf(daysBeans.get(0).getPoints().get(0).getPoi().getLat());
         longtitude = Double.valueOf(daysBeans.get(0).getPoints().get(0).getPoi().getLng());
        //设置地图中心点
         lat = new LatLng(lantitude,longtitude);
        //定义地图发生的状态
        MapStatus mapStatus = new MapStatus.Builder().target(lat).zoom(18).build();
        MapStatusUpdate mapStatusUpdate = MapStatusUpdateFactory.newMapStatus(mapStatus);
        baiduMap.setMapStatus(mapStatusUpdate);

        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hoScrollview);
        scroll_ll = (LinearLayout) findViewById(R.id.scroll_ll);

    }
    private void load() {
        int position = 0;
        for (int i = 0;i<daysBeans.size();i++){
            int day_count = i+1;
            //天数相关控件
            View days_view = LayoutInflater.from(this).inflate(R.layout.city_detail_map_item2,null);
            //添加天数的视图

            TextView days_tv = (TextView) days_view.findViewById(R.id.days_tv);
            days_tv.setText("DAY" + day_count);

            scroll_ll.addView(days_view);
            //添加景点城市视图

            pointsBeans = daysBeans.get(i).getPoints();
            List<OverlayOptions> overlayOptionsList = new ArrayList<>();
            for (int j = 0;j<pointsBeans.size();j++){
                 position++;
//                1 2 3 4
                //景点相关控件
                View citys_view = LayoutInflater.from(this).inflate(R.layout.city_detail_map_item,null);
                TextView tv_count = (TextView) citys_view.findViewById(R.id.tv_count);
                tv_count.setText("" + position);
                TextView tv_name = (TextView) citys_view.findViewById(R.id.tv_name);
                tv_name.setText(pointsBeans.get(j).getPoi().getName());
                scroll_ll.addView(citys_view);
                //获得经纬度
                lantitude = Double.valueOf(pointsBeans.get(j).getPoi().getLat());
                longtitude = Double.valueOf(pointsBeans.get(j).getPoi().getLng());
                lat = new LatLng(lantitude,longtitude);
                //获得地图控件文字，图片
                View map_view = LayoutInflater.from(this).inflate(R.layout.map_biaoji_layout,null);
                TextView map_tv = (TextView) map_view.findViewById(R.id.biaoji_map_tv);
                map_tv.setText(""+position);
                ImageView map_iv = (ImageView) map_view.findViewById(R.id.biaoji_map_iv);
                map_iv.setImageResource(R.drawable.icon_map_green_digit);

                BitmapDescriptor bitmapDescriptor = BitmapDescriptorFactory.fromView(map_view);
                //构建markeroption
                OverlayOptions overlayOptions = new MarkerOptions()
                        .position(lat)
                        .icon(bitmapDescriptor)
                        .zIndex(9)
                        .draggable(true);

                overlayOptionsList.add(overlayOptions);
//                baiduMap.addOverlay(overlayOptions);
            }
            baiduMap.addOverlays(overlayOptionsList);

        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

}
