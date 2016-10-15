package com.oy.travel;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.oy.activity.BaseActivity;
import com.oy.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Optional;

/**
 * Created by Administrator on 2016/10/3.
 */
public class MainActivity extends BaseActivity implements ViewPager.OnPageChangeListener {
    //头部相关控件
//    public RadioGroup radioGroup;
    public TabLayout tabLayout;
    private int[] imageId = {R.drawable.icon_tab_home,R.drawable.icon_tab_trip,R.drawable.icon_tab_plan,R.drawable.icon_tab_my};
    private String[] tabStr = new String[]{"攻略","游记","行程单","我的"};
//    //指示器
    //viewpager
    @BindView(R.id.viewPager)
    public ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private List<Integer> list;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    @Override
    protected int setContentId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        //适配器初始化设置
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),list,tabStr,imageId,this);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(this);
        viewPager.setCurrentItem(0);
        //初始化tablayout
        tabLayout  = (TabLayout) findViewById(R.id.tab_layout);
        //为tablayout设置viewpager
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        //toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);//设置返回键可用
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //drawerlayout 取消阴影
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerLayout.setScrimColor(Color.TRANSPARENT);
        //创建返回键，并实现打开关/闭监听
        actionBarDrawerToggle = new ActionBarDrawerToggle
                (this,drawerLayout,
                        toolbar,R.string.open,R.string.close){


           @Override
           public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        actionBarDrawerToggle.syncState();
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        for (int i = 0;i<imageId.length;i++){
            TabLayout.Tab tabAt = tabLayout.getTabAt(i);
            if (i==position){
                tabAt.setText("");
                tabAt.setIcon(imageId[i]);
            }
            else {
                tabAt.setText(tabStr[i]);

                tabAt.setIcon(null);
            }
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

//    @Override
//    public void onCheckedChanged(RadioGroup group, int checkedId) {
//        switch (checkedId){
//            case R.id.home_rb:
//                viewPager.setCurrentItem(0);
//                break;
//            case R.id.trip_rb:
//                viewPager.setCurrentItem(1);
//                break;
//            case R.id.plan_rg:
//                viewPager.setCurrentItem(2);
//                break;
//            case R.id.mine_rg:
//                viewPager.setCurrentItem(4);
//                break;
//        }
//    }

//    @Override
//    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//        //移动指示器
//        if (widthList.size()!=0){
//            int movex = 0;
//            for (int i = 0; i < position; i++) {
//                movex+=widthList.get(i);
//            }
//            int py = (int) (movex+widthList.get(position)*positionOffset);
//
//            lp_line.leftMargin= py;
//            line_view.setLayoutParams(lp_line);
//            //处理光标的长度
//            if (position!= widthList.size() -1){
//                int changeWitdth = widthList.get(position+1)-widthList.get(position);//变化的宽度
//                lp_line.width = (int) (changeWitdth*positionOffset+widthList.get(position))+20;
//            }else {
//                //滑动到最后一个tab
//                lp_line.width = widthList.get(position);
//            }
//        }
//
//    }

//    @Override
//    public void onPageSelected(int position) {
//        for (int i = 0;i<imageId.length;i++){
//            RadioButton rb = (RadioButton) radioGroup.getChildAt(i);
//            if (position == i){
//                rb.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(imageId[position],null),null,null,null);
//                rb.setText("");
//            }
//            else {
//                rb.setText(tabStr[i]);
//                rb.setTextColor(Color.WHITE);
//                rb.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
//            }
//        }
//
//
//    }
//
//    @Override
//    public void onPageScrollStateChanged(int state) {
//
//    }
}
