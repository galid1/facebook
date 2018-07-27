package com.facebook.app.home;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.R;
import com.facebook.app.home.main.MainFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class HomeActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        ButterKnife.bind(this);

        fragmentManager = getFragmentManager();
        showMainFragment();
    }

    public void showMainFragment(){
        // null 이 아니면서 MainFragment가 아닌경우
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_totalarea);
        MainFragment mainFragment = new MainFragment();

        if(fragment != null
                && !(fragment instanceof MainFragment)){
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_totalarea, mainFragment,MainFragment.FRAGMENT_TAG).commit();
        }else if(fragment == null){
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_totalarea, mainFragment,MainFragment.FRAGMENT_TAG).commit();
        }
    }

    @OnClick(R.id.editText_search)
    public void showSearchFragment(){
        Toast.makeText(this , "Search!!" , Toast.LENGTH_LONG).show();
    }

}
