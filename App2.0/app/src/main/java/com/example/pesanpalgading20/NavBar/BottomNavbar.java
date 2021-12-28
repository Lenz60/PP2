package com.example.pesanpalgading20.NavBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.example.pesanpalgading20.CartFragment;
import com.example.pesanpalgading20.HomeFragment;
import com.example.pesanpalgading20.LoginForm;
import com.example.pesanpalgading20.MenuFragment;
import com.example.pesanpalgading20.Model.SharedPrefManager.SharedPrefmanager;
import com.example.pesanpalgading20.ProfileFragment;
import com.example.pesanpalgading20.R;
import com.example.pesanpalgading20.StatusFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavbar extends AppCompatActivity {
    //Declaration
    SharedPrefmanager sharedPrefmanager;
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
//                case R.id.navigation_Cart:
//                    fragment = new CartFragment();
//                    break;

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

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();

            //moveTaskToBack(false);

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setTitle("Keluar")
                .setMessage("Apakah anda ingin kembali ke menu login ?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {

                        Intent intent = new Intent(getBaseContext(), LoginForm.class);
                        sharedPrefmanager.getInstance(BottomNavbar.this).logout();
                        startActivity(intent);
                        //close();


                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();

    }
}