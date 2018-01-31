package com.micky.it.week4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button map;
    Button btn;
    EditText edt1;
    EditText edt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        map = (Button) findViewById(R.id.map);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(edt1.getText().toString());
                int n2 = Integer.parseInt(edt2.getText().toString());

                int result =  n1 + n2;

                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                intent.putExtra("1234",result);
                startActivity(intent);
            }

        });


        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String geoCode = "google.streetview:cbll=41.5020952,-81.6789717&cbp=1,270,,45,1&mz=1";

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);
            }
        });
    }



}



