package com.facebook.app.home.main.activitylog;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.R;

public class ActivityLogFragment extends Fragment {

    public static final String FRAGMENT_TAG = "ACTIVITYLOG";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View activityLogFragment = inflater.inflate(R.layout.activitylog_fragment , container , false);
        return activityLogFragment;
    }
}
