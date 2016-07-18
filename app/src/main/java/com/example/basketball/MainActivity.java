package com.example.basketball;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends ActionBarActivity {

    int quantity1=0;
    int quantity2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button1(View view) {
        quantity1 = quantity1 + 1;
        displayA(quantity1);
    }
    public void button2(View view) {
        quantity2 = quantity2 + 1;
        displayB(quantity2);
    }
    public void button3(View view) {
        quantity1 = quantity1 + 2;
        displayA(quantity1);
    }
    public void button4(View view) {
        quantity2 = quantity2 + 2;
        displayB(quantity2);
    }
    public void button5(View view) {
        quantity1 = quantity1 + 3;
        displayA(quantity1);
    }
    public void button6(View view) {
        quantity2 = quantity2 + 3;
        displayB(quantity2);
    }
    public void reset(View view) {
        quantity1=0;
        quantity2=0;
        displayA(quantity1);
        displayB(quantity2);
    }
    private void displayA(int number) {
        TextView quantity1 = (TextView) findViewById(
                R.id.textView4);
        quantity1.setText("" + number);
    }
    private void displayB(int number) {
        TextView quantity2 = (TextView) findViewById(
                R.id.textView5);
        quantity2.setText("" + number);
    }


}
