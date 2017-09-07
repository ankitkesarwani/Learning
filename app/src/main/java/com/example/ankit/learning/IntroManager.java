package com.example.ankit.learning;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ankit on 6/18/2017.
 */

public class IntroManager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    public IntroManager(Context context) {

        this.context = context;
        pref = context.getSharedPreferences("first", 0);
        editor = pref.edit();

    }

    public void setFirst(boolean isFirst) {

        editor.putBoolean("check", isFirst);
        editor.commit();

    }

    public boolean Check() {

        return pref.getBoolean("check", true);

    }

}
