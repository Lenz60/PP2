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

import com.example.pesanpalgading20.Minuman.EsDurian;
import com.example.pesanpalgading20.Minuman.EsJus;
import com.example.pesanpalgading20.adapter.EsDurianAdapter;
import com.example.pesanpalgading20.adapter.EsJusAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeMinumanEsJusFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMinumanEsJusFragment extends Fragment {

    ListView ListViewMenuEsJus;
    Toolbar toolbarEsJus;
    LinearLayout ContainerContentEsJus;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeMinumanEsJusFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeMinumanEsJusFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeMinumanEsJusFragment newInstance(String param1, String param2) {
        HomeMinumanEsJusFragment fragment = new HomeMinumanEsJusFragment();
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
        View viewRoot = inflater.inflate(R.layout.fragment_home_minuman_es_jus, container, false);
        ContainerContentEsJus = viewRoot.findViewById(R.id.ContainerContentEsJus);

        ArrayList<EsJus> esJus = new ArrayList<EsJus>();
        esJus.add (new EsJus("Juice Melon", 10000 ,R.drawable.ic_launcher_background));
        esJus.add (new EsJus("Juice Mangga", 20000 ,R.drawable.ic_launcher_background));
        esJus.add (new EsJus("Juice Alpukat", 30000 ,R.drawable.ic_launcher_background));
        esJus.add (new EsJus("Juice Semangka", 40000 ,R.drawable.ic_launcher_background));
        esJus.add (new EsJus("Juice Jambu Merah", 40000 ,R.drawable.ic_launcher_background));
        esJus.add (new EsJus("Juice Sirsat", 40000 ,R.drawable.ic_launcher_background));
        esJus.add (new EsJus("Juice Durian", 40000 ,R.drawable.ic_launcher_background));
        esJus.add (new EsJus("Juice Jeruk", 40000 ,R.drawable.ic_launcher_background));

        EsJusAdapter esJusAdapter = new EsJusAdapter(getActivity(), esJus);

        ListViewMenuEsJus = viewRoot.findViewById(R.id.ListViewMenuEsJus);
        ListViewMenuEsJus.setAdapter(esJusAdapter);

        toolbarEsJus = viewRoot.findViewById(R.id.ToolbarEsJus);
        toolbarEsJus.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarEsJus.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentEsJus.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMinumanPilihan = new HomeMinumanPilihanFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerEsJus, FragmentMinumanPilihan);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });


        // Inflate the layout for this fragment
        return viewRoot;
    }
}