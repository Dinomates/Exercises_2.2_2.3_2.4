package com.example.a22tehtv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    private Button reset, minus, plus;
    private TextView result;
    private Counter c;
    //implements View.OnClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset = findViewById(R.id.Reset);
        plus = findViewById(R.id.Plus);
        minus = findViewById(R.id.Minus);
        final TextView result = findViewById(R.id.resultText);
        final Counter c = new Counter(10,-10);
        result.setText("" + 0);
        result.setGravity(Gravity.CENTER);
        //setonClickListener
       reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c.setToZero();
                result.setText("" + c.getCurrentValue());

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c.clickedButtonMinus();
                result.setText("" + c.getCurrentValue());

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                c.clickedButtonPlus();
                result.setText("" + c.getCurrentValue());

            }
        });

/*
  //to avoid having to have a unique listener for each can simply have an onClick event
    public void clickedButton(View v){
    if (v == plus){
        c.clickedButtonPlus();
        result.setText("" + c.getCurrentValue());
    }

    if (v == minus){
        c.clickedButtonMinus();
        result.setText("" + c.getCurrentValue());
    }

    if (v == reset){
        c.setToZero();
        result.setText("" + c.getCurrentValue());
    }
    } */

    }



}

