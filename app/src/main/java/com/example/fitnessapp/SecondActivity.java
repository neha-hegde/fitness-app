package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        newArray = new int[]{

                R.id.mountain_pose, R.id.crunch_pose, R.id.cycle_pose, R.id.leg_pose, R.id.heel_pose, R.id.ek_pose, R.id.situp_pose, R.id.scissor_pose, R.id.legraise_pose, R.id.twist_pose, R.id.toe_pose


        };

    }

    public void Imagebuttonclicked(View view) {


        for (int i = 0; i < newArray.length; i++) {

            if (view.getId() == newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);


            }

        }

    }
}