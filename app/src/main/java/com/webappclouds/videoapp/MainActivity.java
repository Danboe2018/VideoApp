package com.webappclouds.videoapp;

import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView myVideoView = findViewById(R.id.myVideoView);
        myVideoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");
        myVideoView.start();
    }
}
