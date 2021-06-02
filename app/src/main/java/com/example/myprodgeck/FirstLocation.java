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
import android.widget.ImageView;
import android.widget.TextView;

public class FirstLocation extends AppCompatActivity {


    Tabl tabl = new Tabl();
    Delay delay = new Delay();
    public Animation a;
    public static int reprot ;
    public int line =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_location);
        addlistenerOnButton();
        final TextView textView0 = (TextView) findViewById(R.id.textView0);
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        final TextView textView6 = (TextView) findViewById(R.id.textView6);
        final TextView textView7 = (TextView) findViewById(R.id.textView7);
        final TextView textView8 = (TextView) findViewById(R.id.textView8);
        final TextView textView9 = (TextView) findViewById(R.id.textView9);
        final TextView textView10 = (TextView) findViewById(R.id.textView10);
        final TextView textView11 = (TextView) findViewById(R.id.textView11);
        final TextView textView12 = (TextView) findViewById(R.id.textView12);
        final TextView textView13 = (TextView) findViewById(R.id.textView13);
        final TextView textView14 = (TextView) findViewById(R.id.textView14);
        final TextView textView15 = (TextView) findViewById(R.id.textView15);
        final TextView textView16 = (TextView) findViewById(R.id.textView16);
        final TextView textView17 = (TextView) findViewById(R.id.textView17);
        final TextView textView18 = (TextView) findViewById(R.id.textView18);
        final TextView textView19 = (TextView) findViewById(R.id.textView19);
        final TextView textView20 = (TextView) findViewById(R.id.textView20);
        final TextView textView21 = (TextView) findViewById(R.id.textView21);
        final TextView textView22 = (TextView) findViewById(R.id.textView22);
        final TextView textView23 = (TextView) findViewById(R.id.textView23);
        final TextView textView24 = (TextView) findViewById(R.id.textView24);
        final TextView textView25 = (TextView) findViewById(R.id.textView25);
        final TextView textView26 = (TextView) findViewById(R.id.textView26);
        final TextView textView27 = (TextView) findViewById(R.id.textView27);
        final TextView textView28 = (TextView) findViewById(R.id.textView28);
        final TextView textView29 = (TextView) findViewById(R.id.textView29);
        final TextView textView30 = (TextView) findViewById(R.id.textView30);
        final TextView textView31 = (TextView) findViewById(R.id.textView31);
        final TextView textView32 = (TextView) findViewById(R.id.textView32);
        final TextView textView33 = (TextView) findViewById(R.id.textView33);
        final TextView textView34 = (TextView) findViewById(R.id.textView34);
        final TextView textView35 = (TextView) findViewById(R.id.textView35);
        final ImageView photo1 = (ImageView) findViewById(R.id.hpoto1);
        final Button butone1 = (Button) findViewById(R.id.butone1);
        final Button butone2 = (Button) findViewById(R.id.butone2);
        final Button butone3 = (Button) findViewById(R.id.butone3);

        textView0.setText(tabl.firstloc[0]);
        textView1.setText(tabl.firstloc[1]);
        textView2.setText(tabl.firstloc[2]);
        textView3.setText(tabl.firstloc[3]);
        textView4.setText(tabl.firstloc[4]);
        textView5.setText(tabl.firstloc[5]);
        textView6.setText(tabl.firstloc[6]);
        textView7.setText(tabl.firstloc[7]);
        textView8.setText(tabl.firstloc[8]);
        textView9.setText(tabl.firstloc[9]);
        textView10.setText(tabl.firstloc[10]);
        textView11.setText(tabl.firstloc[11]);
        textView12.setText(tabl.firstloc[12]);
        textView13.setText(tabl.firstloc[13]);
        textView14.setText(tabl.firstloc[14]);
        textView15.setText(tabl.firstloc[15]);
        textView16.setText(tabl.firstloc[16]);
        textView17.setText(tabl.firstloc[17]);
        textView18.setText(tabl.firstloc[18]);
        textView19.setText(tabl.firstloc[19]);
        textView20.setText(tabl.firstloc[20]);
        textView21.setText(tabl.firstloc[21]);
        textView22.setText(tabl.firstloc[22]);
        textView23.setText(tabl.firstloc[23]);
        textView24.setText(tabl.firstloc[24]);
        textView25.setText(tabl.firstloc[25]);
        textView26.setText(tabl.firstloc[26]);
        textView27.setText(tabl.firstloc[27]);
        textView28.setText(tabl.firstloc[28]);
        textView29.setText(tabl.firstloc[29]);
        textView30.setText(tabl.firstloc[30]);
        textView31.setText(tabl.firstloc[31]);
        textView32.setText(tabl.firstloc[32]);
        textView33.setText(tabl.firstloc[33]);
        textView34.setText(tabl.firstloc[34]);
        textView35.setText(tabl.firstloc[35]);

        textView0.setVisibility(View.INVISIBLE);
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        textView17.setVisibility(View.INVISIBLE);
        textView18.setVisibility(View.INVISIBLE);
        textView19.setVisibility(View.INVISIBLE);
        textView20.setVisibility(View.INVISIBLE);
        textView21.setVisibility(View.INVISIBLE);
        textView22.setVisibility(View.INVISIBLE);
        textView23.setVisibility(View.INVISIBLE);
        textView24.setVisibility(View.INVISIBLE);
        textView25.setVisibility(View.INVISIBLE);
        textView26.setVisibility(View.INVISIBLE);
        textView27.setVisibility(View.INVISIBLE);
        textView28.setVisibility(View.INVISIBLE);
        textView29.setVisibility(View.INVISIBLE);
        textView30.setVisibility(View.INVISIBLE);
        textView31.setVisibility(View.INVISIBLE);
        textView32.setVisibility(View.INVISIBLE);
        textView33.setVisibility(View.INVISIBLE);
        textView34.setVisibility(View.INVISIBLE);
        textView35.setVisibility(View.INVISIBLE);
        photo1.setVisibility(View.INVISIBLE);
        butone1.setVisibility(View.INVISIBLE);
        butone2.setVisibility(View.INVISIBLE);
        butone3.setVisibility(View.INVISIBLE);

        delay.execute();




    }

    public void addlistenerOnButton() {
        final Button butone1 = (Button) findViewById(R.id.butone1);
        butone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.endbad");
                startActivity(intent);
                MediaPlayer rig= MediaPlayer.create(FirstLocation.this,R.raw.but);
                rig.start();
               reprot =1;
            }
        });
        final Button butone2 = (Button) findViewById(R.id.butone2);
        butone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.endgood");
                startActivity(intent);
                MediaPlayer rig= MediaPlayer.create(FirstLocation.this,R.raw.but);
                rig.start();
            }
        });
        final Button butone3 = (Button) findViewById(R.id.butone3);
        butone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.endbad");
                startActivity(intent);
                MediaPlayer rig= MediaPlayer.create(FirstLocation.this,R.raw.but);
                rig.start();
               reprot=3;
            }
        });
    }

    class Delay extends AsyncTask<Void, Integer, Void>{
        @Override
        protected Void doInBackground(Void... params) {
            while (line<=40){
                publishProgress(line++);
                try {
                    Thread.sleep(2000);
                    if (isCancelled()) return null;

                }catch (Exception e){}

            }
            return null;
        }

        @Override
        protected void onProgressUpdate (Integer... values) {
            final TextView textView0 = (TextView) findViewById(R.id.textView0);
            final TextView textView1 = (TextView) findViewById(R.id.textView1);
            final TextView textView2 = (TextView) findViewById(R.id.textView2);
            final TextView textView3 = (TextView) findViewById(R.id.textView3);
            final TextView textView4 = (TextView) findViewById(R.id.textView4);
            final TextView textView5 = (TextView) findViewById(R.id.textView5);
            final TextView textView6 = (TextView) findViewById(R.id.textView6);
            final TextView textView7 = (TextView) findViewById(R.id.textView7);
            final TextView textView8 = (TextView) findViewById(R.id.textView8);
            final TextView textView9 = (TextView) findViewById(R.id.textView9);
            final TextView textView10 = (TextView) findViewById(R.id.textView10);
            final TextView textView11 = (TextView) findViewById(R.id.textView11);
            final TextView textView12 = (TextView) findViewById(R.id.textView12);
            final TextView textView13 = (TextView) findViewById(R.id.textView13);
            final TextView textView14 = (TextView) findViewById(R.id.textView14);
            final TextView textView15 = (TextView) findViewById(R.id.textView15);
            final TextView textView16 = (TextView) findViewById(R.id.textView16);
            final TextView textView17 = (TextView) findViewById(R.id.textView17);
            final TextView textView18 = (TextView) findViewById(R.id.textView18);
            final TextView textView19 = (TextView) findViewById(R.id.textView19);
            final TextView textView20 = (TextView) findViewById(R.id.textView20);
            final TextView textView21 = (TextView) findViewById(R.id.textView21);
            final TextView textView22 = (TextView) findViewById(R.id.textView22);
            final TextView textView23 = (TextView) findViewById(R.id.textView23);
            final TextView textView24 = (TextView) findViewById(R.id.textView24);
            final TextView textView25 = (TextView) findViewById(R.id.textView25);
            final TextView textView26 = (TextView) findViewById(R.id.textView26);
            final TextView textView27 = (TextView) findViewById(R.id.textView27);
            final TextView textView28 = (TextView) findViewById(R.id.textView28);
            final TextView textView29 = (TextView) findViewById(R.id.textView29);
            final TextView textView30 = (TextView) findViewById(R.id.textView30);
            final TextView textView31 = (TextView) findViewById(R.id.textView31);
            final TextView textView32 = (TextView) findViewById(R.id.textView32);
            final TextView textView33 = (TextView) findViewById(R.id.textView33);
            final TextView textView34 = (TextView) findViewById(R.id.textView34);
            final TextView textView35 = (TextView) findViewById(R.id.textView35);
            final ImageView photo1 = (ImageView) findViewById(R.id.hpoto1);
            final Button butone1 = (Button) findViewById(R.id.butone1);
            final Button butone2 = (Button) findViewById(R.id.butone2);
            final Button butone3 = (Button) findViewById(R.id.butone3);


            final Animation a = AnimationUtils.loadAnimation(FirstLocation.this,R.anim.alpha);

            switch (line){
                case 1: textView0.setVisibility(View.VISIBLE); textView0.startAnimation(a);break;
                case  2: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a);break;
                case  3: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a);break;
                case  4: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a);break;
                case  5: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a);break;
                case  6: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a);break;
                case  7: photo1.setVisibility(View.VISIBLE);  photo1.startAnimation(a);break;
                case  8: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a);break;
                case  9: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a);break;
                case  10: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a);break;
                case  11: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a);break;
                case  12: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a);break;
                case  13: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a);break;
                case  14: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a);break;
                case  15: textView13.setVisibility(View.VISIBLE); textView13.startAnimation(a);break;
                case  16: textView14.setVisibility(View.VISIBLE); textView14.startAnimation(a);break;
                case  17: textView15.setVisibility(View.VISIBLE); textView15.startAnimation(a);break;
                case  18: textView16.setVisibility(View.VISIBLE); textView16.startAnimation(a);break;
                case  19: textView17.setVisibility(View.VISIBLE); textView17.startAnimation(a);break;
                case  20: textView18.setVisibility(View.VISIBLE); textView18.startAnimation(a);break;
                case  21: textView19.setVisibility(View.VISIBLE); textView19.startAnimation(a);break;
                case  22: textView20.setVisibility(View.VISIBLE); textView20.startAnimation(a);break;
                case  23: textView21.setVisibility(View.VISIBLE); textView21.startAnimation(a);break;
                case  24: textView22.setVisibility(View.VISIBLE); textView22.startAnimation(a);break;
                case  25: textView23.setVisibility(View.VISIBLE); textView23.startAnimation(a);break;
                case  26: textView24.setVisibility(View.VISIBLE); textView24.startAnimation(a);break;
                case  27: textView25.setVisibility(View.VISIBLE); textView25.startAnimation(a);break;
                case  28: textView26.setVisibility(View.VISIBLE); textView26.startAnimation(a);break;
                case  29: textView27.setVisibility(View.VISIBLE); textView27.startAnimation(a);break;
                case  30: textView28.setVisibility(View.VISIBLE); textView28.startAnimation(a);break;
                case  31: textView29.setVisibility(View.VISIBLE); textView29.startAnimation(a);break;
                case  32: textView30.setVisibility(View.VISIBLE); textView30.startAnimation(a);break;
                case  33: textView31.setVisibility(View.VISIBLE); textView31.startAnimation(a);break;
                case  34: textView32.setVisibility(View.VISIBLE); textView32.startAnimation(a);break;
                case  35: textView33.setVisibility(View.VISIBLE); textView33.startAnimation(a);break;
                case  36: textView34.setVisibility(View.VISIBLE); textView34.startAnimation(a);break;
                case  37: textView35.setVisibility(View.VISIBLE); textView35.startAnimation(a);break;
                case  38: butone1.setVisibility(View.VISIBLE);butone1.startAnimation(a);break;
                case  39: butone2.setVisibility(View.VISIBLE);butone2.startAnimation(a);break;
                case  40: butone3.setVisibility(View.VISIBLE);butone3.startAnimation(a);break;
                default:break;
            }
        }
    }
}