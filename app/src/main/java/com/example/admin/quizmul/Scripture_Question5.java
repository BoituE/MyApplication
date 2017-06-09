
package com.example.admin.quizmul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Scripture_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture__question5);
    }


    public void onClickfls(View view) {
        Intent i = new Intent(Scripture_Question5.this, MainActivity.class);
        startActivity(i);

           GoFinalScore();
    }
    public void onClicktr(View view) {
        Intent i = new Intent(Scripture_Question5.this, MainActivity.class);
        startActivity(i);
        MainActivity.score = MainActivity.score +1;
         GoFinalScore();
    }

    public void onClickbck(View view) {
        Intent i = new Intent(Scripture_Question5.this,Scripture_Question4.class);
        startActivity(i);
    }

    public void next(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void onClicknxt(View view) {
        Intent i = new Intent(Scripture_Question5.this,MainActivity.class);
        startActivity(i);

    }
    public void GoFinalScore() {
        Intent i = new Intent(this, ScoreActivity.class);
        startActivity(i);
    }

    }
