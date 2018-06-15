package com.example.matthijs.thecircleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.matthijs.thecircleapp.liveVideoBroadcaster.LiveVideoBroadcasterActivity;
import com.github.nkzawa.socketio.androidchat.R;

public class MainActivity extends AppCompatActivity {

    public static final String RTMP_BASE_URL = "rtmp://188.166.29.146/live/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openVideoBroadcaster(View view) {
        Intent i = new Intent(this, LiveVideoBroadcasterActivity.class);
        startActivity(i);
    }
}
