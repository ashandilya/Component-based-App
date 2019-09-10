package com.ashandilya.componentbasedapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class changeBgColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_bg_color);

        final ConstraintLayout constraintLayout = findViewById(R.id.layout);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.radioBlue:
                        constraintLayout.setBackgroundColor(Color.parseColor("#8B78E6"));
                        break;
                    case R.id.radioGreen:
                        constraintLayout.setBackgroundColor(Color.parseColor("#01CBC6"));
                        break;
                    case R.id.radioRed:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FF3031"));
                        break;
                }
            }
        });

    }

    public void seekBar(View view) {
        Intent intent = new Intent(changeBgColor.this,Seekbar.class);
        startActivity(intent);
    }
}
