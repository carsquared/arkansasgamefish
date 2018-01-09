package com.carsquared.arkansasgameandfish;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Catfish extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catfish);

        ImageButton bluecatfishbut = (ImageButton) findViewById(R.id.bluecatfishbut);
        ImageButton blackbhcatfishbut = (ImageButton) findViewById(R.id.blackbhcatfishbut);
        ImageButton brownbhbut = (ImageButton) findViewById(R.id.brownbhbut);
        ImageButton yellowbhcatbut = (ImageButton) findViewById(R.id.yellowbhcatbut);
        ImageButton channelcatbut = (ImageButton) findViewById(R.id.channelcatbut);
        ImageButton flatheadcatbut = (ImageButton) findViewById(R.id.flatheadcatbut);

        bluecatfishbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishcatfishblue2);
                fishinfo.setText(R.string.bluecat);
            }
        });
        blackbhcatfishbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishcatfishblackbullhead2);
                fishinfo.setText(R.string.blackbullhead);
            }
        });
        brownbhbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishcatfishbrownbullhead2);
                fishinfo.setText(R.string.brownbullhead);
            }
        });

        yellowbhcatbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishcatfishyellowbullhead2);
                fishinfo.setText(R.string.yellowbullhead);
            }
        });
        channelcatbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishcatfishchannel2);
                fishinfo.setText(R.string.channelcat);
            }
        });
        flatheadcatbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishcatfishflathead2);
                fishinfo.setText(R.string.flatheadcat);
            }
        });


    }
}
