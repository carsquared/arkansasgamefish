package com.carsquared.arkansasgameandfish;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Bream extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bream);

        ImageButton bluegillbut = (ImageButton) findViewById(R.id.bluegillbut);
        ImageButton greenbreambut = (ImageButton) findViewById(R.id.greensfbreambut);
        ImageButton longearsunbreambut = (ImageButton) findViewById(R.id.longearsunbreambut);
        ImageButton redearbreambut = (ImageButton) findViewById(R.id.redearbreambut);
        ImageButton warmouthbreambut = (ImageButton) findViewById(R.id.warmouthbreambut);




        bluegillbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Blue Gill Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishbreambluegill2);
                fishinfo.setText(R.string.bluegill);

            }
        });

        greenbreambut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishbreamgreensunfish2);
                fishinfo.setText(R.string.greensunfish);
            }
        });

        longearsunbreambut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishbreamlongearsunfish2);
                fishinfo.setText(R.string.longearsunfish);
            }
        });

        redearbreambut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishbreamredear2);
                fishinfo.setText(R.string.redear);
            }
        });

        warmouthbreambut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishbreamwarmouth2);
                fishinfo.setText(R.string.warmouth);
            }
        });

    }
}
