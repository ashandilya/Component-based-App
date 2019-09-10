package com.ashandilya.componentbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class dateChanger extends AppCompatActivity {

    DatePicker datePicker;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_changer);

        datePicker = findViewById(R.id.datePicker2);
        textView = findViewById(R.id.textView5);

        Calendar calendar = Calendar.getInstance();

        datePicker.init(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                textView.setText(" Day: " + dayOfMonth + " Month: " + monthOfYear + " Year: " + year);
            }
        });
    }

    public void CurrecyConverter(View view) {
        Intent intent = new Intent(dateChanger.this,convertCurrency.class);
        startActivity(intent);
    }
}
