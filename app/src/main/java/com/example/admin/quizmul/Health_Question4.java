package com.example.admin.quizmul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Health_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health__question4);
    }
    public void onClickfls(View view) {
        Intent i = new Intent(Health_Question4.this, Health_Question5.class);
        MainActivity.score  = MainActivity.score +1;

        startActivity(i);
    }
    public void onClicktr(View view) {
        Intent i = new Intent(Health_Question4.this, Health_Question5.class);

        startActivity(i);
    }

    public void onClickbck(View view) {
        Intent i = new Intent(Health_Question4.this, Health_Question5.class);
        startActivity(i);
    }

    public void next(View view) {
        Intent intent = new Intent(this,Health_Question5.class);
        startActivity(intent);
    }

    public void onClicknxt(View view) {
        Intent i = new Intent(Health_Question4.this,Health_Question5.class);
        startActivity(i);

    }
}
