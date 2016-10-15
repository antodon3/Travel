package com.oy.fragment;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.oy.adapter.CityGridViewAdapter;
import com.oy.adapter.CityListViewAdapter;
import com.oy.adapter.HeaderPhotoViewPager;
import com.oy.database.MySqliteOpenHelper;
import com.oy.entity.CityEntity;
import com.oy.travel.R;
import com.oy.util.Constants;
import com.oy.util.DownUtil;
import com.oy.util.JSONUtil;
import com.oy.widget.MyGridView;
import com.oy.widget.loopviewpager.LoopViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/1.
 * myscrollView嵌套listview
 * listview嵌套gridview
 */
public class HomeFragment extends BaseFragment implements DownUtil.OnDownListener{
    @BindView(R.id.myscrollView)
    public ScrollView myscrollview;
    //listview相关控件
    public ListView myListView;
    public CityListViewAdapter cityListViewAdapter;
    //looperviewpager相关控件
    public ViewPager looperViewPager;
    public HeaderPhotoViewPager headerPhotoViewPager;
    @Override
    public int getLayoutId() {
        return R.layout.home_layout;
    }

    @Override
    public void init(View view) {
       /* DisplayMetrics dm = new DisplayMetrics();
        //获取屏幕信息
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
          screenWidth = dm.widthPixels;
         screenHeigh = dm.heightPixels;*/

        //listview
        myListView = (ListView) myscrollview.findViewById(R.id.city_lv);
        cityListViewAdapter = new CityListViewAdapter(getActivity());
        myListView.setAdapter(cityListViewAdapter);
        //loopviewpager
        looperViewPager = (ViewPager) myscrollview.findViewById(R.id.loopviewpager);

    }

    @Override
    public void loadDatas() {
        //下载顶部图片
        new DownUtil().setOnDownListener(new DownUtil.OnDownListener() {
            @Override
            public Object paresJson(String json) {
                if (json!=null){

                    return JSONUtil.getHeaderImage(json);
                }
                return null;
            }

            @Override
            public void downSucc(Object object) {
                List<String> photoList = (List<String>) object;
                if (object!=null){
                    headerPhotoViewPager = new HeaderPhotoViewPager(getChildFragmentManager(),photoList);
                    looperViewPager.setAdapter(headerPhotoViewPager);
                }

            }
        }).downJSON(Constants.IMAGE_URL);


        //下载城市
        new DownUtil().setOnDownListener(this).downJSON(Constants.DESTION_URL);

    }


    @Override
    public Object paresJson(String json) {
        if (json!=null){
            return JSONUtil.getCity(json);

        }
        return null;
    }

    @Override
    public void downSucc(Object object) {
        if (object!=null){
            List<CityEntity> list = (List<CityEntity>) object;
            cityListViewAdapter.setDatas(list);
        }


    }
}
