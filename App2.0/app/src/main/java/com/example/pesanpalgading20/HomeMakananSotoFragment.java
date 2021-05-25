package com.example.pesanpalgading20;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.pesanpalgading20.Makanan.MieAyam;
import com.example.pesanpalgading20.Makanan.Soto;
import com.example.pesanpalgading20.adapter.MieAyamAdapter;
import com.example.pesanpalgading20.adapter.SotoAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeMakananSotoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMakananSotoFragment extends Fragment {

    ListView ListViewMenuSoto;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeMakananSotoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeMakananSotoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeMakananSotoFragment newInstance(String param1, String param2) {
        HomeMakananSotoFragment fragment = new HomeMakananSotoFragment();
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
        View viewRoot = inflater.inflate(R.layout.fragment_home_makanan_soto, container, false);

        ArrayList<Soto> soto = new ArrayList<Soto>();
        soto.add (new Soto("Nasi Soto Daging Sapi", 10000 ,R.drawable.ic_launcher_background));
        soto.add (new Soto("Soto Daging Sapi (Tanpa Nasi)", 20000 ,R.drawable.ic_launcher_background));
        soto.add (new Soto("Nasi Soto Ayam", 30000 ,R.drawable.ic_launcher_background));
        soto.add (new Soto("Nasi Soto (Tanpa Nasi)", 40000 ,R.drawable.ic_launcher_background));

        SotoAdapter sotoAdapter = new SotoAdapter(getActivity(), soto);

        ListViewMenuSoto = viewRoot.findViewById(R.id.ListViewMenuSoto);
        ListViewMenuSoto.setAdapter(sotoAdapter);

        // Inflate the layout for this fragment
        return viewRoot;
    }
}