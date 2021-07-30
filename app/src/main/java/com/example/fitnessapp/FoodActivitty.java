package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class FoodActivitty extends AppCompatActivity {
    EditText hgt,wgt;
    Button bmiBtn,nutriBtn;
    TextView bmi,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_activitty);

        hgt = findViewById(R.id.heightInput);
        wgt = findViewById(R.id.weightInput);
        bmiBtn = findViewById(R.id.bmiBtn);
        nutriBtn = findViewById(R.id.nutriBtn);
        bmi = findViewById(R.id.bmiOutput);
        result = findViewById(R.id.result);

        bmiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double height,weight,ans;
                height = Double.parseDouble(hgt.getText().toString());
                weight = Double.parseDouble(wgt.getText().toString());
                //ans = Double.valueOf(Math.round((weight/(height*height))*10000));
                ans = (weight/(height*height))*10000;
                String s = String.format("%.1f", ans);
                bmi.setText(String.valueOf(s));
                Double res = Double.parseDouble(s);
                if(res<=18.5)
                    result.setText("Underweight");
                else if(res>18.5 && res<=24.9)
                    result.setText("Normal Weight");
                else if(res>=25 && res<=29.9)
                    result.setText("Overweight");
                else if(res>=30.0)
                    result.setText("Obesity");
            }
        });

        nutriBtn.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View view) {
             Intent intent = new Intent(FoodActivitty.this,Nutrition.class);
             startActivity(intent);
            }
        });
    }


}