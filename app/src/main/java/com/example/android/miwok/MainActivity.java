package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * create own Listener class from abstract listener View.OnClickListener class
         * and override onClick method to deploy action
         *
         * OR
         * we can completely replace numbersL-> with new OnClickListener() {
         *                                                  @Override
         *                                                   public void onClick(View v) {
         *                                                      Intent intent = new Intent(MainActivity.this,NumberActivity.class);
         *                                                      startActivity(intent);
         *                                                      }
         *                                                  }
         */
        class NumbersClickListener implements OnClickListener {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(intent);
            }
        }
        NumbersClickListener numbersL = new NumbersClickListener();   // create instance of modified class listener
        TextView numbersView = (TextView) findViewById(R.id.numbers);  // create object of target TextView
        numbersView.setOnClickListener(numbersL);                     // set click listener to numbersView object

        //family
        TextView familyView = (TextView) findViewById(R.id.family);  // create object of target TextView
        familyView.setOnClickListener(new OnClickListener() {       // set click listener to numbersView object
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });

        //colors
        TextView colorsView = (TextView) findViewById(R.id.colors);  // create object of target TextView
        colorsView.setOnClickListener(new OnClickListener() {       // set click listener to numbersView object
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(intent);
            }
        });
        //phrases
        TextView phrasesView = (TextView) findViewById(R.id.phrases);  // create object of target TextView
        phrasesView.setOnClickListener(new OnClickListener() {         // set click listener to numbersView object
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }
}
