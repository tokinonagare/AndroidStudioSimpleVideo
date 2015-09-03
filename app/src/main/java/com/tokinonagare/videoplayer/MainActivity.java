package com.tokinonagare.videoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView tokinonagareVideoView = (VideoView) findViewById(R.id.tokinonagareVideoView);
        tokinonagareVideoView.setVideoPath("https://www.thenewboston.com/forum/project_files/006_testVideo.mp4");

        tokinonagareVideoView.start();
    }
}
