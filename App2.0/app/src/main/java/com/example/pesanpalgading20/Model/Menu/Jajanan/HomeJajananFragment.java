package com.example.pesanpalgading20.Model.Menu.Jajanan;

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
import android.widget.Toolbar;

import com.example.pesanpalgading20.FragmentOrdertoCart;
import com.example.pesanpalgading20.HomeFragment;
import com.example.pesanpalgading20.Getter.Jajanan.Jajanan;
import com.example.pesanpalgading20.R;
import com.example.pesanpalgading20.Adapter.JajananAdapter;

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
        jajanan.add (new Jajanan("French Fries (Kentang Goreng)", 10000 ,R.drawable.jajanan));
        jajanan.add (new Jajanan("Tela-Telo", 10000 ,R.drawable.jajanan));
        jajanan.add (new Jajanan("Batagor", 10000 ,R.drawable.jajanan));

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

        ListViewMenuJajanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
                switch (position) {
                    case 0 :
                        ContainerContentJajanan.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Jajanan jajananGeter1 = (Jajanan) ListViewMenuJajanan.getItemAtPosition(position);
                        //declare new code
                        String FoodCode1 = "JJ1";
                        //get MakananName using getter
                        String FoodName1 = jajananGeter1.getmJajananName();
                        //get MakananPrice using getter
                        int FoodPrice1 = jajananGeter1.getmJajananHarga();
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
                        transaction1.replace(R.id.ContainerJajanan, fragment1);
                        fragment1.setArguments(bundle1);
                        transaction1.addToBackStack(null);
                        // Commit the transaction
                        transaction1.commit();
                    break;
                    case 1:
                        ContainerContentJajanan.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Jajanan jajananGeter2 = (Jajanan) ListViewMenuJajanan.getItemAtPosition(position);
                        //declare new code
                        String FoodCode2 = "JJ2";
                        //get MakananName using getter
                        String FoodName2 = jajananGeter2.getmJajananName();
                        //get MakananPrice using getter
                        int FoodPrice2 = jajananGeter2.getmJajananHarga();
                        //set the MakananPrice to String to passed to intent
                        String Price2 = String.valueOf(FoodPrice2);
                        //Pass the variables
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("FoodCode", FoodCode2);
                        bundle2.putString("FoodName", FoodName2);
                        bundle2.putString("FoodPrice", Price2);

                        Fragment fragment2 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction2.replace(R.id.ContainerJajanan, fragment2);
                        fragment2.setArguments(bundle2);
                        transaction2.addToBackStack(null);
                        // Commit the transaction
                        transaction2.commit();
                    break;
                    case 2:
                        ContainerContentJajanan.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Jajanan jajananGeter3 = (Jajanan) ListViewMenuJajanan.getItemAtPosition(position);
                        //declare new code
                        String FoodCode3 = "JJ3";
                        //get MakananName using getter
                        String FoodName3 = jajananGeter3.getmJajananName();
                        //get MakananPrice using getter
                        int FoodPrice3 = jajananGeter3.getmJajananHarga();
                        //set the MakananPrice to String to passed to intent
                        String Price3 = String.valueOf(FoodPrice3);
                        //Pass the variables
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("FoodCode", FoodCode3);
                        bundle3.putString("FoodName", FoodName3);
                        bundle3.putString("FoodPrice", Price3);

                        Fragment fragment3 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction3.replace(R.id.ContainerJajanan, fragment3);
                        fragment3.setArguments(bundle3);
                        transaction3.addToBackStack(null);
                        // Commit the transaction
                        transaction3.commit();
                    break;
                }
            }
        });
        // Inflate the layout for this fragment
        return viewRoot;
    }
}