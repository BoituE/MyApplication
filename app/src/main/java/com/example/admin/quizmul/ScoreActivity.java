package com.example.admin.quizmul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private Button main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView TotalScore= (TextView) findViewById(R.id.TotalScore);


        double scrip = ((MainActivity.score /5.0)*100);
        TotalScore.setText("Total Score =" + (int)scrip + "%");

    }


   public void onClickmm (View view){
        Intent i = new Intent( this,MainActivity.class);
        startActivity(i);
       MainActivity.score = 0;
    }



}
