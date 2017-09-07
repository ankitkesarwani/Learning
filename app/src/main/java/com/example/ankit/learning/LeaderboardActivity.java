package com.example.ankit.learning;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class LeaderboardActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    private ViewPager mViewPager;
    private LeaderboardSectionsPagerAdapter mLeaderboardSectionsPagerAdapter;

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        mToolbar = (Toolbar) findViewById(R.id.leaderboard_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Leaderboard");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.leaderboard_tabpager);
        mLeaderboardSectionsPagerAdapter = new LeaderboardSectionsPagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(mLeaderboardSectionsPagerAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.leaderboard_tabs);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
