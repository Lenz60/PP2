package com.example.pesanpalgading20.Model.Menu.Makanan;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.pesanpalgading20.FragmentOrdertoCart;
import com.example.pesanpalgading20.Model.PilihanMenu.HomeMakananPilihanFragment;
import com.example.pesanpalgading20.Getter.Makanan.MieAyam;
import com.example.pesanpalgading20.R;
import com.example.pesanpalgading20.Adapter.MieAyamAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeMakananMieayamFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMakananMieayamFragment extends Fragment {

    TextView TxtvMakananHomeMieayam;
    ListView ListViewMenuMieAyam;
    Toolbar toolbarMieAyam;
    LinearLayout ContainerContentMieAyam;

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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_home_makanan_mieayam, container, false);
        TxtvMakananHomeMieayam = viewRoot.findViewById(R.id.TxtvMakananHomeMieayam);
        ContainerContentMieAyam = viewRoot.findViewById(R.id.ContainerContentMieAyam);

        final ArrayList<MieAyam> mieAyam = new ArrayList<MieAyam>();
        mieAyam.add (new MieAyam("Mie Ayam Original", 10000 ,R.drawable.ic_launcher_background));
        mieAyam.add (new MieAyam("Mie Ayam Jumbo", 16000 ,R.drawable.ic_launcher_background));
        mieAyam.add (new MieAyam("Mie Ayam Super Jumbo Komplit", 16000 ,R.drawable.ic_launcher_background));

        MieAyamAdapter mieAyamAdapter = new MieAyamAdapter(getActivity(), mieAyam);

        ListViewMenuMieAyam = viewRoot.findViewById(R.id.ListViewMenuMieAyam);
        ListViewMenuMieAyam.setAdapter(mieAyamAdapter);

        toolbarMieAyam = viewRoot.findViewById(R.id.ToolbarMieAyam);
        toolbarMieAyam.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarMieAyam.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentMieAyam.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMenuPilihan = new HomeMakananPilihanFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerMieAyam, FragmentMenuPilihan);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });



        ListViewMenuMieAyam.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
                switch (position) {
                    case 0 :
                        ContainerContentMieAyam.setVisibility(View.GONE);
                        //set getter to be called based on position
                        MieAyam mieAyamGeter1 = (MieAyam)ListViewMenuMieAyam.getItemAtPosition(position);
                        //declare new code
                        String FoodCode1 = "MA1";
                        //get MakananName using getter
                        String FoodName1 = mieAyamGeter1.getmMakananName();
                        //get MakananPrice using getter
                        int FoodPrice1 = mieAyamGeter1.getmMakananHarga();
                        //set the MakananPrice to String to passed to intent
                        String Price1 = String.valueOf(FoodPrice1);
                        //Pass the variables
                        Bundle bundle1 = new Bundle();
                        bundle1.putString("FoodCode", FoodCode1);
                        bundle1.putString("FoodName", FoodName1);
                        bundle1.putString("FoodPrice", Price1);

                        Fragment fragment1 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction1.replace(R.id.ContainerMieAyam, fragment1);
                        fragment1.setArguments(bundle1);
                        transaction1.addToBackStack(null);
                        // Commit the transaction
                        transaction1.commit();
                        break;
                    case 1:
                        ContainerContentMieAyam.setVisibility(View.GONE);
                        MieAyam mieAyamGeter2 = (MieAyam)ListViewMenuMieAyam.getItemAtPosition(position);
                        String FoodCode2 = "MA2";
                        String FoodName2 = mieAyamGeter2.getmMakananName();
                        int FoodPrice2 = mieAyamGeter2.getmMakananHarga();
                        String Price2 = String.valueOf(FoodPrice2);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("FoodCode", FoodCode2);
                        bundle2.putString("FoodName", FoodName2);
                        bundle2.putString("FoodPrice", Price2);

                        Fragment fragment2 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction2.replace(R.id.ContainerMieAyam, fragment2);
                        fragment2.setArguments(bundle2);
                        transaction2.addToBackStack(null);
                        // Commit the transaction
                        transaction2.commit();
                        break;
                    case 2:
                        ContainerContentMieAyam.setVisibility(View.GONE);
                        MieAyam mieAyamGeter3 = (MieAyam)ListViewMenuMieAyam.getItemAtPosition(position);
                        String FoodCode3 = "MA3";
                        String FoodName3 = mieAyamGeter3.getmMakananName();
                        int FoodPrice3 = mieAyamGeter3.getmMakananHarga();
                        String Price3 = String.valueOf(FoodPrice3);
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("FoodCode", FoodCode3);
                        bundle3.putString("FoodName", FoodName3);
                        bundle3.putString("FoodPrice", Price3);

                        Fragment fragment3 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction3.replace(R.id.ContainerMieAyam, fragment3);
                        fragment3.setArguments(bundle3);
                        transaction3.addToBackStack(null);
                        // Commit the transaction
                        transaction3.commit();
                        break;
                }
            }
        });

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