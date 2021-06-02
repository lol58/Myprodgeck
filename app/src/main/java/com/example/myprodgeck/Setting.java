package com.example.myprodgeck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Setting extends AppCompatActivity {
    Button butmis;
    Button butson;
    Button butexit;
    MediaPlayer rings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        addlistenerOnButton();
    }
    public void addlistenerOnButton() {
        butexit =(Button) findViewById(R.id.butexit);
        butson =(Button) findViewById(R.id.butson);
        butmis =(Button) findViewById(R.id.butmis);
        MediaPlayer rings= MediaPlayer.create(Setting.this,R.raw.phon);
        butexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.Menu");
                startActivity(intent);
                MediaPlayer rig= MediaPlayer.create(Setting.this,R.raw.but);
                rig.start();
            }
        });
        butmis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer rig= MediaPlayer.create(Setting.this,R.raw.but);
                rig.start();
                rings.start();
            }
        });
        butson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer rig= MediaPlayer.create(Setting.this,R.raw.but);
                rig.start();
                MainActivity.rings.stop();
            }
        });
    }
}