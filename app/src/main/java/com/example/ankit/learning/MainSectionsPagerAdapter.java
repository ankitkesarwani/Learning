package com.example.ankit.learning;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ankit on 6/22/2017.
 */
class MainSectionsPagerAdapter extends FragmentPagerAdapter {

    public MainSectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                LearnFragment learnFragment = new LearnFragment();
                return learnFragment;
            case 1:
                PlayFragment playFragment = new PlayFragment();
                return playFragment;
            case 2:
                ActivityFeedFragment activityFeedFragment = new ActivityFeedFragment();
                return activityFeedFragment;
            case 3:
                CodePlaygroundFragment codePlaygroundFragment = new CodePlaygroundFragment();
                return codePlaygroundFragment;
            case 4:
                QADiscussion qaDiscussion = new QADiscussion();
                return qaDiscussion;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 5;
    }

    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Learn";
            case 1:
                return "Play";
            case 2:
                return "Activity Feed";
            case 3:
                return "Code Playground";
            case 4:
                return "Q&A Discussion";
            default:
                return null;
        }
    }
}