package com.example.ankit.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Course extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        mToolbar = (Toolbar) findViewById(R.id.course_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Course");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
