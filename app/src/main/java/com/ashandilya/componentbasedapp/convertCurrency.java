package com.ashandilya.componentbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class convertCurrency extends AppCompatActivity {

    TextView textView;
    EditText editText;

    Button Cur1,Cur2,Cur3,Cur4,Cur5,Cur6,Cur7,Cur8,Cur9;

    LinearLayout linearLayout,linearLayout1,linearLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_currency);

        textView = findViewById(R.id.textView6);
        editText = findViewById(R.id.inputCurrency);

        Cur1 = findViewById(R.id.cur1);
        Cur2 = findViewById(R.id.cur2);
        Cur3 = findViewById(R.id.cur3);
        Cur4 = findViewById(R.id.cur4);
        Cur5 = findViewById(R.id.cur5);
        Cur6 = findViewById(R.id.cur6);
        Cur7 = findViewById(R.id.cur7);
        Cur8 = findViewById(R.id.cur8);
        Cur9 = findViewById(R.id.cur9);

    /*    linearLayout = findViewById(R.id.linearLayout);
        linearLayout1 = findViewById(R.id.linearLayout2);
        linearLayout2 = findViewById(R.id.layout3);*/

    Cur1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String a = editText.getText().toString();

            if(TextUtils.isEmpty(a))
            {
                editText.setError("Empty user Input");
            }else
            {
                double n,k;
                n = Double.parseDouble(a);
                textView.setText(null);
                Formatter formatter = new Formatter();
                k = n*0.012;
                DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                textView.setText("" + decimalFormat.format(k));
                textView.setText("" + k);
            }
        }
    });

        Cur2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user Input");
                }else
                {
                    double n,k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*88.06;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    textView.setText("" + decimalFormat.format(k));
                    textView.setText("" + k);
                }
            }
        });

        Cur3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user Input");
                }else
                {
                    double n,k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*778210.48;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    textView.setText("" + decimalFormat.format(k));
                    textView.setText("" + k);
                }
            }
        });

        Cur4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user Input");
                }else
                {
                    double n,k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.67;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    textView.setText("" + decimalFormat.format(k));
                    textView.setText("" + k);
                }
            }
        });

        Cur5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user Input");
                }else
                {
                    double n,k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.85;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    textView.setText("" + decimalFormat.format(k));
                    textView.setText("" + k);
                }
            }
        });

        Cur6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user Input");
                }else
                {
                    double n,k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*2.34;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    textView.setText("" + decimalFormat.format(k));
                    textView.setText("" + k);
                }
            }
        });

        Cur7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user Input");
                }else
                {
                    double n,k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.60;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    textView.setText("" + decimalFormat.format(k));
                    textView.setText("" + k);
                }
            }
        });

        Cur8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user Input");
                }else
                {
                    double n,k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*1.09;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    textView.setText("" + decimalFormat.format(k));
                    textView.setText("" + k);
                }
            }
        });

        Cur9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                if(TextUtils.isEmpty(a))
                {
                    editText.setError("Empty user Input");
                }else
                {
                    double n,k;
                    n = Double.parseDouble(a);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n*0.020;
                    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                    textView.setText("" + decimalFormat.format(k));
                    textView.setText("" + k);
                }
            }
        });

    }

    public void nextApp(View view) {
        Intent intent = new Intent(convertCurrency.this,Apps.class);
        startActivity(intent);
    }
}
