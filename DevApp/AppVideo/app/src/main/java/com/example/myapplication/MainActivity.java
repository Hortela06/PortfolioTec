package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vv = (VideoView) findViewById(R.id.video);
        String caminho = "android.resource://" + getPackageName()+"/"+R.raw.chavespotter;
        Uri uri = Uri.parse(caminho);
        vv.setVideoURI(uri);
        MediaController mc = new MediaController(this);
        vv.setMediaController(mc);
        mc.setAnchorView(vv);

    }
}