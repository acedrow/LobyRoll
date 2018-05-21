package com.example.lobyroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public TextView resultsDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultsDisplay = findViewById(R.id.resultsDisplay);
    }

    public void d4 (View view){
        int result =  randomRange(1, 4);
        resultsDisplay.setText("" + result);
    }

    public void d6 (View view){
        int result =  randomRange(1, 6);
        resultsDisplay.setText("" + result);
    }

    public void d8 (View view){
        int result =  randomRange(1, 8);
        resultsDisplay.setText("" + result);
    }

    public void d10 (View view){
        int result =  randomRange(1, 10);
        resultsDisplay.setText("" + result);
    }

    public void d12 (View view){
        int result =  randomRange(1, 12);
        resultsDisplay.setText("" + result);
    }

    public void d20 (View view){
        int result =  randomRange(1, 20);
        resultsDisplay.setText("" + result);
    }

    public void d100 (View view){
        int result =  randomRange(1, 100);
        resultsDisplay.setText("" + result);
    }

    public int randomRange (int min, int max){
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
}
