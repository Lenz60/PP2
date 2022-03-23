package com.example.pesanpalgading20.Model.Menu.Minuman;

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
import com.example.pesanpalgading20.Model.PilihanMenu.HomeMinumanPilihanFragment;
import com.example.pesanpalgading20.Getter.Minuman.EsJus;
import com.example.pesanpalgading20.R;
import com.example.pesanpalgading20.Adapter.EsJusAdapter;

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
        esJus.add (new EsJus("Juice Melon", 8000 ,R.drawable.minuman));
        esJus.add (new EsJus("Juice Mangga", 8000 ,R.drawable.minuman));
        esJus.add (new EsJus("Juice Alpukat", 10000 ,R.drawable.minuman));
        esJus.add (new EsJus("Juice Semangka", 18000 ,R.drawable.minuman));
        esJus.add (new EsJus("Juice Jambu Merah", 8000 ,R.drawable.minuman));
        esJus.add (new EsJus("Juice Sirsat", 8000 ,R.drawable.minuman));
        esJus.add (new EsJus("Juice Durian", 10000 ,R.drawable.minuman));
        esJus.add (new EsJus("Juice Jeruk", 8000 ,R.drawable.minuman));

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

        ListViewMenuEsJus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
                switch (position) {
                    case 0 :
                        ContainerContentEsJus.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsJus esJusGeter1 = (EsJus) ListViewMenuEsJus.getItemAtPosition(position);
                        //declare new code
                        String FoodCode1 = "EJ1";
                        //get MakananName using getter
                        String FoodName1 = esJusGeter1.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice1 = esJusGeter1.getmMinumanHarga();
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
                        transaction1.replace(R.id.ContainerEsJus, fragment1);
                        fragment1.setArguments(bundle1);
                        transaction1.addToBackStack(null);
                        // Commit the transaction
                        transaction1.commit();
                        break;
                    case 1:
                        ContainerContentEsJus.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsJus esJusGeter2 = (EsJus) ListViewMenuEsJus.getItemAtPosition(position);
                        //declare new code
                        String FoodCode2 = "EJ2";
                        //get MakananName using getter
                        String FoodName2 = esJusGeter2.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice2 = esJusGeter2.getmMinumanHarga();
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
                        transaction2.replace(R.id.ContainerEsJus, fragment2);
                        fragment2.setArguments(bundle2);
                        transaction2.addToBackStack(null);
                        // Commit the transaction
                        transaction2.commit();
                    break;
                    case 2:
                        ContainerContentEsJus.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsJus esJusGeter3 = (EsJus) ListViewMenuEsJus.getItemAtPosition(position);
                        //declare new code
                        String FoodCode3 = "EJ3";
                        //get MakananName using getter
                        String FoodName3 = esJusGeter3.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice3 = esJusGeter3.getmMinumanHarga();
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
                        transaction3.replace(R.id.ContainerEsJus, fragment3);
                        fragment3.setArguments(bundle3);
                        transaction3.addToBackStack(null);
                        // Commit the transaction
                        transaction3.commit();
                    break;

                    case 3:
                        ContainerContentEsJus.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsJus esJusGeter4 = (EsJus) ListViewMenuEsJus.getItemAtPosition(position);
                        //declare new code
                        String FoodCode4 = "EJ4";
                        //get MakananName using getter
                        String FoodName4 = esJusGeter4.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice4 = esJusGeter4.getmMinumanHarga();
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
                        transaction4.replace(R.id.ContainerEsJus, fragment4);
                        fragment4.setArguments(bundle4);
                        transaction4.addToBackStack(null);
                        // Commit the transaction
                        transaction4.commit();
                    break;
                    case 4:
                        ContainerContentEsJus.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsJus esJusGeter5 = (EsJus) ListViewMenuEsJus.getItemAtPosition(position);
                        //declare new code
                        String FoodCode5 = "EJ5";
                        //get MakananName using getter
                        String FoodName5 = esJusGeter5.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice5 = esJusGeter5.getmMinumanHarga();
                        //set the MakananPrice to String to passed to intent
                        String Price5 = String.valueOf(FoodPrice5);
                        //Pass the variables
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("FoodCode", FoodCode5);
                        bundle5.putString("FoodName", FoodName5);
                        bundle5.putString("FoodPrice", Price5);

                        Fragment fragment5 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction5 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction5.replace(R.id.ContainerEsJus, fragment5);
                        fragment5.setArguments(bundle5);
                        transaction5.addToBackStack(null);
                        // Commit the transaction
                        transaction5.commit();
                    break;
                    case 5:
                        ContainerContentEsJus.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsJus esJusGeter6 = (EsJus) ListViewMenuEsJus.getItemAtPosition(position);
                        //declare new code
                        String FoodCode6 = "EJ6";
                        //get MakananName using getter
                        String FoodName6 = esJusGeter6.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice6 = esJusGeter6.getmMinumanHarga();
                        //set the MakananPrice to String to passed to intent
                        String Price6 = String.valueOf(FoodPrice6);
                        //Pass the variables
                        Bundle bundle6 = new Bundle();
                        bundle6.putString("FoodCode", FoodCode6);
                        bundle6.putString("FoodName", FoodName6);
                        bundle6.putString("FoodPrice", Price6);

                        Fragment fragment6 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction6 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction6.replace(R.id.ContainerEsJus, fragment6);
                        fragment6.setArguments(bundle6);
                        transaction6.addToBackStack(null);
                        // Commit the transaction
                        transaction6.commit();
                    break;
                    case 6:
                        ContainerContentEsJus.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsJus esJusGeter7 = (EsJus) ListViewMenuEsJus.getItemAtPosition(position);
                        //declare new code
                        String FoodCode7 = "EJ7";
                        //get MakananName using getter
                        String FoodName7 = esJusGeter7.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice7 = esJusGeter7.getmMinumanHarga();
                        //set the MakananPrice to String to passed to intent
                        String Price7 = String.valueOf(FoodPrice7);
                        //Pass the variables
                        Bundle bundle7 = new Bundle();
                        bundle7.putString("FoodCode", FoodCode7);
                        bundle7.putString("FoodName", FoodName7);
                        bundle7.putString("FoodPrice", Price7);

                        Fragment fragment7 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction7 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction7.replace(R.id.ContainerEsJus, fragment7);
                        fragment7.setArguments(bundle7);
                        transaction7.addToBackStack(null);
                        // Commit the transaction
                        transaction7.commit();
                    break;
                    case 7:
                        ContainerContentEsJus.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsJus esJusGeter8 = (EsJus) ListViewMenuEsJus.getItemAtPosition(position);
                        //declare new code
                        String FoodCode8 = "EJ8";
                        //get MakananName using getter
                        String FoodName8 = esJusGeter8.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice8 = esJusGeter8.getmMinumanHarga();
                        //set the MakananPrice to String to passed to intent
                        String Price8 = String.valueOf(FoodPrice8);
                        //Pass the variables
                        Bundle bundle8 = new Bundle();
                        bundle8.putString("FoodCode", FoodCode8);
                        bundle8.putString("FoodName", FoodName8);
                        bundle8.putString("FoodPrice", Price8);

                        Fragment fragment8 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction8 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction8.replace(R.id.ContainerEsJus, fragment8);
                        fragment8.setArguments(bundle8);
                        transaction8.addToBackStack(null);
                        // Commit the transaction
                        transaction8.commit();
                    break;
                }
            }
        });


        // Inflate the layout for this fragment
        return viewRoot;
    }
}