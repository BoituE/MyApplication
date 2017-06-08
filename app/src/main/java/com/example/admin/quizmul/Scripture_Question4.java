package com.example.admin.quizmul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Scripture_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture__question4);
    }

    public void onClickfls(View view) {
        Intent i = new Intent(Scripture_Question4.this, Scripture_Question5.class);
        startActivity(i);
        MainActivity.score = MainActivity.score +1;
        Toast.makeText(this, ""+MainActivity.score, Toast.LENGTH_SHORT).show();
    }
    public void onClicktr(View view) {
        Intent i = new Intent(Scripture_Question4.this, Scripture_Question5.class);
        startActivity(i);
    }

    public void onClickbck(View view) {
        Intent i = new Intent(Scripture_Question4.this, Scripture_Question3.class);
        startActivity(i);
    }

    public void next(View view) {
        Intent intent = new Intent(this,Scripture_Question5.class);
        startActivity(intent);
    }

    public void onClicknxt(View view) {
        Intent i = new Intent(Scripture_Question4.this,Scripture_Question5.class);
        startActivity(i);

    }
}
