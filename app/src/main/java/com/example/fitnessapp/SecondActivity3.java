package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity3 extends AppCompatActivity {

    int[] newArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second3);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        newArray = new int[]{

                R.id.dips_pose,R.id.praise_pose,R.id.push_pose,R.id.staps_pose,R.id.udplank_pose,R.id.armc_pose,R.id.arms_pose


        };
    }

    public void Imagebuttonclicked(View view) {

        for (int i = 0; i < newArray.length; i++) {

            if (view.getId() == newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(SecondActivity3.this, ThirdActivity3.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);


            }

        }

    }
}