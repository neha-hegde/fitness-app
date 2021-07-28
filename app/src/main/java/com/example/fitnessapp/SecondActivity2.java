package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        newArray = new int[]{

                R.id.bridge_pose, R.id.jsquat_pose,R.id.squat_pose,R.id.lunge_pose,R.id.rlunge_pose,R.id.sts_pose,R.id.ksquat_pose


        };
    }

    public void Imagebuttonclicked(View view) {
        for (int i = 0; i < newArray.length; i++) {

            if (view.getId() == newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this, ThirdActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);


            }

        }

    }
}