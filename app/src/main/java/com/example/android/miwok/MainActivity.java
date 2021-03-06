package com.example.android.miwok;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find instance of viewpager element in activity_main layout
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        //create an adapter
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);

        //set adapter to viewpager
        viewPager.setAdapter(adapter);

        //set viewpager for tabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
