package com.example.pesanpalgading20.sliders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.pesanpalgading20.R;
import com.bumptech.glide.Glide;



public class ScreenSlidePageFragment extends Fragment {

    public ScreenSlidePageFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_home, container, false);
        return rootView;
    }
}