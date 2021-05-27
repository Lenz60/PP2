package com.example.pesanpalgading20;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toolbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeMinumanPilihanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMinumanPilihanFragment extends Fragment {

    ImageView ImageViewPilihanEsOri, ImageViewPilihanEsDurian,
            ImageViewPilihanEsJus;
    LinearLayout ContainerContentPilihanMenuMinuman;
    Toolbar toolbarMinumanPilihan;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeMinumanPilihanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeMinumanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeMinumanPilihanFragment newInstance(String param1, String param2) {
        HomeMinumanPilihanFragment fragment = new HomeMinumanPilihanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_home_minuman_pilihan, container, false);
        ImageViewPilihanEsOri = viewRoot.findViewById(R.id.ImageViewPilihanMenuEsOri);
        ImageViewPilihanEsDurian = viewRoot.findViewById(R.id.ImageViewPilihanMenuEsDurian);
        ImageViewPilihanEsJus = viewRoot.findViewById(R.id.ImageViewPilihanMenuEsJus);
        ContainerContentPilihanMenuMinuman = viewRoot.findViewById(R.id.ContainerContentPilihanMenuMinuman);


        toolbarMinumanPilihan = viewRoot.findViewById(R.id.ToolbarMinumanPilihan);
        toolbarMinumanPilihan.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarMinumanPilihan.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentPilihanMenuMinuman.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentHome = new HomeFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMinuman, FragmentHome);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ImageViewPilihanEsOri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ContainerContentPilihanMenuMinuman.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMinumanEsOri = new HomeMinumanEsOriFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMinuman, FragmentMinumanEsOri);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ImageViewPilihanEsDurian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ContainerContentPilihanMenuMinuman.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMinumanEsDurian = new HomeMinumanEsDurianFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMinuman, FragmentMinumanEsDurian);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ImageViewPilihanEsJus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ContainerContentPilihanMenuMinuman.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMinumanEsJus = new HomeMinumanEsJusFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMinuman, FragmentMinumanEsJus);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });


        // Inflate the layout for this fragment
        return viewRoot;
    }
}