package com.carsquared.arkansasgameandfish;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Crappie extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crappie);

        ImageButton blackcrappiebut = (ImageButton) findViewById(R.id.blackcrappiebut);
        ImageButton whitecrappiebut = (ImageButton) findViewById(R.id.whitecrappiebut);


        blackcrappiebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishcrappieblack2);
                fishinfo.setText(R.string.blackcrappie);
            }
        });

        whitecrappiebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishcrappiewhite2);
                fishinfo.setText(R.string.whitecrappie);
            }
        });
    }
}
