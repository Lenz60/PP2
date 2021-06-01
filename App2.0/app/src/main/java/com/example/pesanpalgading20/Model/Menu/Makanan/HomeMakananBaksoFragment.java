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
import android.widget.Toolbar;

import com.example.pesanpalgading20.FragmentOrdertoCart;
import com.example.pesanpalgading20.Model.PilihanMenu.HomeMakananPilihanFragment;
import com.example.pesanpalgading20.Getter.Makanan.Bakso;
import com.example.pesanpalgading20.R;
import com.example.pesanpalgading20.Adapter.BaksoAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeMakananBaksoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMakananBaksoFragment extends Fragment {

    ListView ListViewMenuBakso;
    Toolbar toolbarBakso;
    LinearLayout ContainerContentBakso;

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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_home_makanan_bakso, container, false);

        ContainerContentBakso = viewRoot.findViewById(R.id.ContainerContentBakso);

        ArrayList<Bakso> bakso = new ArrayList<Bakso>();
        bakso.add (new Bakso("Bakso Hore", 12000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Yummie", 15000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Happy", 18000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Judez (Jumbo Pedezz)", 17000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Jumbo Tidak Pedas", 17000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Jumbo Isian Tetelan", 20000 ,R.drawable.ic_launcher_background));
        bakso.add (new Bakso("Bakso Bagong", 35000 ,R.drawable.ic_launcher_background));

        BaksoAdapter baksoAdapter = new BaksoAdapter(getActivity(), bakso);

        ListViewMenuBakso = viewRoot.findViewById(R.id.ListViewMenuBakso);
        ListViewMenuBakso.setAdapter(baksoAdapter);

        toolbarBakso = viewRoot.findViewById(R.id.ToolbarBakso);
        toolbarBakso.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarBakso.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentBakso.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment FragmentMenuPilihan = new HomeMakananPilihanFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerBakso, FragmentMenuPilihan);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ListViewMenuBakso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
                switch (position) {
                    case 0 :
                        ContainerContentBakso.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Bakso baksoGeter1 = (Bakso) ListViewMenuBakso.getItemAtPosition(position);
                        //declare new code
                        String FoodCode1 = "BK1";
                        //get MakananName using getter
                        String FoodName1 = baksoGeter1.getmMakananName();
                        //get MakananPrice using getter
                        int FoodPrice1 = baksoGeter1.getmMakananHarga();
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
                        transaction1.replace(R.id.ContainerBakso, fragment1);
                        fragment1.setArguments(bundle1);
                        transaction1.addToBackStack(null);
                        // Commit the transaction
                        transaction1.commit();
                        break;
                    case 1:
                        ContainerContentBakso.setVisibility(View.GONE);
                        Bakso baksoGeter2 = (Bakso) ListViewMenuBakso.getItemAtPosition(position);
                        String FoodCode2 = "BK2";
                        String FoodName2 = baksoGeter2.getmMakananName();
                        int FoodPrice2 = baksoGeter2.getmMakananHarga();
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
                        transaction2.replace(R.id.ContainerBakso, fragment2);
                        fragment2.setArguments(bundle2);
                        transaction2.addToBackStack(null);
                        // Commit the transaction
                        transaction2.commit();
                        break;
                    case 2:
                        ContainerContentBakso.setVisibility(View.GONE);
                        Bakso baksoGeter3 = (Bakso) ListViewMenuBakso.getItemAtPosition(position);
                        String FoodCode3 = "BK3";
                        String FoodName3 = baksoGeter3.getmMakananName();
                        int FoodPrice3 = baksoGeter3.getmMakananHarga();
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
                        transaction3.replace(R.id.ContainerBakso, fragment3);
                        fragment3.setArguments(bundle3);
                        transaction3.addToBackStack(null);
                        // Commit the transaction
                        transaction3.commit();
                        break;

                    case 3:
                        ContainerContentBakso.setVisibility(View.GONE);
                        Bakso baksoGeter4 = (Bakso) ListViewMenuBakso.getItemAtPosition(position);
                        String FoodCode4 = "BK4";
                        String FoodName4 = baksoGeter4.getmMakananName();
                        int FoodPrice4 = baksoGeter4.getmMakananHarga();
                        String Price4 = String.valueOf(FoodPrice4);
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("FoodCode", FoodCode4);
                        bundle4.putString("FoodName", FoodName4);
                        bundle4.putString("FoodPrice", Price4);

                        Fragment fragment4 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction4.replace(R.id.ContainerBakso, fragment4);
                        fragment4.setArguments(bundle4);
                        transaction4.addToBackStack(null);
                        // Commit the transaction
                        transaction4.commit();
                        break;
                    case 4:
                        ContainerContentBakso.setVisibility(View.GONE);
                        Bakso baksoGeter5 = (Bakso) ListViewMenuBakso.getItemAtPosition(position);
                        String FoodCode5 = "BK5";
                        String FoodName5 = baksoGeter5.getmMakananName();
                        int FoodPrice5 = baksoGeter5.getmMakananHarga();
                        String Price5 = String.valueOf(FoodPrice5);
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("FoodCode", FoodCode5);
                        bundle5.putString("FoodName", FoodName5);
                        bundle5.putString("FoodPrice", Price5);

                        Fragment fragment5 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction5 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction5.replace(R.id.ContainerBakso, fragment5);
                        fragment5.setArguments(bundle5);
                        transaction5.addToBackStack(null);
                        // Commit the transaction
                        transaction5.commit();
                        break;
                    case 5:
                        ContainerContentBakso.setVisibility(View.GONE);
                        Bakso baksoGeter6 = (Bakso) ListViewMenuBakso.getItemAtPosition(position);
                        String FoodCode6 = "BK6";
                        String FoodName6 = baksoGeter6.getmMakananName();
                        int FoodPrice6 = baksoGeter6.getmMakananHarga();
                        String Price6 = String.valueOf(FoodPrice6);
                        Bundle bundle6 = new Bundle();
                        bundle6.putString("FoodCode", FoodCode6);
                        bundle6.putString("FoodName", FoodName6);
                        bundle6.putString("FoodPrice", Price6);

                        Fragment fragment6 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction6 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction6.replace(R.id.ContainerBakso, fragment6);
                        fragment6.setArguments(bundle6);
                        transaction6.addToBackStack(null);
                        // Commit the transaction
                        transaction6.commit();
                        break;
                    case 6:
                        ContainerContentBakso.setVisibility(View.GONE);
                        Bakso baksoGeter7 = (Bakso) ListViewMenuBakso.getItemAtPosition(position);
                        String FoodCode7 = "BK7";
                        String FoodName7 = baksoGeter7.getmMakananName();
                        int FoodPrice7 = baksoGeter7.getmMakananHarga();
                        String Price7 = String.valueOf(FoodPrice7);
                        Bundle bundle7 = new Bundle();
                        bundle7.putString("FoodCode", FoodCode7);
                        bundle7.putString("FoodName", FoodName7);
                        bundle7.putString("FoodPrice", Price7);

                        Fragment fragment7 = new FragmentOrdertoCart();
                        // consider using Java coding conventions (upper first char class names!!!)
                        FragmentTransaction transaction7 = getFragmentManager().beginTransaction();
                        // Replace whatever is in the fragment_container view with this fragment,
                        // and add the transaction to the back stack
                        transaction7.replace(R.id.ContainerBakso, fragment7);
                        fragment7.setArguments(bundle7);
                        transaction7.addToBackStack(null);
                        // Commit the transaction
                        transaction7.commit();
                        break;
                }
            }
        });

        // Inflate the layout for this fragment
        return viewRoot;
    }
}