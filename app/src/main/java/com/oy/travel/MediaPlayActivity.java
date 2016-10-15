package com.oy.travel;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.oy.activity.BaseActivity;

import java.net.URI;

/**
 * Created by Administrator on 2016/10/3.
 */
public class MediaPlayActivity extends BaseActivity implements MediaPlayer.OnCompletionListener {
    @Override
    protected int setContentId() {
        return R.layout.mediaplay_layout;
    }

    @Override
    protected void init() {
        VideoView videoView = (VideoView) findViewById(R.id.videoview);
       MediaController controller = new MediaController(this);
        videoView.setMediaController(controller);
        Uri uri= Uri.parse("android.resource://" + getPackageName() + "/"+ R.raw.media);
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.setOnCompletionListener(this);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MediaPlayActivity.this, MainActivity.class));
                MediaPlayActivity.this.finish();
            }
        },500);
    }
    @Override
    protected void onStop() {
        super.onStop();

    }
}
