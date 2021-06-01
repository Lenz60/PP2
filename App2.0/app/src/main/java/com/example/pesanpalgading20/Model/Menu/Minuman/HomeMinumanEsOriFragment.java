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
import com.example.pesanpalgading20.Getter.Minuman.EsOri;
import com.example.pesanpalgading20.R;
import com.example.pesanpalgading20.Adapter.EsOriAdapter;

import java.util.ArrayList;

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

        ContainerContentEsOri = viewRoot.findViewById(R.id.ContainerContentEsOri);

        ArrayList<EsOri> esOri = new ArrayList<EsOri>();
        esOri.add (new EsOri("Es Teller Palgading", 10000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Campur Gula Jawa", 10000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Pelangi", 10000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Manado", 10000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Cendol Pelangi", 10000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Cincau Hitam", 8000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Capcin (Capucino Cincau)", 8000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Es Micin (Milo Cincau)", 8000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Milkshake Oreo", 10000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Milo", 6000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Capucino", 6000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Chocolate", 6000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Teh", 4000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es / Hot Jeruk", 5000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Sirup", 5000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Saparela", 12000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Es Soda Gembira", 12000 ,R.drawable.ic_launcher_background));
        esOri.add (new EsOri("Kopi Hitam", 5000 ,R.drawable.ic_launcher_background));

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

        ListViewMenuEsOri.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
                switch (position) {
                    case 0 :
                        ContainerContentEsOri.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsOri esOriGeter1 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                        //declare new code
                        String FoodCode1 = "EO1";
                        //get MakananName using getter
                        String FoodName1 = esOriGeter1.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice1 = esOriGeter1.getmMinumanHarga();
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
                        transaction1.replace(R.id.ContainerEsOri, fragment1);
                        fragment1.setArguments(bundle1);
                        transaction1.addToBackStack(null);
                        // Commit the transaction
                        transaction1.commit();
                        break;
                    case 1:
                        ContainerContentEsOri.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsOri esOriGeter2 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                        //declare new code
                        String FoodCode2 = "EO2";
                        //get MakananName using getter
                        String FoodName2 = esOriGeter2.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice2 = esOriGeter2.getmMinumanHarga();
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
                        transaction2.replace(R.id.ContainerEsOri, fragment2);
                        fragment2.setArguments(bundle2);
                        transaction2.addToBackStack(null);
                        // Commit the transaction
                        transaction2.commit();
                    break;
                    case 2:
                        ContainerContentEsOri.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsOri esOriGeter3 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                        //declare new code
                        String FoodCode3 = "EO3";
                        //get MakananName using getter
                        String FoodName3 = esOriGeter3.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice3 = esOriGeter3.getmMinumanHarga();
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
                        transaction3.replace(R.id.ContainerEsOri, fragment3);
                        fragment3.setArguments(bundle3);
                        transaction3.addToBackStack(null);
                        // Commit the transaction
                        transaction3.commit();
                    break;

                    case 3:
                        ContainerContentEsOri.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsOri esOriGeter4 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                        //declare new code
                        String FoodCode4 = "EO4";
                        //get MakananName using getter
                        String FoodName4 = esOriGeter4.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice4 = esOriGeter4.getmMinumanHarga();
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
                        transaction4.replace(R.id.ContainerEsOri, fragment4);
                        fragment4.setArguments(bundle4);
                        transaction4.addToBackStack(null);
                        // Commit the transaction
                        transaction4.commit();
                    break;
                    case 4:
                        ContainerContentEsOri.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsOri esOriGeter5 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                        //declare new code
                        String FoodCode5 = "EO5";
                        //get MakananName using getter
                        String FoodName5 = esOriGeter5.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice5 = esOriGeter5.getmMinumanHarga();
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
                        transaction5.replace(R.id.ContainerEsOri, fragment5);
                        fragment5.setArguments(bundle5);
                        transaction5.addToBackStack(null);
                        // Commit the transaction
                        transaction5.commit();
                    break;
                    case 5:
                        ContainerContentEsOri.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsOri esOriGeter6 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                        //declare new code
                        String FoodCode6 = "EO6";
                        //get MakananName using getter
                        String FoodName6 = esOriGeter6.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice6 = esOriGeter6.getmMinumanHarga();
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
                        transaction6.replace(R.id.ContainerEsOri, fragment6);
                        fragment6.setArguments(bundle6);
                        transaction6.addToBackStack(null);
                        // Commit the transaction
                        transaction6.commit();
                    break;
                    case 6:
                        ContainerContentEsOri.setVisibility(View.GONE);
                        //set getter to be called based on position
                        EsOri esOriGeter7 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                        //declare new code
                        String FoodCode7 = "EO7";
                        //get MakananName using getter
                        String FoodName7 = esOriGeter7.getmMinumanName();
                        //get MakananPrice using getter
                        int FoodPrice7 = esOriGeter7.getmMinumanHarga();
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
                        transaction7.replace(R.id.ContainerEsOri, fragment7);
                        fragment7.setArguments(bundle7);
                        transaction7.addToBackStack(null);
                        // Commit the transaction
                        transaction7.commit();
                    break;
                        case 7:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter8 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode8 = "EO8";
                            //get MakananName using getter
                            String FoodName8 = esOriGeter8.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice8 = esOriGeter8.getmMinumanHarga();
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
                            transaction8.replace(R.id.ContainerEsOri, fragment8);
                            fragment8.setArguments(bundle8);
                            transaction8.addToBackStack(null);
                            // Commit the transaction
                            transaction8.commit();
                        break;
                        case 8:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter9 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode9 = "EO9";
                            //get MakananName using getter
                            String FoodName9 = esOriGeter9.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice9 = esOriGeter9.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price9 = String.valueOf(FoodPrice9);
                            //Pass the variables
                            Bundle bundle9 = new Bundle();
                            bundle9.putString("FoodCode", FoodCode9);
                            bundle9.putString("FoodName", FoodName9);
                            bundle9.putString("FoodPrice", Price9);

                            Fragment fragment9 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction9 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction9.replace(R.id.ContainerEsOri, fragment9);
                            fragment9.setArguments(bundle9);
                            transaction9.addToBackStack(null);
                            // Commit the transaction
                            transaction9.commit();
                        break;
                        case 9:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter10 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode10 = "EO10";
                            //get MakananName using getter
                            String FoodName10 = esOriGeter10.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice10 = esOriGeter10.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price10 = String.valueOf(FoodPrice10);
                            //Pass the variables
                            Bundle bundle10 = new Bundle();
                            bundle10.putString("FoodCode", FoodCode10);
                            bundle10.putString("FoodName", FoodName10);
                            bundle10.putString("FoodPrice", Price10);

                            Fragment fragment10 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction10 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction10.replace(R.id.ContainerEsOri, fragment10);
                            fragment10.setArguments(bundle10);
                            transaction10.addToBackStack(null);
                            // Commit the transaction
                            transaction10.commit();
                        break;
                        case 10:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter11 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode11 = "EO11";
                            //get MakananName using getter
                            String FoodName11 = esOriGeter11.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice11 = esOriGeter11.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price11 = String.valueOf(FoodPrice11);
                            //Pass the variables
                            Bundle bundle11 = new Bundle();
                            bundle11.putString("FoodCode", FoodCode11);
                            bundle11.putString("FoodName", FoodName11);
                            bundle11.putString("FoodPrice", Price11);

                            Fragment fragment11 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction11 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction11.replace(R.id.ContainerEsOri, fragment11);
                            fragment11.setArguments(bundle11);
                            transaction11.addToBackStack(null);
                            // Commit the transaction
                            transaction11.commit();
                        break;
                        case 11:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter12 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode12 = "EO12";
                            //get MakananName using getter
                            String FoodName12 = esOriGeter12.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice12 = esOriGeter12.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price12 = String.valueOf(FoodPrice12);
                            //Pass the variables
                            Bundle bundle12 = new Bundle();
                            bundle12.putString("FoodCode", FoodCode12);
                            bundle12.putString("FoodName", FoodName12);
                            bundle12.putString("FoodPrice", Price12);

                            Fragment fragment12 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction12 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction12.replace(R.id.ContainerEsOri, fragment12);
                            fragment12.setArguments(bundle12);
                            transaction12.addToBackStack(null);
                            // Commit the transaction
                            transaction12.commit();
                        break;
                        case 12:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter13 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode13 = "EO13";
                            //get MakananName using getter
                            String FoodName13 = esOriGeter13.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice13 = esOriGeter13.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price13 = String.valueOf(FoodPrice13);
                            //Pass the variables
                            Bundle bundle13 = new Bundle();
                            bundle13.putString("FoodCode", FoodCode13);
                            bundle13.putString("FoodName", FoodName13);
                            bundle13.putString("FoodPrice", Price13);

                            Fragment fragment13 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction13 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction13.replace(R.id.ContainerEsOri, fragment13);
                            fragment13.setArguments(bundle13);
                            transaction13.addToBackStack(null);
                            // Commit the transaction
                            transaction13.commit();
                        break;
                        case 13:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter14 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode14 = "EO14";
                            //get MakananName using getter
                            String FoodName14 = esOriGeter14.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice14 = esOriGeter14.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price14 = String.valueOf(FoodPrice14);
                            //Pass the variables
                            Bundle bundle14 = new Bundle();
                            bundle14.putString("FoodCode", FoodCode14);
                            bundle14.putString("FoodName", FoodName14);
                            bundle14.putString("FoodPrice", Price14);

                            Fragment fragment14 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction14 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction14.replace(R.id.ContainerEsOri, fragment14);
                            fragment14.setArguments(bundle14);
                            transaction14.addToBackStack(null);
                            // Commit the transaction
                            transaction14.commit();
                        break;
                        case 14:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter15 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode15 = "EO15";
                            //get MakananName using getter
                            String FoodName15 = esOriGeter15.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice15 = esOriGeter15.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price15 = String.valueOf(FoodPrice15);
                            //Pass the variables
                            Bundle bundle15 = new Bundle();
                            bundle15.putString("FoodCode", FoodCode15);
                            bundle15.putString("FoodName", FoodName15);
                            bundle15.putString("FoodPrice", Price15);

                            Fragment fragment15 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction15 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction15.replace(R.id.ContainerEsOri, fragment15);
                            fragment15.setArguments(bundle15);
                            transaction15.addToBackStack(null);
                            // Commit the transaction
                            transaction15.commit();
                        break;
                        case 15:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter16 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode16 = "EO16";
                            //get MakananName using getter
                            String FoodName16 = esOriGeter16.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice16 = esOriGeter16.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price16 = String.valueOf(FoodPrice16);
                            //Pass the variables
                            Bundle bundle16 = new Bundle();
                            bundle16.putString("FoodCode", FoodCode16);
                            bundle16.putString("FoodName", FoodName16);
                            bundle16.putString("FoodPrice", Price16);

                            Fragment fragment16 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction16 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction16.replace(R.id.ContainerEsOri, fragment16);
                            fragment16.setArguments(bundle16);
                            transaction16.addToBackStack(null);
                            // Commit the transaction
                            transaction16.commit();
                        break;
                        case 16:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter17 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode17 = "EO17";
                            //get MakananName using getter
                            String FoodName17 = esOriGeter17.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice17 = esOriGeter17.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price17 = String.valueOf(FoodPrice17);
                            //Pass the variables
                            Bundle bundle17 = new Bundle();
                            bundle17.putString("FoodCode", FoodCode17);
                            bundle17.putString("FoodName", FoodName17);
                            bundle17.putString("FoodPrice", Price17);

                            Fragment fragment17 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction17 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction17.replace(R.id.ContainerEsOri, fragment17);
                            fragment17.setArguments(bundle17);
                            transaction17.addToBackStack(null);
                            // Commit the transaction
                            transaction17.commit();
                        break;
                        case 17:
                            ContainerContentEsOri.setVisibility(View.GONE);
                            //set getter to be called based on position
                            EsOri esOriGeter18 = (EsOri) ListViewMenuEsOri.getItemAtPosition(position);
                            //declare new code
                            String FoodCode18 = "EO18";
                            //get MakananName using getter
                            String FoodName18 = esOriGeter18.getmMinumanName();
                            //get MakananPrice using getter
                            int FoodPrice18 = esOriGeter18.getmMinumanHarga();
                            //set the MakananPrice to String to passed to intent
                            String Price18 = String.valueOf(FoodPrice18);
                            //Pass the variables
                            Bundle bundle18 = new Bundle();
                            bundle18.putString("FoodCode", FoodCode18);
                            bundle18.putString("FoodName", FoodName18);
                            bundle18.putString("FoodPrice", Price18);

                            Fragment fragment18 = new FragmentOrdertoCart();
                            // consider using Java coding conventions (upper first char class names!!!)
                            FragmentTransaction transaction18 = getFragmentManager().beginTransaction();
                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack
                            transaction18.replace(R.id.ContainerEsOri, fragment18);
                            fragment18.setArguments(bundle18);
                            transaction18.addToBackStack(null);
                            // Commit the transaction
                            transaction18.commit();
                        break;
                }
            }
        });

        // Inflate the layout for this fragment
        return viewRoot;
    }
}