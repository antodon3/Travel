package com.oy.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.oy.fragment.HomeFragment;
import com.oy.fragment.MineFragment;
import com.oy.fragment.PlanFragment;
import com.oy.fragment.TripFragment;
import com.oy.travel.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/1.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Integer> counts;
    private String[] tabStr;
    private int[] imageId;
    private Context context;
    public ViewPagerAdapter(FragmentManager fm,List<Integer> countList,String[] tabStr,int[] imageId,Context context)
    {
        super(fm);
        this.counts = new ArrayList<>();
        this.counts = countList;
        this.tabStr = tabStr;
        this.imageId = imageId;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
            switch (counts.get(position)){
                case 0:
                    return new HomeFragment();
                case 1:
                    return new TripFragment();
                case 2:
                    return new PlanFragment();
                case 3:
                    return new MineFragment();
            }
        return null;
    }

    @Override
    public int getCount() {
        return counts.size();
    }
    public View getTabView(int position){
        View view = LayoutInflater.from(context).inflate(R.layout.tab_layout,null);
        ImageView image = (ImageView) view.findViewById(R.id.image_tab);
        TextView text = (TextView) view.findViewById(R.id.text_tab);
        if (position == 0){
            image.setImageResource(imageId[position]);
        }
       else {
            text.setText(tabStr[position]);
        }

        return view;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabStr[position];
    }
}
