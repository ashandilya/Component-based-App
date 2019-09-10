package com.ashandilya.componentbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class timeChanger extends AppCompatActivity {

    TimePicker timePicker;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_changer);
        timePicker = findViewById(R.id.timePicker);
        textView = findViewById(R.id.textView4);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView.setText("Hour: " + hourOfDay + " Minute: " + minute);
            }
        });

    }

    public void datechanger(View view) {
        Intent intent = new Intent(timeChanger.this,dateChanger.class);
        startActivity(intent);
    }
}
