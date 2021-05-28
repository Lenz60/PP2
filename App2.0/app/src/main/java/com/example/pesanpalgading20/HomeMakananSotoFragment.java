package com.example.pesanpalgading20;

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

import com.example.pesanpalgading20.Makanan.Bakso;
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
    Toolbar toolbarSoto;
    LinearLayout ContainerContentSoto;

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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_home_makanan_soto, container, false);

        ContainerContentSoto = viewRoot.findViewById(R.id.ContainerContentSoto);

        ArrayList<Soto> soto = new ArrayList<Soto>();
        soto.add (new Soto("Nasi Soto Daging Sapi", 10000 ,R.drawable.ic_launcher_background));
        soto.add (new Soto("Soto Daging Sapi (Tanpa Nasi)", 20000 ,R.drawable.ic_launcher_background));
        soto.add (new Soto("Nasi Soto Ayam", 30000 ,R.drawable.ic_launcher_background));
        soto.add (new Soto("Nasi Soto (Tanpa Nasi)", 40000 ,R.drawable.ic_launcher_background));

        SotoAdapter sotoAdapter = new SotoAdapter(getActivity(), soto);

        ListViewMenuSoto = viewRoot.findViewById(R.id.ListViewMenuSoto);
        ListViewMenuSoto.setAdapter(sotoAdapter);

        toolbarSoto = viewRoot.findViewById(R.id.ToolbarSoto);
        toolbarSoto.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarSoto.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentSoto.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMenuPilihan = new HomeMakananPilihanFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerSoto, FragmentMenuPilihan);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ListViewMenuSoto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
                switch (position) {
                    case 0 :
                        ContainerContentSoto.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Soto sotoGeter1 = (Soto) ListViewMenuSoto.getItemAtPosition(position);
                        //declare new code
                        String FoodCode1 = "ST1";
                        //get MakananName using getter
                        String FoodName1 = sotoGeter1.getmMakananName();
                        //get MakananPrice using getter
                        int FoodPrice1 = sotoGeter1.getmMakananHarga();
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
                        transaction1.replace(R.id.ContainerSoto, fragment1);
                        fragment1.setArguments(bundle1);
                        transaction1.addToBackStack(null);
                        // Commit the transaction
                        transaction1.commit();
                        break;
                    case 1:
                        ContainerContentSoto.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Soto sotoGeter2 = (Soto) ListViewMenuSoto.getItemAtPosition(position);
                        //declare new code
                        String FoodCode2 = "ST2";
                        //get MakananName using getter
                        String FoodName2 = sotoGeter2.getmMakananName();
                        //get MakananPrice using getter
                        int FoodPrice2 = sotoGeter2.getmMakananHarga();
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
                        transaction2.replace(R.id.ContainerSoto, fragment2);
                        fragment2.setArguments(bundle2);
                        transaction2.addToBackStack(null);
                        // Commit the transaction
                        transaction2.commit();
                        break;
                    case 2:
                        ContainerContentSoto.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Soto sotoGeter3 = (Soto) ListViewMenuSoto.getItemAtPosition(position);
                        //declare new code
                        String FoodCode3 = "ST3";
                        //get MakananName using getter
                        String FoodName3 = sotoGeter3.getmMakananName();
                        //get MakananPrice using getter
                        int FoodPrice3 = sotoGeter3.getmMakananHarga();
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
                        transaction3.replace(R.id.ContainerSoto, fragment3);
                        fragment3.setArguments(bundle3);
                        transaction3.addToBackStack(null);
                        // Commit the transaction
                        transaction3.commit();
                        break;

                    case 3:
                        ContainerContentSoto.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Soto sotoGeter4 = (Soto) ListViewMenuSoto.getItemAtPosition(position);
                        //declare new code
                        String FoodCode4 = "ST4";
                        //get MakananName using getter
                        String FoodName4 = sotoGeter4.getmMakananName();
                        //get MakananPrice using getter
                        int FoodPrice4 = sotoGeter4.getmMakananHarga();
                        //set the MakananPrice to String to passed to intent
                        String Price4 = String.valueOf(FoodPrice4);
                        //Pass the variables
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("FoodCode", FoodCode4);
                        bundle4.putString("FoodName", FoodName4);
                        bundle4.putString("FoodPrice", Price4);

                        Fragment fragment4 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction4.replace(R.id.ContainerSoto, fragment4);
                        fragment4.setArguments(bundle4);
                        transaction4.addToBackStack(null);
                        // Commit the transaction
                        transaction4.commit();
                        break;

                }
            }
        });

        // Inflate the layout for this fragment
        return viewRoot;
    }
}