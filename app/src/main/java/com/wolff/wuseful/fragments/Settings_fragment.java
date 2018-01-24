package com.wolff.wuseful.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wolff.wuseful.R;

/**
 * Created by wolff on 13.07.2017.
 */

public class Settings_fragment extends PreferenceFragment {

//    @Override
//    public void onCreatePreferences(Bundle bundle, String s) {
//        addPreferencesFromResource(R.xml.preferences_general);
//    }

    public static Settings_fragment newInstance(){
        return new Settings_fragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences_general);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Настройки");

    }
}
