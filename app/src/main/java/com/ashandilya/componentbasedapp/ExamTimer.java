package com.ashandilya.componentbasedapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExamTimer extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    TextView textView,textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_timer);

        mediaPlayer = MediaPlayer.create(this,R.raw.four);
        textView = findViewById(R.id.textView8);
        textView1 = findViewById(R.id.textView9);
        textView2 = findViewById(R.id.textView10);

        new CountDownTimer(10000,1000){
            public void onTick(long millisecondsUntilDone)
            {
                textView1.setText("Time: " + String.valueOf(millisecondsUntilDone/1000));
            }
            public void onFinish()
            {
                textView2.setText("Done!!");
                mediaPlayer.start();
            }
        }.start();
    }

    public void musicPlayer(View view) {
        Intent intent = new Intent( ExamTimer.this,MusicPlayer.class);
        startActivity(intent);
    }
}
