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

import com.example.pesanpalgading20.Makanan.Bakso;
import com.example.pesanpalgading20.Minuman.EsOri;
import com.example.pesanpalgading20.adapter.BaksoAdapter;
import com.example.pesanpalgading20.adapter.EsOriAdapter;
import com.example.pesanpalgading20.adapter.SotoAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeMinumanEsOriFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMinumanEsOriFragment extends Fragment {

    ListView ListViewMenuEsOri;
    Toolbar toolbarEsOri;
    LinearLayout ContainerContentEsOri;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeMinumanEsOriFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeMinumanEsOriFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeMinumanEsOriFragment newInstance(String param1, String param2) {
        HomeMinumanEsOriFragment fragment = new HomeMinumanEsOriFragment();
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
        View viewRoot = inflater.inflate(R.layout.fragment_home_minuman_es_ori, container, false);

        ContainerContentEsOri = viewRoot.findViewById(R.id.ContainerrContentEsOri);

        ArrayList<EsOri> esOri = new ArrayList<EsOri>();
        esOri.add (new EsOri("Es Teller Palgading", 10000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Campur Gula Jawa", 20000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Pelangi", 30000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Manado", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Cendol Pelangi", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Cincau Hitam", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Capcin (Capucino Cincau)", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Es Micin (Milo Cincau)", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Milkshake Oreo", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Milo", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Capucino", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Chocolate", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Teh", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Jeruk", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Sirup", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Saparela", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Soda Gembira", 40000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Kopi Hitam", 40000 ,R.drawable.ic_launcher_background));

        EsOriAdapter esOriAdapter = new EsOriAdapter(getActivity(), esOri);

        ListViewMenuEsOri = viewRoot.findViewById(R.id.ListViewMenuEsOri);
        ListViewMenuEsOri.setAdapter(esOriAdapter);

        toolbarEsOri = viewRoot.findViewById(R.id.ToolbarEsOri);
        toolbarEsOri.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarEsOri.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentEsOri.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMinumanPilihan = new HomeMinumanPilihanFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerEsOri, FragmentMinumanPilihan);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        // Inflate the layout for this fragment
        return viewRoot;
    }
}