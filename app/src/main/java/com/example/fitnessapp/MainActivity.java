package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        button1= findViewById(R.id.startab);
        button2= findViewById(R.id.startlower);
        button3= findViewById(R.id.startupper);
        button4= findViewById(R.id.startfull);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity3.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity4.class);
                startActivity(intent);
            }
        });




    }


    public void abworkout(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);



    }

    public void lowerbody(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity2.class);
        startActivity(intent);




    }

    public void upperbody(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity3.class);
        startActivity(intent);



    }

    public void fullbody(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity4.class);
        startActivity(intent);


    }



    public void food(View view) {
        Intent intent = new Intent(MainActivity.this, FoodActivitty.class);
        startActivity(intent);
    }
}