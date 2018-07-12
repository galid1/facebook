package com.facebook.app.home.main.newsfeed;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.R;

public class NewsfeedFragment extends Fragment {

    public static final String FRAGMENT_TAG = "NEWSFEED";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View newsfeedFragment = inflater.inflate(R.layout.newsfeed_fragment , container , false);

        return newsfeedFragment;
    }
}
