package com.ashandilya.componentbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class BurgerRating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_rating);

        final RatingBar ratingBar = findViewById(R.id.ratingBar);
        final TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float ratingValue = ratingBar.getRating();

                if(ratingValue <2 )
                {
                    textView.setText("Rating:  " + ratingValue + "\t We will try better  for time");
                }
                else if(ratingValue >2 )
                {
                    textView.setText("Rating:  " + ratingValue + "\tThanks for Rating ");
                }
                if(ratingValue >4 )
                {
                    textView.setText("Rating:  " + ratingValue + "\t Thanks for loving us so much");
                }
            }
        });


    }

    public void quickChange(View view) {
        Intent intent = new Intent(BurgerRating.this,changeBgColor.class);
        startActivity(intent);
    }
}
