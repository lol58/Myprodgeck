package com.example.myprodgeck;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static MediaPlayer rings;
    Button buttonstart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addlistenerOnButton();
        MediaPlayer rings= MediaPlayer.create(MainActivity.this,R.raw.phon);
        rings.start();

    }

    private void addlistenerOnButton() {
        buttonstart = (Button) findViewById(R.id.buttonstart);
        buttonstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.Menu");
                startActivity(intent);
                MediaPlayer rig= MediaPlayer.create(MainActivity.this,R.raw.but);
                rig.start();
            }
        });
    }


}