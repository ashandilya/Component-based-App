package com.ashandilya.componentbasedapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Scrren1 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrren1);
        textView = findViewById(R.id.textView7);

        String myVal = getIntent().getStringExtra("Name");
        textView.setText(myVal);

       /* String myVal1 = getIntent().getStringExtra("Address");
        textView.setText(myVal1);*/
    }

    public void mainScreen(View view) {
        Intent intent = new Intent( Scrren1.this,Apps.class);
        startActivity(intent);
    }

    public void NextApp(View view) {
        Intent intent = new Intent( Scrren1.this,ExamTimer.class);
        startActivity(intent);
    }
}
