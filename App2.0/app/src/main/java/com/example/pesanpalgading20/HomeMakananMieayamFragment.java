package com.example.pesanpalgading20;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pesanpalgading20.Makanan.MieAyam;
import com.example.pesanpalgading20.adapter.MieAyamAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeMakananMieayamFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMakananMieayamFragment extends Fragment {

    TextView TxtvMakananHomeMieayam;
    ListView ListViewMenuMieAyam;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeMakananMieayamFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeMakanan.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeMakananMieayamFragment newInstance(String param1, String param2) {
        HomeMakananMieayamFragment fragment = new HomeMakananMieayamFragment();
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
        View viewRoot = inflater.inflate(R.layout.fragment_home_makanan_mieayam, container, false);
        TxtvMakananHomeMieayam = viewRoot.findViewById(R.id.TxtvMakananHomeMieayam);

        ArrayList<MieAyam> mieAyam = new ArrayList<MieAyam>();
        mieAyam.add (new MieAyam("Mie Ayam Original", 10000 ,R.drawable.ic_launcher_background));
        mieAyam.add (new MieAyam("Mie Ayam Jumbo", 20000 ,R.drawable.ic_launcher_background));
        mieAyam.add (new MieAyam("Mie Ayam Super Jumbo Komplit", 30000 ,R.drawable.ic_launcher_background));
        mieAyam.add (new MieAyam("Mie Ayam Original", 40000 ,R.drawable.ic_launcher_background));

        MieAyamAdapter mieAyamAdapter = new MieAyamAdapter(getActivity(), mieAyam);

        ListViewMenuMieAyam = viewRoot.findViewById(R.id.ListViewMenuMieAyam);
        ListViewMenuMieAyam.setAdapter(mieAyamAdapter);

        /// get Variable passed from login ///

//        String Nama = getActivity().getIntent().getExtras().getString("nama").toString();
////        String NoMeja = args.getString("noMejaFinal");
////        String KodeMeja = args.getString("kodeMeja");
//        /////////////////////////////////////////////
//        // set the TextView Nama with Passed variable //
//        TxtvMakananHome.setText(Nama);

        // Inflate the layout for this fragment
        return viewRoot;
    }
}