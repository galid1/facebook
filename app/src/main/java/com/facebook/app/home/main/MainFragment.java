package com.facebook.app.home.main;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.app.home.main.activitylog.ActivityLogFragment;
import com.facebook.app.home.main.friendslist.FriendsListFragment;
import com.facebook.app.home.main.newsfeed.NewsfeedFragment;
import com.facebook.app.home.main.notice.NoticeFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainFragment extends Fragment {

    public static final String FRAGMENT_TAG = "MAIN";

    private FragmentManager fragmentManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        fragmentManager = getFragmentManager();
        View mainFragment = inflater.inflate(R.layout.main_fragment , container , false);
        ButterKnife.bind(this , mainFragment);
        return mainFragment;
    }

    //뉴스피드 프래그먼트 띄우기
    @OnClick(R.id.imageView_menu_newsfeed_icon)
    public void showNewsfeedFragment(){
        Fragment fragment = getFragmentManager().findFragmentById(R.id.frameLayout_eachmenuView);
        NewsfeedFragment newsfeedFragment = new NewsfeedFragment();

        if(fragment != null
                && !(fragment instanceof NewsfeedFragment)) {
            fragmentManager.beginTransaction()
                    .replace(R.id.frameLayout_eachmenuView, newsfeedFragment, NewsfeedFragment.FRAGMENT_TAG).commit();
        }
        else if(fragment == null){
            fragmentManager.beginTransaction()
                    .add(R.id.frameLayout_eachmenuView , newsfeedFragment , NewsfeedFragment.FRAGMENT_TAG).commit();
        }
    }

    //친구목록 프래그먼트 띄우기
    @OnClick(R.id.imageView_menu_friendsList_icon)
    public void showFriendsList(){
        Fragment fragment = getFragmentManager().findFragmentById(R.id.frameLayout_eachmenuView);
        FriendsListFragment newsfeedFragment = new FriendsListFragment();

        if(fragment != null
                && !(fragment instanceof FriendsListFragment)) {
            fragmentManager.beginTransaction()
                    .replace(R.id.frameLayout_eachmenuView, newsfeedFragment, FriendsListFragment.FRAGMENT_TAG).commit();
        }
        else if(fragment == null){
            fragmentManager.beginTransaction()
                    .add(R.id.frameLayout_eachmenuView , newsfeedFragment , FriendsListFragment.FRAGMENT_TAG).commit();
        }
    }

    //알림 프래그먼트 띄우기
    @OnClick(R.id.imageView_menu_notice_icon)
    public void showNoticeFragment(){
        Fragment fragment = getFragmentManager().findFragmentById(R.id.frameLayout_eachmenuView);
        NoticeFragment newsfeedFragment = new NoticeFragment();

        if(fragment != null
                && !(fragment instanceof NoticeFragment)) {
            fragmentManager.beginTransaction()
                    .replace(R.id.frameLayout_eachmenuView, newsfeedFragment, NoticeFragment.FRAGMENT_TAG).commit();
        }
        else if(fragment == null){
            fragmentManager.beginTransaction()
                    .add(R.id.frameLayout_eachmenuView , newsfeedFragment , NoticeFragment.FRAGMENT_TAG).commit();
        }
    }

    //활동로그 프래그먼트 띄우기
    @OnClick(R.id.imageView_menu_activityLog_icon)
    public void showActivityLogFragment(){
        Fragment fragment = getFragmentManager().findFragmentById(R.id.frameLayout_eachmenuView);
        ActivityLogFragment newsfeedFragment = new ActivityLogFragment();

        if(fragment != null
                && !(fragment instanceof ActivityLogFragment)) {
            fragmentManager.beginTransaction()
                    .replace(R.id.frameLayout_eachmenuView, newsfeedFragment, ActivityLogFragment.FRAGMENT_TAG).commit();
        }
        else if(fragment == null){
            fragmentManager.beginTransaction()
                    .add(R.id.frameLayout_eachmenuView , newsfeedFragment , ActivityLogFragment.FRAGMENT_TAG).commit();
        }
    }

}
