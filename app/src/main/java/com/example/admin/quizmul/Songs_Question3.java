package com.example.admin.quizmul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Songs_Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs__question3);
    }

    public void onClickjys(View view) {
        Intent i = new Intent(Songs_Question3.this, Songs_Question4.class);
        startActivity(i);

    }

    public void onClicknws(View view) {
        Intent i = new Intent(Songs_Question3.this, Songs_Question4.class);
        startActivity(i);

        MainActivity.score = MainActivity.score +1;

    }

    public void onClickwwr(View view) {
        Intent i = new Intent(Songs_Question3.this, Songs_Question4.class);
        startActivity(i);

    }

    public void back(View view) {
        Intent intent = new Intent(this, Songs_Question2.class);
        startActivity(intent);
    }

    public void onClickbck(View view) {
        Intent i = new Intent(Songs_Question3.this, Songs_Question2.class);
        startActivity(i);
    }

    public void next(View view) {
        Intent intent = new Intent(this, Songs_Question4.class);
        startActivity(intent);
    }

    public void onClicknxt(View view) {
        Intent i = new Intent(Songs_Question3.this,Songs_Question4.class);
        startActivity(i);

    }

}


