package com.example.admin.quizmul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void songs(View view){
        Intent intent= new Intent(this, Songs_Question1.class);

        startActivity(intent);


    }
    public void onClicksng(View view){

        Intent i = new Intent(this,Songs_Question1.class);
        startActivity(i);

    }
    public void scrip(View view){
        Intent intent= new Intent(this, Scripture_Question1.class);

        startActivity(intent);


    }
    public void onClickscp(View view) {

        Intent i = new Intent(this,Scripture_Question1.class);
        startActivity(i);
    }
    public void health(View view){
        Intent intent= new Intent(this, Health_Question1.class);

        startActivity(intent);


    }
    public void onClickhlt(View view) {

        Intent i = new Intent(this,Health_Question1.class);
        startActivity(i);
    }

}

