package com.example.ankit.learning;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Toolbar mToolbar;

    private ViewPager mViewPager;
    private MainSectionsPagerAdapter mMainSectionsPagerAdapter;

    private TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Learning");

        mViewPager = (ViewPager) findViewById(R.id.main_tabpager);
        mMainSectionsPagerAdapter = new MainSectionsPagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(mMainSectionsPagerAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.main_tabs);
        mTabLayout.setupWithViewPager(mViewPager);

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();

        if(currentUser == null) {

            sendToStart();

        }

    }

    private void sendToStart() {

        Intent mainIntent = new Intent(MainActivity.this, StartActivity.class);
        startActivity(mainIntent);
        finish();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.main_leaderboard) {

            Intent leaderboardIntent = new Intent(MainActivity.this, LeaderboardActivity.class);
            startActivity(leaderboardIntent);

        }


        if(item.getItemId() == R.id.main_invite_friends) {

            Intent inviteIntent = new Intent(MainActivity.this, InviteFriendsActivity.class);
            startActivity(inviteIntent);

        }

        if(item.getItemId() == R.id.main_quiz_factory) {

            Intent quizIntent = new Intent(MainActivity.this, QuizFactoryActivity.class);
            startActivity(quizIntent);

        }

        if(item.getItemId() == R.id.main_rate) {

            Intent rateIntent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(rateIntent);

        }

        if(item.getItemId() == R.id.main_feedback) {

            Intent feedbackIntent = new Intent(MainActivity.this, FeedbackActivity.class);
            startActivity(feedbackIntent);

        }

        if(item.getItemId() == R.id.main_settings) {

            Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(settingsIntent);

        }

        if(item.getItemId() == R.id.main_logout) {

            FirebaseAuth.getInstance().signOut();
            sendToStart();

        }

        if(item.getItemId() == R.id.main_user_profile) {

            Intent userProfileIntent = new Intent(MainActivity.this, UserProfileActivity.class);
            startActivity(userProfileIntent);

        }

        if(item.getItemId() == R.id.main_notification) {

            Intent notificationIntent = new Intent(MainActivity.this, NotificationActivity.class);
            startActivity(notificationIntent);

        }

        return true;
    }


}
