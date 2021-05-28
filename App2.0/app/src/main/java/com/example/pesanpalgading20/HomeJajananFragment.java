package com.example.pesanpalgading20;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toolbar;

import com.example.pesanpalgading20.Jajanan.Jajanan;
import com.example.pesanpalgading20.Minuman.EsJus;
import com.example.pesanpalgading20.adapter.EsJusAdapter;
import com.example.pesanpalgading20.adapter.JajananAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeJajananFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeJajananFragment extends Fragment {

    ListView ListViewMenuJajanan;
    Toolbar toolbarJajanan;
    LinearLayout ContainerContentJajanan;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeJajananFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JajananHomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeJajananFragment newInstance(String param1, String param2) {
        HomeJajananFragment fragment = new HomeJajananFragment();
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
        View viewRoot = inflater.inflate(R.layout.fragment_jajanan_home, container, false);
        ContainerContentJajanan = viewRoot.findViewById(R.id.ContainerContentJajanan);

        ArrayList<Jajanan> jajanan = new ArrayList<Jajanan>();
        jajanan.add (new Jajanan("French Fries (Kentang Goreng)", 10000 ,R.drawable.ic_launcher_background));
        jajanan.add (new Jajanan("Tela-Telo", 20000 ,R.drawable.ic_launcher_background));
        jajanan.add (new Jajanan("Batagor", 30000 ,R.drawable.ic_launcher_background));

        JajananAdapter jajananAdapter = new JajananAdapter(getActivity(), jajanan);

        ListViewMenuJajanan = viewRoot.findViewById(R.id.ListViewJajanan);
        ListViewMenuJajanan.setAdapter(jajananAdapter);

        toolbarJajanan = viewRoot.findViewById(R.id.ToolbarJajanan);
        toolbarJajanan.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarJajanan.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentJajanan.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentHome = new HomeFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerJajanan, FragmentHome);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });



        // Inflate the layout for this fragment
        return viewRoot;
    }
}