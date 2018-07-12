package com.facebook.app.home.main.notice;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.R;

public class NoticeFragment extends Fragment {

    public static final String FRAGMENT_TAG = "NOTICE";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View noticeFragment = inflater.inflate(R.layout.notice_fragment , container , false);
        return noticeFragment;
    }
}
