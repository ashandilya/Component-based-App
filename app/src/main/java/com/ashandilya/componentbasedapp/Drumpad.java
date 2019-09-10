package com.ashandilya.componentbasedapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Drumpad extends AppCompatActivity {

    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;

    ImageButton imgBtn1,imgBtn2,imgBtn3,imgBtn4,imgBtn5,imgBtn6,imgBtn7,imgBtn8,imgBtn9,imgBtn10,imgBtn11,imgBtn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drumpad);

        m1 = MediaPlayer.create(this,R.raw.one);
        m2 = MediaPlayer.create(this,R.raw.two);
        m3 = MediaPlayer.create(this,R.raw.three);
        m4 = MediaPlayer.create(this,R.raw.four);
        m5 = MediaPlayer.create(this,R.raw.sixth);
        m6 = MediaPlayer.create(this,R.raw.seventh);
        m7 = MediaPlayer.create(this,R.raw.eighth);
        m8 = MediaPlayer.create(this,R.raw.fv);
        m9 = MediaPlayer.create(this,R.raw.eighth);
        m10 = MediaPlayer.create(this,R.raw.one);
        m11 = MediaPlayer.create(this,R.raw.two);
        m12 = MediaPlayer.create(this,R.raw.three);

        imgBtn1 = findViewById(R.id.imageButton1);
        imgBtn2 = findViewById(R.id.imageButton2);
        imgBtn3= findViewById(R.id.imageButton3);
        imgBtn4 = findViewById(R.id.imageButton4);
        imgBtn5 = findViewById(R.id.imageButton5);
        imgBtn6 = findViewById(R.id.imageButton6);
        imgBtn7 = findViewById(R.id.imageButton7);
        imgBtn8 = findViewById(R.id.imageButton8);
        imgBtn9 = findViewById(R.id.imageButton9);
        imgBtn10 = findViewById(R.id.imageButton10);
        imgBtn11 = findViewById(R.id.imageButton11);
        imgBtn12 = findViewById(R.id.imageButton12);

        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
            }
        });
        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.start();
            }
        });
        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.start();
            }
        });
        imgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.start();
            }
        });
        imgBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5.start();
            }
        });
        imgBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m6.start();
            }
        });
        imgBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m7.start();
            }
        });
        imgBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m8.start();
            }
        });
        imgBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m9.start();
            }
        });
        imgBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m10.start();
            }
        });
        imgBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m11.start();
            }
        });
        imgBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m12.start();
            }
        });
    }
}
