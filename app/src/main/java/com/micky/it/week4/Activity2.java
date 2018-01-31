package com.micky.it.week4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.annotation.Documented;

public class Activity2 extends AppCompatActivity {


    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv = (TextView) findViewById(R.id.tv1);


        Intent intent = getIntent();
        int temp = intent.getIntExtra("1234", 0);

        //tv.setText(temp + " ");

        tv.setText(Integer.toString(temp));


    }
}
