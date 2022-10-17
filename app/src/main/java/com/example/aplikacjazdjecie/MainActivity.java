package com.example.aplikacjazdjecie;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void klikTest(View view) {
        ImageView obraz = (findViewById(R.id.obrazek));

        // max wys=700 max szer=1100
        obraz.getLayoutParams().height = 300;
        obraz.getLayoutParams().width = 500;
        obraz.setScaleType(ImageView.ScaleType.FIT_XY);

        obraz.setRotation(obraz.getRotation()+90);

        obraz.setImageAlpha(50);


        final int semiTransparentGrey = Color.argb(155, 185, 185, 185);
        obraz.setColorFilter(semiTransparentGrey, PorterDuff.Mode.SRC_ATOP);




    }
}