package com.example.pesanpalgading20.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.pesanpalgading20.ViewMenuHome.JajananMenuFragment;
import com.example.pesanpalgading20.ViewMenuHome.MakananMenuFragment;
import com.example.pesanpalgading20.ViewMenuHome.MinumanMenuFragment;

public class MenuTabAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MenuTabAdapter(Context context, FragmentManager fm, int totalTabs){
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    //fragment per tabs

    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                MakananMenuFragment makananMenuFragment = new MakananMenuFragment();
                return makananMenuFragment;
            case 1:
                MinumanMenuFragment minumanMenuFragment = new MinumanMenuFragment();
                return minumanMenuFragment;
            case 2:
                JajananMenuFragment jajananMenuFragment = new JajananMenuFragment();
                return jajananMenuFragment;
            default: MakananMenuFragment makananMenuFragment1 = new MakananMenuFragment();
                return makananMenuFragment1;
        }
    }

    //counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
