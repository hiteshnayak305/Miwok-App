package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * create onClick behaviour for numbers
     *
     * @param view
     */
    public void numbers(View view) {
        Intent intent = new Intent(MainActivity.this, NumberActivity.class);
        startActivity(intent);
    }

    /**
     * create onClick behaviour for family
     *
     * @param view
     */
    public void family(View view) {
        Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
        startActivity(intent);
    }

    /**
     * create onClick behaviour for colors
     *
     * @param view
     */
    public void colors(View view) {
        Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
        startActivity(intent);
    }

    /**
     * create onClick behaviour for phrases
     *
     * @param view
     */
    public void phrases(View view) {
        Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(intent);
    }
}
