package com.example.pesanpalgading20;

import android.app.ActionBar;
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
 * Use the {@link HomeMakananPilihanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMakananPilihanFragment extends Fragment {
    ImageView ImageViewPilihanMieayam, ImageViewPilihanBaksoKuah,
            ImageViewPilihanBaksoBakar, ImageViewPilihanSoto;
    LinearLayout ContainerContentPilihanMenuMakanan;
    Toolbar toolbarMakananPilihan;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeMakananPilihanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeMakananPilihanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeMakananPilihanFragment newInstance(String param1, String param2) {
        HomeMakananPilihanFragment fragment = new HomeMakananPilihanFragment();
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
        View viewRoot = inflater.inflate(R.layout.fragment_home_makanan_pilihan, container, false);
        //declare
        ImageViewPilihanMieayam = viewRoot.findViewById(R.id.ImageViewPilihanMenuMieayam);
        ImageViewPilihanBaksoKuah = viewRoot.findViewById(R.id.ImageViewPilihanMenuBaksoKuah);
        ImageViewPilihanBaksoBakar = viewRoot.findViewById(R.id.ImageViewPilihanMenuBaksoBakar);
        ImageViewPilihanSoto = viewRoot.findViewById(R.id.ImageViewPilihanMenuNasiSoto);
        ContainerContentPilihanMenuMakanan = viewRoot.findViewById(R.id.ContainerContentPilihanMenuMakanan);

        toolbarMakananPilihan = viewRoot.findViewById(R.id.ToolbarMakananPilihan);
        toolbarMakananPilihan.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarMakananPilihan.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentPilihanMenuMakanan.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentHome = new HomeFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMakanan, FragmentHome);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ImageViewPilihanMieayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentPilihanMenuMakanan.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMakananMieayam = new HomeMakananMieayamFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMakanan, FragmentMakananMieayam);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ImageViewPilihanBaksoKuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentPilihanMenuMakanan.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMakananBakso = new HomeMakananBaksoFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMakanan, FragmentMakananBakso);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ImageViewPilihanBaksoBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentPilihanMenuMakanan.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMakananBaksoBakar = new HomeMakananBaksoBakarFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMakanan, FragmentMakananBaksoBakar);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ImageViewPilihanSoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentPilihanMenuMakanan.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMakananSoto = new HomeMakananSotoFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPilihanMenuMakanan, FragmentMakananSoto);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });
        // Inflate the layout for this fragment
        return viewRoot;
    }


}