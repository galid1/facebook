package com.facebook.app.home.main.friendslist;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.R;

public class FriendsListFragment extends Fragment {

    public static final String FRAGMENT_TAG = "FRIENDSLIST";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View friendsListFragment = inflater.inflate(R.layout.friendslist_fragment , container , false);
        return friendsListFragment;
    }
}
