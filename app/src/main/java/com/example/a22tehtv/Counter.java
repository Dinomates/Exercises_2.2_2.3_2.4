package com.example.a22tehtv;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.a22tehtv.R;

public class Counter {
    private int currentValue, maxValue, minValue;

    public Counter(int max, int min){
        this.currentValue = 0;
        this.maxValue = max;
        this.minValue = min;
    }
    public int getCurrentValue(){
        return this.currentValue;
    }
    public void setToZero(){
        this.currentValue = 0;
    }

    public int clickedButtonPlus(){
        if(currentValue < maxValue) {
            currentValue++;
        }
        return currentValue;
    }

    public int clickedButtonMinus(){
        if(currentValue > minValue) {
            currentValue--;
        }
        return currentValue;
    }


}
