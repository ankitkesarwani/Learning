package com.example.ankit.learning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ankit on 6/22/2017.
 */
class LeaderboardSectionsPagerAdapter extends FragmentPagerAdapter {

    public LeaderboardSectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                LeaderboardFollowingFragment leaderboardFollowingFragment = new LeaderboardFollowingFragment();
                return leaderboardFollowingFragment;
            case 1:
                LeaderboardLocalFragment leaderboardLocalFragment = new LeaderboardLocalFragment();
                return leaderboardLocalFragment;
            case 2:
                LeaderboardGlobalFragment leaderboardGlobalFragment = new LeaderboardGlobalFragment();
                return leaderboardGlobalFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "FOLLOWING";
            case 1:
                return "LOCAL";
            case 2:
                return "GLOBAL";
            default:
                return null;
        }
    }
}
