package com.example.admin.quizmul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Health_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health__question5);
    }

    public void onClickfls(View view) {
        Intent i = new Intent(Health_Question5.this, MainActivity.class);
        MainActivity.score  = MainActivity.score +1;
        GoFinalScore();
        startActivity(i);
    }

    public void onClicktr(View view) {
        Intent i = new Intent(Health_Question5.this, MainActivity.class);
        startActivity(i);
        GoFinalScore();

    }

    public void onClickbck(View view) {
        Intent i = new Intent(Health_Question5.this, Scripture_Question4.class);
        startActivity(i);
        GoFinalScore();

    }

    public void next(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClicknxt(View view) {
        Intent i = new Intent(Health_Question5.this, MainActivity.class);
        startActivity(i);

    }

    public void GoFinalScore() {
        Intent i = new Intent(Health_Question5.this, ScoreActivity.class);
        startActivity(i);


    }


}