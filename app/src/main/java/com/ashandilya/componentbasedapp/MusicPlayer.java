package com.ashandilya.componentbasedapp;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MusicPlayer extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    AudioManager audioManager;
    SeekBar seekbar,timeline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        mediaPlayer  = MediaPlayer.create(this,R.raw.testaudio);

        audioManager =(AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int myMaxVol = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int myCurrentVol = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        seekbar = findViewById(R.id.seekBar);
        seekbar.setMax(myMaxVol);
        seekbar.setProgress(myCurrentVol);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        timeline = findViewById(R.id.timeline);
        timeline.setMax(mediaPlayer.getDuration());

        timeline.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mediaPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timeline.setProgress(mediaPlayer.getCurrentPosition());
            }
        },0, 1000);
    }

    public void pauseMe(View view) {
        mediaPlayer.pause();
    }

    public void playMe(View view) {
        mediaPlayer.start();
    }

    public void DrumPad(View view) {
        Intent intent = new Intent(MusicPlayer.this,Drumpad.class);
        startActivity(intent);
    }
}
