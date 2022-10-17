package com.example.aplikacjazdjecie;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView obraz;
TextView testTXT;
int wys=100;
int kolorR=255;
int kolorG=255;
int kolorB=255;
int alph=255;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obraz = (findViewById(R.id.obrazek));
        testTXT = (findViewById(R.id.testTXT));

        //obraz.getLayoutParams().height = 100;
        //obraz.getLayoutParams().width = 100;
        //obraz.setScaleType(ImageView.ScaleType.FIT_XY);

        //obraz.setRotation(obraz.getRotation()+90);

        //obraz.setImageAlpha(50);


        final int semiTransparentGrey = Color.argb(alph, kolorR, kolorG, kolorB);
        obraz.setColorFilter(semiTransparentGrey, PorterDuff.Mode.SRC_ATOP);


        SeekBar seekWys = (findViewById(R.id.seekWys));
        SeekBar seekPrzez = (findViewById(R.id.seekWys3));
        SeekBar seekFiltrR = (findViewById(R.id.seekWys4));
        SeekBar seekFiltrG = (findViewById(R.id.seekWys5));
        SeekBar seekFiltrB = (findViewById(R.id.seekWys6));
        seekWys.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


                wys = i;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(wys, wys);
                //obraz.setLayoutParams(params);

                //obraz.setScaleType(ImageView.ScaleType.FIT_XY);
                //obraz.getLayoutParams().height = i;
                //obraz.getLayoutParams().width = i;
                //obraz.setScaleType(ImageView.ScaleType.FIT_XY);
                testTXT.setText("fff"+i);
                obraz.setScaleX(wys/10);
                obraz.setScaleY(wys/10);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekPrzez.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                obraz.setImageAlpha(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekFiltrR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                kolorR = i;
                int semiTransparentGrey = Color.argb(alph, kolorR, kolorG, kolorB);
                obraz.setColorFilter(semiTransparentGrey, PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekFiltrG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                kolorG = i;
                int semiTransparentGrey = Color.argb(alph, kolorR, kolorG, kolorB);
                obraz.setColorFilter(semiTransparentGrey, PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekFiltrB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                kolorB = i;
                int semiTransparentGrey = Color.rgb(kolorR, kolorG, kolorB);
                obraz.setColorFilter(semiTransparentGrey, PorterDuff.Mode.SRC_ATOP);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}