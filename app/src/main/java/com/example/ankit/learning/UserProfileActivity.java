package com.example.ankit.learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class UserProfileActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        mToolbar = (Toolbar) findViewById(R.id.user_profile_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("User Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.profile_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId() == R.id.profile_leaderboard) {

            Intent leaderboardIntent = new Intent(UserProfileActivity.this, LeaderboardActivity.class);
            startActivity(leaderboardIntent);

        }


        if(item.getItemId() == R.id.profile_invite_friends) {

            Intent inviteIntent = new Intent(UserProfileActivity.this, InviteFriendsActivity.class);
            startActivity(inviteIntent);

        }

        if(item.getItemId() == R.id.profile_share) {

            Intent shareIntent = new Intent(UserProfileActivity.this, UserProfileActivity.class);
            startActivity(shareIntent);

        }

        if(item.getItemId() == R.id.profile_edit) {

            Intent editProfileIntent = new Intent(UserProfileActivity.this, EditProfile.class);
            startActivity(editProfileIntent);

        }

        if(item.getItemId() == R.id.profile_settings) {

            Intent settingsIntent = new Intent(UserProfileActivity.this, SettingsActivity.class);
            startActivity(settingsIntent);

        }

        if(item.getItemId() == R.id.profile_discover) {

            Intent discoverIntent = new Intent(UserProfileActivity.this, DiscoverPeers.class);
            startActivity(discoverIntent);

        }

        return true;
    }

}
