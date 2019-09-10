package com.ashandilya.componentbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Apps extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
        editText = findViewById(R.id.editText);
    }

    public void screen1(View view) {

        String val = editText.getText().toString();

        if(val.length() == 0)
        {
            editText.setError("No value found");
        }else
        {
            Intent intent = new Intent( Apps.this,Scrren1.class);
            intent.putExtra("Name",val);
            //intent.putExtra("Address",val);

            startActivity(intent);
        }


    }
}
