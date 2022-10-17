package com.example.aplikacjazdjecie;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView obraz = (findViewById(R.id.obrazek));

        // max wys=700 max szer=1100
        obraz.getLayoutParams().height = 300;
        obraz.getLayoutParams().width = 500;
        obraz.setScaleType(ImageView.ScaleType.FIT_XY);

        obraz.setRotation(obraz.getRotation()+90);

        //obraz.setImageAlpha(50);


        final int semiTransparentGrey = Color.argb(155, 255, 110, 0);
        obraz.setColorFilter(semiTransparentGrey, PorterDuff.Mode.SRC_ATOP);


        SeekBar seekWys = (findViewById(R.id.seekWys));
        SeekBar seekSzer = (findViewById(R.id.seekWys2));
        SeekBar seekPrzez = (findViewById(R.id.seekWys3));
        SeekBar seekFiltrR = (findViewById(R.id.seekWys4));
        SeekBar seekFiltrG = (findViewById(R.id.seekWys5));
        SeekBar seekFiltrB = (findViewById(R.id.seekWys6));
        seekWys.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

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