package com.carsquared.arkansasgameandfish;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent search = new Intent();
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button breambut = (Button) findViewById(R.id.breambut);
        Button catbut = (Button) findViewById(R.id.catbut);
        Button bassbut = (Button) findViewById(R.id.bassbut);
        Button crappiebut = (Button) findViewById(R.id.crappiebut);
        Button otherbut = (Button) findViewById(R.id.otherbut);
        final Intent fart = new Intent();


        breambut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fart.setClass(getApplicationContext(), Bream.class);
                startActivity(fart);
            }
        });

        catbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fart.setClass(getApplicationContext(), Catfish.class);
                startActivity(fart);
            }
        });

        bassbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fart.setClass(getApplicationContext(), Bass.class);
                startActivity(fart);
            }
        });

        crappiebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fart.setClass(getApplicationContext(), Crappie.class);
                startActivity(fart);
            }
        });

        otherbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fart.setClass(getApplicationContext(), Other.class);
                startActivity(fart);
            }
        });

    }
}
