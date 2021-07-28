package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity4 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second4);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        newArray = new int[]{

                R.id.mountain_pose,R.id.crunch_pose,R.id.cycle_pose,R.id.heel_pose,R.id.scissor_pose,R.id.twist_pose,R.id.bridge_pose,R.id.toe_pose, R.id.squat_pose,R.id.lunge_pose,R.id.rlunge_pose,R.id.staps_pose,R.id.udplank_pose,R.id.armc_pose

        };

    }

    public void Imagebuttonclicked(View view) {
        for (int i = 0; i < newArray.length; i++) {

            if (view.getId() == newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(SecondActivity4.this, ThridActivity4.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);


            }

        }


    }
}