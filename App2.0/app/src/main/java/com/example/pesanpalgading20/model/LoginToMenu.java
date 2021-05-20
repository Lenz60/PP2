package com.example.pesanpalgading20.model;

import android.os.Bundle;
import android.view.Menu;

import com.example.pesanpalgading20.LoginForm;
import com.example.pesanpalgading20.MenuFragment;

public class LoginToMenu extends LoginForm {
    public LoginToMenu() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, new MenuFragment()).commit();}
    }
}