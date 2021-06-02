package com.example.myprodgeck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
     Button butsetting;
     Button butNew;
     Button butnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        addlistenerOnButton();
    }
    private void addlistenerOnButton() {
        butsetting = (Button) findViewById(R.id.butsetting);
        butsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.Setting");
                startActivity(intent);
                MediaPlayer rig= MediaPlayer.create(Menu.this,R.raw.but);
                rig.start();
            }
        });
        butNew = (Button) findViewById(R.id.butNew);
        butNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.FirstLocation");
                startActivity(intent);
                MediaPlayer rig= MediaPlayer.create(Menu.this,R.raw.but);
                rig.start();
            }
        });
        butnext = (Button) findViewById(R.id.butnext);
        butnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.FirstLocation");
                startActivity(intent);
                MediaPlayer rig= MediaPlayer.create(Menu.this,R.raw.but);
                rig.start();
            }
        });
    }
}