package com.example.pesanpalgading20;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.pesanpalgading20.Makanan.Bakso;
import com.example.pesanpalgading20.adapter.BaksoAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeMakananBaksoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMakananBaksoFragment extends Fragment {

    ListView ListViewMenuBakso;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeMakananBaksoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeMakananBaksoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeMakananBaksoFragment newInstance(String param1, String param2) {
        HomeMakananBaksoFragment fragment = new HomeMakananBaksoFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_home_makanan_bakso, container, false);

        ArrayList<Bakso> bakso = new ArrayList<Bakso>();
        bakso.add (new Bakso("Bakso Hore", 10000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Yummie", 20000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Happy", 30000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Judez (Jumbo Pedezz)", 40000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Jumbo Tidak Pedas", 40000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Jumbo Isian Tetelan", 40000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Bagong", 40000 ,R.drawable.ic_launcher_background));

        BaksoAdapter baksoAdapter = new BaksoAdapter(getActivity(), bakso);

        ListViewMenuBakso = viewRoot.findViewById(R.id.ListViewMenuBakso);
        ListViewMenuBakso.setAdapter(baksoAdapter);

        // Inflate the layout for this fragment
        return viewRoot;
    }
}