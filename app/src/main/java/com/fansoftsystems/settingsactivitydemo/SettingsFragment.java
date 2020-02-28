package com.fansoftsystems.settingsactivitydemo;


import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;


public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }


    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }


}
