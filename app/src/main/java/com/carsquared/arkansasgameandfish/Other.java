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

public class Other extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        ImageButton garbut = (ImageButton) findViewById(R.id.garbut);
        ImageButton paddlefishbut = (ImageButton) findViewById(R.id.paddlefishbut);
        ImageButton shovelnosesturgeonbut = (ImageButton) findViewById(R.id.shovelnosesturgeonbut);

        garbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishalligatorgar2);
                fishinfo.setText(R.string.gar);
            }
        });

        paddlefishbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishpaddlefish2);
                fishinfo.setText(R.string.paddlefish);
            }
        });
        shovelnosesturgeonbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Green Bream");
                dialog.setContentView(R.layout.fish1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                ImageView fishimage = (ImageView) dialog.findViewById(R.id.fishimage);
                TextView fishinfo = (TextView) dialog.findViewById(R.id.fishinfo);
                fishimage.setImageResource(R.drawable.fishshovelnosesturgeon2);
                fishinfo.setText(R.string.sturgeon);
            }
        });

    }
}
