package com.example.calculator_constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String numbersText = "";
    private TextView expressionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expressionTextView= (TextView) findViewById(R.id.expressionTextView);
    }


    @SuppressLint("NonConstantResourceId")
    public void numberClicked (View view) {
        numbersText += ((TextView) view).getText();

        expressionTextView.setText(numbersText);
    }
}