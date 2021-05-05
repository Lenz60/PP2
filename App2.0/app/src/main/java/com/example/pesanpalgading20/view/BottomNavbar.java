package com.example.pesanpalgading20.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pesanpalgading20.CartFragment;
import com.example.pesanpalgading20.HomeFragment;
import com.example.pesanpalgading20.MenuFragment;
import com.example.pesanpalgading20.ProfileFragment;
import com.example.pesanpalgading20.R;
import com.example.pesanpalgading20.StatusFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavbar extends AppCompatActivity {
    //Declaration
    BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navbar);


        navigation = (BottomNavigationView) findViewById(R.id.navigationView);

        //default fragement
        loadFragment(new HomeFragment());

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private boolean  loadFragment(Fragment fragment) {
        //load fragment
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_container, fragment).commit();
            return true;
        }
        return false;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            =new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()){
                case R.id.navigation_Cart:
                    fragment = new CartFragment();
                    break;

                case R.id.navigation_Home:
                    fragment = new HomeFragment();
                    break;

                case R.id.navigation_Menu:
                    fragment = new MenuFragment();
                    break;

                case R.id.navigation_Status:
                    fragment = new StatusFragment();
                    break;

                case R.id.navigation_Profile:
                    fragment = new ProfileFragment();
                    break;
            }
            return loadFragment(fragment);
        }
    };
}