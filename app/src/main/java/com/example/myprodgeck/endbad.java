package com.example.myprodgeck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class endbad extends AppCompatActivity {

    Tabl tabl = new Tabl();
    Dulay dulay = new Dulay();
    public Animation a;
    public int line =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endbad);
        addlistenerOnButton();
        final TextView textView0 = (TextView) findViewById(R.id.textView0);
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        final Button but = (Button) findViewById(R.id.but);

        if (FirstLocation.reprot==1){
            textView0.setText(tabl.but1[0]);
            textView1.setText(tabl.but1[1]);
            textView2.setText(tabl.but1[2]);
            textView3.setText(tabl.but1[3]);
            textView4.setText(tabl.but1[4]);

        }
        else if(FirstLocation.reprot==3){
            textView0.setText(tabl.but3[0]);
            textView1.setText(tabl.but3[1]);
            textView2.setText(tabl.but3[2]);
            textView3.setText(tabl.but3[3]);
            textView4.setText(tabl.but3[4]);

        }
        textView0.setVisibility(View.INVISIBLE);
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        but.setVisibility(View.INVISIBLE);

        dulay.execute();
  }

    private void addlistenerOnButton() {
        final Button but = (Button) findViewById(R.id.but);
            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent("android.intent.action.Menu");
                    startActivity(intent);
                    MediaPlayer rig = MediaPlayer.create(endbad.this, R.raw.but);
                    rig.start();
                }
            });
    }

    class Dulay extends AsyncTask<Void, Integer, Void> {
            @Override
            protected Void doInBackground(Void... params) {
                while (line <= 7) {
                    publishProgress(line++);
                    try {
                        Thread.sleep(2000);
                        if (isCancelled()) return null;

                    } catch (Exception e) {
                    }

                }
                return null;
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                final TextView textView0 = (TextView) findViewById(R.id.textView0);
                final TextView textView1 = (TextView) findViewById(R.id.textView1);
                final TextView textView2 = (TextView) findViewById(R.id.textView2);
                final TextView textView3 = (TextView) findViewById(R.id.textView3);
                final TextView textView4 = (TextView) findViewById(R.id.textView4);
                final TextView textView5 = (TextView) findViewById(R.id.textView5);
                final Button but = (Button) findViewById(R.id.but);
                final Animation a = AnimationUtils.loadAnimation(endbad.this, R.anim.alpha);

                switch (line) {
                    case 1: textView0.setVisibility(View.VISIBLE); textView0.startAnimation(a);break;
                    case  2: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a);break;
                    case  3: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a);break;
                    case  4: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a);break;
                    case  5: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a);break;
                    case  6: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a);break;
                    case  7: but.setVisibility(View.VISIBLE);  but.startAnimation(a);break;
                    default:
                        break;
                }
            }

    }
}