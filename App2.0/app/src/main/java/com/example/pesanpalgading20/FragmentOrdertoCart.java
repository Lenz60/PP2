package com.example.pesanpalgading20;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentOrdertoCart#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentOrdertoCart extends Fragment {
    TextView TxtvOrdertoCartCode,TxtvOrdertoCartName,TxtvOrdertoCartPrice;
    Toolbar toolbarOrdertoCart;
    LinearLayout ContainerContentOrdertoCart;
    String inMieAyam;
    String inBakso;
    String inBaksoBakar;
    String inSoto;
    //Minuman
    String inEsOri;
    String inEsDurian;
    String inEsJus;
    //Jajanan
    String inJajanan;
    //
    String Code,Name,Price;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentOrdertoCart() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentOrdertoCart.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentOrdertoCart newInstance(String param1, String param2) {
        FragmentOrdertoCart fragment = new FragmentOrdertoCart();
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
        View viewRoot = inflater.inflate(R.layout.fragment_orderto_cart, container, false);

        TxtvOrdertoCartCode = viewRoot.findViewById(R.id.TxtvOrdertoCartCode);
        TxtvOrdertoCartName = viewRoot.findViewById(R.id.TxtvOrdertoCartName);
        TxtvOrdertoCartPrice = viewRoot.findViewById(R.id.TxtvOrdertoCartPrice);
        ContainerContentOrdertoCart = viewRoot.findViewById(R.id.ContainerContentOrdertoCart);

        Bundle bundle = this.getArguments();
        Code = bundle.getString("FoodCode");
        Name = bundle.getString("FoodName");
        Price = bundle.getString("FoodPrice");

        TxtvOrdertoCartCode.setText(Code);
        TxtvOrdertoCartName.setText(Name);
        TxtvOrdertoCartPrice.setText(Price);





        //Makanan
        inMieAyam = "MA.*";
        inBakso = "BK.*";
        inBaksoBakar = "BB.*";
        inSoto = "ST.*";

        //Minuman
        inEsOri = "EO.*";
        inEsDurian = "ED.*";
        inEsJus = "EJ.*";

        //Jajanan
        inJajanan = "JJ.*";



        toolbarOrdertoCart = viewRoot.findViewById(R.id.ToolbarOrdertoCart);
        toolbarOrdertoCart.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarOrdertoCart.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentOrdertoCart.setVisibility(View.GONE);
                CheckWhere();
            }
        });




        // Inflate the layout for this fragment
        return viewRoot;
    }

    //Check where user in
    public void CheckWhere(){
        if (Code.toUpperCase().matches((inMieAyam.toUpperCase()))){
            // Create new fragment and transaction
            Fragment FragmentMieAyam = new HomeMakananMieayamFragment();
            // consider using Java coding conventions (upper first char class names!!!)
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.ContainerOrdertoCart, FragmentMieAyam);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        }
        else if (Code.toUpperCase().matches(inBakso.toUpperCase())){
            // Create new fragment and transaction
            Fragment FragmentBakso = new HomeMakananBaksoFragment();
            // consider using Java coding conventions (upper first char class names!!!)
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.ContainerOrdertoCart, FragmentBakso);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        }
        else if (Code.toUpperCase().matches(inBaksoBakar.toUpperCase())){
            // Create new fragment and transaction
            Fragment FragmentBaksoBakar = new HomeMakananBaksoBakarFragment();
            // consider using Java coding conventions (upper first char class names!!!)
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.ContainerOrdertoCart, FragmentBaksoBakar);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        }
        else if(Code.toUpperCase().matches(inSoto.toUpperCase())){
            // Create new fragment and transaction
            Fragment FragmentSoto = new HomeMakananSotoFragment();
            // consider using Java coding conventions (upper first char class names!!!)
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.ContainerOrdertoCart, FragmentSoto);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        }
        else if (Code.toUpperCase().matches(inEsOri.toUpperCase())){
            // Create new fragment and transaction
            Fragment FragmentEsOri = new HomeMinumanEsOriFragment();
            // consider using Java coding conventions (upper first char class names!!!)
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.ContainerOrdertoCart, FragmentEsOri);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        }
        else if (Code.toUpperCase().matches(inEsDurian.toUpperCase())){
            // Create new fragment and transaction
            Fragment FragmentEsDurian = new HomeMinumanEsDurianFragment();
            // consider using Java coding conventions (upper first char class names!!!)
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.ContainerOrdertoCart, FragmentEsDurian);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        }
        else if (Code.toUpperCase().matches(inEsJus.toUpperCase())){
            // Create new fragment and transaction
            Fragment FragmentEsJus = new HomeMinumanEsJusFragment();
            // consider using Java coding conventions (upper first char class names!!!)
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.ContainerOrdertoCart, FragmentEsJus);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        }
        else if (Code.toUpperCase().matches(inJajanan.toUpperCase())){
            // Create new fragment and transaction
            Fragment FragmentJajanan = new HomeJajananFragment();
            // consider using Java coding conventions (upper first char class names!!!)
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack
            transaction.replace(R.id.ContainerOrdertoCart, FragmentJajanan);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();
        }
    }
}