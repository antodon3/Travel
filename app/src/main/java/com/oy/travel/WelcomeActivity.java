package com.oy.travel;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.VideoView;

import com.oy.activity.BaseActivity;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/9/30.
 */
public class WelcomeActivity extends BaseActivity implements View.OnClickListener {
    public ImageView image_play;
    public TextView start_tv;
    @Override
    protected int setContentId() {
        return R.layout.welcome_layout;
    }

    @Override
    protected void init() {
        image_play = (ImageView) findViewById(R.id.image_play);
        image_play.setOnClickListener(this);
        start_tv = (TextView) findViewById(R.id.start_tv);
        start_tv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_play:
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(WelcomeActivity.this,MediaPlayActivity.class));
                        WelcomeActivity.this.finish();
                    }
                },20);
                break;
            case R.id.start_tv:
                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
                        WelcomeActivity.this.finish();
                    }
                },10);
                break;
        }


    }
}
