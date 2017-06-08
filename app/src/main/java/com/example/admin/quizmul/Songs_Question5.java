package com.example.admin.quizmul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Songs_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs__question5);
    }
    public void onClicktsc(View view) {
        Intent i = new Intent(Songs_Question5.this, MainActivity.class);
        startActivity(i);

        MainActivity.score  = MainActivity.score +1;

        GoFinalScore();

    }

    public void onClicktjbm(View view) {
        Intent i = new Intent(Songs_Question5.this, MainActivity.class);
        startActivity(i);

        GoFinalScore();

    }

    public void onClicktsh(View view) {
        Intent i = new Intent(Songs_Question5.this, MainActivity.class);
        startActivity(i);

        GoFinalScore();
    }

    public void back(View view) {
        Intent intent = new Intent(this, Songs_Question4.class);
        startActivity(intent);
    }

    public void onClickbck(View view) {
        Intent i = new Intent(Songs_Question5.this, Songs_Question4.class);
        startActivity(i);
    }

    public void next(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClicknxt(View view) {
        Intent i = new Intent(Songs_Question5.this, MainActivity.class);
        startActivity(i);

    }


    public void GoFinalScore() {
        Intent i = new Intent(Songs_Question5.this, ScoreActivity.class);
        startActivity(i);

    }

}

