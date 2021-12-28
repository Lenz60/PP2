package com.example.pesanpalgading20.Model.PilihanMenu;

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

import com.example.pesanpalgading20.Adapter.MieAyamAdapter;
import com.example.pesanpalgading20.Adapter.PromoAdapter;
import com.example.pesanpalgading20.FragmentOrdertoCart;
import com.example.pesanpalgading20.Getter.Makanan.MieAyam;
import com.example.pesanpalgading20.Getter.Promo.Promo;
import com.example.pesanpalgading20.HomeFragment;
import com.example.pesanpalgading20.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomePromoPilihan#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomePromoPilihan extends Fragment {
    TextView TxtvMakananHomePromo;
    ListView ListViewPromo;
    Toolbar toolbarPromo;
    LinearLayout ContainerContentPromo;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomePromoPilihan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home_promo_pilihan.
     */
    // TODO: Rename and change types and number of parameters
    public static HomePromoPilihan newInstance(String param1, String param2) {
        HomePromoPilihan fragment = new HomePromoPilihan();
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
        View viewroot = inflater.inflate(R.layout.fragment_home_promo_pilihan, container, false);
        TxtvMakananHomePromo = viewroot.findViewById(R.id.TxtvMakananHomePromo);
        ContainerContentPromo = viewroot.findViewById(R.id.ContainerContentPromo);

        final ArrayList<Promo> promo = new ArrayList<Promo>();
        promo.add (new Promo("[Promo 1] Mie Ayam Kuah + Es Teh", 12000 ,R.drawable.mieayam));
        promo.add (new Promo("[Promo 2] Bakso Kuah + Es Teh", 15000 ,R.drawable.mieayam));
        promo.add (new Promo("[Promo 3] Nasi Soto Ayam + Es Teh", 11000 ,R.drawable.mieayam));

        PromoAdapter promoAdapter = new PromoAdapter(getActivity(),promo);

        ListViewPromo = viewroot.findViewById(R.id.ListViewPromo);
        ListViewPromo.setAdapter(promoAdapter);

        toolbarPromo = viewroot.findViewById(R.id.ToolbarPromo);
        toolbarPromo.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarPromo.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentPromo.setVisibility(View.GONE);
                // Create new fragment and transaction
                Fragment HomeFragment = new HomeFragment();
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.ContainerPromo, HomeFragment);
                transaction.addToBackStack(null);
                // Commit the transaction
                transaction.commit();
            }
        });

        ListViewPromo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
                switch (position) {
                    case 0 :
                        ContainerContentPromo.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Promo PromoGetter1 = (Promo)ListViewPromo.getItemAtPosition(position);
                        //declare new code
                        String FoodCode1 = "PROMO1";
                        //get PromoName using getter
                        String FoodName1 = PromoGetter1.getmPromoName();
                        //get PromoPrice using getter
                        int FoodPrice1 = PromoGetter1.getmPromoHarga();
                        //set the PromoPrice to String to passed to intent
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
                        transaction1.replace(R.id.ContainerPromo, fragment1);
                        fragment1.setArguments(bundle1);
                        transaction1.addToBackStack(null);
                        // Commit the transaction
                        transaction1.commit();
                        break;
                    case 1:
                        ContainerContentPromo.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Promo PromoGetter2 = (Promo)ListViewPromo.getItemAtPosition(position);
                        //declare new code
                        String FoodCode2 = "PROMO2";
                        //get PromoName using getter
                        String FoodName2 = PromoGetter2.getmPromoName();
                        //get PromoPrice using getter
                        int FoodPrice2 = PromoGetter2.getmPromoHarga();
                        //set the PromoPrice to String to passed to intent
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
                        transaction2.replace(R.id.ContainerPromo, fragment2);
                        fragment2.setArguments(bundle2);
                        transaction2.addToBackStack(null);
                        // Commit the transaction
                        transaction2.commit();
                        break;
                    case 2:
                        ContainerContentPromo.setVisibility(View.GONE);
                        //set getter to be called based on position
                        Promo PromoGetter3 = (Promo)ListViewPromo.getItemAtPosition(position);
                        //declare new code
                        String FoodCode3 = "PROMO3";
                        //get PromoName using getter
                        String FoodName3 = PromoGetter3.getmPromoName();
                        //get PromoPrice using getter
                        int FoodPrice3 = PromoGetter3.getmPromoHarga();
                        //set the PromoPrice to String to passed to intent
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
                        transaction3.replace(R.id.ContainerPromo, fragment3);
                        fragment3.setArguments(bundle3);
                        transaction3.addToBackStack(null);
                        // Commit the transaction
                        transaction3.commit();
                        break;
                }
            }
        });








        return viewroot;
    }
}