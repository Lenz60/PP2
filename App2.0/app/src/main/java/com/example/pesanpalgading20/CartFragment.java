package com.example.pesanpalgading20;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CartFragment extends Fragment {

    //Position
    TextView TxtvCartTableNumber, TxtvCartTableCode;

    //Food
    TextView TxtvCart1FoodCount, TxtvCart1FoodName, TxtvCart1FoodPrice, TxtvCart1FoodType,
                TxtvCart2FoodCount, TxtvCart2FoodName, TxtvCart2FoodPrice, TxtvCart2FoodType;

    //Topping
    //Topping Name
    //Cart1
    TextView TxtvCart1Topping1,TxtvCart1Topping2,TxtvCart1Topping3,
            TxtvCart1Topping4,TxtvCart1Topping5,TxtvCart1Topping6,
            TxtvCart1Topping7,TxtvCart1Topping8,TxtvCart1Topping9,
            TxtvCart1Topping10;
    //Cart2
    TextView TxtvCart2Topping1,TxtvCart2Topping2,TxtvCart2Topping3,
            TxtvCart2Topping4,TxtvCart2Topping5,TxtvCart2Topping6,
            TxtvCart2Topping7,TxtvCart2Topping8,TxtvCart2Topping9,
            TxtvCart2Topping10;

    //Topping Price
    //Cart1
    TextView TxtvCart1ToppingPrice1,TxtvCart1ToppingPrice2,TxtvCart1ToppingPrice3,
            TxtvCart1ToppingPrice4,TxtvCart1ToppingPrice5,TxtvCart1ToppingPrice6,
            TxtvCart1ToppingPrice7,TxtvCart1ToppingPrice8,TxtvCart1ToppingPrice9,
            TxtvCart1ToppingPrice10;
    //Cart2
    TextView TxtvCart2ToppingPrice1,TxtvCart2ToppingPrice2,TxtvCart2ToppingPrice3,
            TxtvCart2ToppingPrice4,TxtvCart2ToppingPrice5,TxtvCart2ToppingPrice6,
            TxtvCart2ToppingPrice7,TxtvCart2ToppingPrice8,TxtvCart2ToppingPrice9,
            TxtvCart2ToppingPrice10;
    //TotalPrices
    TextView TxtvCart1TotalPrice,TxtvCart2TotalPrice;

    //Bundle
    String TableCode, TableNumber,
            FoodCode,FoodName, FoodPrice, FoodCount, FoodType, FoodTotalPrice,
            ToppingName1, ToppingName2, ToppingName3,
            ToppingName4, ToppingName5, ToppingName6,
            ToppingName7, ToppingName8, ToppingName9,
            ToppingName10,
            ToppingPrice1, ToppingPrice2, ToppingPrice3,
            ToppingPrice4, ToppingPrice5, ToppingPrice6,
            ToppingPrice7, ToppingPrice8, ToppingPrice9,
            ToppingPrice10,
            TotalPrice;
    //set
    String SetTableCode, SetTableNumber,
            SetFoodCode,SetFoodName, SetFoodPrice, SetFoodCount, SetFoodType, SetFoodTotalPrice,
            SetToppingName1, SetToppingName2, SetToppingName3,
            SetToppingName4, SetToppingName5, SetToppingName6,
            SetSetToppingName7, SetToppingName8, SetToppingName9,
            SetToppingName10,
            SetToppingPrice1, SetToppingPrice2, SetToppingPrice3,
            SetToppingPrice4, SetToppingPrice5, SetToppingPrice6,
            SetToppingPrice7, SetToppingPrice8, SetToppingPrice9,
            SetToppingPrice10,
            SetTotalPrice;
    //Layout
    LinearLayout LinearLayoutCartOrder1,LinearLayoutCartOrder2;

    Bundle bundle;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CartFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CartFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CartFragment newInstance(String param1, String param2) {
        CartFragment fragment = new CartFragment();
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
        // Inflate the layout for this fragment
        final View viewRoot =  inflater.inflate(R.layout.fragment_cart, container, false);
        //Position
        TxtvCartTableCode = viewRoot.findViewById(R.id.TxtvCartTableCode);
        TxtvCartTableNumber = viewRoot.findViewById(R.id.TxtvCartTableNumber);
        //Food Cart1
        TxtvCart1FoodCount = viewRoot.findViewById(R.id.TxtvCart1FoodQuantity);
        TxtvCart1FoodName = viewRoot.findViewById(R.id.TxtvCart1FoodName);
        TxtvCart1FoodPrice = viewRoot.findViewById(R.id.TxtvCart1FoodPrice);
        TxtvCart1FoodType =  viewRoot.findViewById(R.id.TxtvCart1FoodType);
        //Food Cart2
        TxtvCart2FoodCount = viewRoot.findViewById(R.id.TxtvCart2FoodQuantity);
        TxtvCart2FoodName = viewRoot.findViewById(R.id.TxtvCart2FoodName);
        TxtvCart2FoodPrice = viewRoot.findViewById(R.id.TxtvCart2FoodPrice);
        TxtvCart2FoodType =  viewRoot.findViewById(R.id.TxtvCart2FoodType);
        //Topping Cart1
        //Topping Name
        TxtvCart1Topping1 = viewRoot.findViewById(R.id.TxtvCart1Topping1);
        TxtvCart1Topping2 = viewRoot.findViewById(R.id.TxtvCart1Topping2);
        TxtvCart1Topping3 = viewRoot.findViewById(R.id.TxtvCart1Topping3);
        TxtvCart1Topping4 = viewRoot.findViewById(R.id.TxtvCart1Topping4);
        TxtvCart1Topping5 = viewRoot.findViewById(R.id.TxtvCart1Topping5);
        TxtvCart1Topping6 = viewRoot.findViewById(R.id.TxtvCart1Topping6);
        TxtvCart1Topping7 = viewRoot.findViewById(R.id.TxtvCart1Topping7);
        TxtvCart1Topping8 = viewRoot.findViewById(R.id.TxtvCart1Topping8);
        TxtvCart1Topping9 = viewRoot.findViewById(R.id.TxtvCart1Topping9);
        TxtvCart1Topping10 = viewRoot.findViewById(R.id.TxtvCart1Topping10);
        //Topping Price
        TxtvCart1ToppingPrice1 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice1);
        TxtvCart1ToppingPrice2 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice2);
        TxtvCart1ToppingPrice3 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice3);
        TxtvCart1ToppingPrice4 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice4);
        TxtvCart1ToppingPrice5 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice5);
        TxtvCart1ToppingPrice6 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice6);
        TxtvCart1ToppingPrice7 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice7);
        TxtvCart1ToppingPrice8 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice8);
        TxtvCart1ToppingPrice9 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice9);
        TxtvCart1ToppingPrice10 = viewRoot.findViewById(R.id.TxtvCart1ToppingPrice10);
        //Topping Cart2
        //Topping Name
        TxtvCart2Topping1 = viewRoot.findViewById(R.id.TxtvCart2Topping1);
        TxtvCart2Topping2 = viewRoot.findViewById(R.id.TxtvCart2Topping2);
        TxtvCart2Topping3 = viewRoot.findViewById(R.id.TxtvCart2Topping3);
        TxtvCart2Topping4 = viewRoot.findViewById(R.id.TxtvCart2Topping4);
        TxtvCart2Topping5 = viewRoot.findViewById(R.id.TxtvCart2Topping5);
        TxtvCart2Topping6 = viewRoot.findViewById(R.id.TxtvCart2Topping6);
        TxtvCart2Topping7 = viewRoot.findViewById(R.id.TxtvCart2Topping7);
        TxtvCart2Topping8 = viewRoot.findViewById(R.id.TxtvCart2Topping8);
        TxtvCart2Topping9 = viewRoot.findViewById(R.id.TxtvCart2Topping9);
        TxtvCart2Topping10 = viewRoot.findViewById(R.id.TxtvCart2Topping10);
        //Topping Price
        TxtvCart2ToppingPrice1 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice1);
        TxtvCart2ToppingPrice2 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice2);
        TxtvCart2ToppingPrice3 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice3);
        TxtvCart2ToppingPrice4 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice4);
        TxtvCart2ToppingPrice5 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice5);
        TxtvCart2ToppingPrice6 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice6);
        TxtvCart2ToppingPrice7 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice7);
        TxtvCart2ToppingPrice8 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice8);
        TxtvCart2ToppingPrice9 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice9);
        TxtvCart2ToppingPrice10 = viewRoot.findViewById(R.id.TxtvCart2ToppingPrice10);
        //Total Price
        TxtvCart1TotalPrice = viewRoot.findViewById(R.id.TxtvCart1TotalPrice);

        //Linear Layout
        LinearLayoutCartOrder1 = viewRoot.findViewById(R.id.LinearLayoutCartOrder1);
        LinearLayoutCartOrder2 = viewRoot.findViewById(R.id.LinearLayoutCartOrder2);

         bundle = this.getArguments();
        //Position
        TableCode = getActivity().getIntent().getExtras().getString("kodeMeja");
        TableNumber = getActivity().getIntent().getExtras().getString("noMejaFinal");



        TxtvCartTableCode.setText(TableCode);
        TxtvCartTableNumber.setText(TableNumber);


        CheckBundle();
        //FillNextCart();
        return viewRoot;
    }
    private void ClearBundle(){
        bundle.remove("CartFoodCode");
        bundle.remove("CartFoodName");
        bundle.remove("CartFoodCount");
        bundle.remove("CartFoodTotalPrice");
        bundle.remove("CartFoodType");
        bundle.remove("CartToppingName1");
        bundle.remove("CartToppingName2");
        bundle.remove("CartToppingName3");
        bundle.remove("CartToppingName4");
        bundle.remove("CartToppingName5");
        bundle.remove("CartToppingName6");
        bundle.remove("CartToppingName7");
        bundle.remove("CartToppingName8");
        bundle.remove("CartToppingName9");
        bundle.remove("CartToppingName10");
        bundle.remove("CartToppingPrice1");
        bundle.remove("CartToppingPrice2");
        bundle.remove("CartToppingPrice3");
        bundle.remove("CartToppingPrice4");
        bundle.remove("CartToppingPrice5");
        bundle.remove("CartToppingPrice6");
        bundle.remove("CartToppingPrice7");
        bundle.remove("CartToppingPrice8");
        bundle.remove("CartToppingPrice9");
        bundle.remove("CartToppingPrice10");

        bundle.remove("CartTotalPrice");
    }

    private void FillNextCart() {
        if (LinearLayoutCartOrder1 != null){
            ClearBundle();
            //Food
            FoodCode = bundle.getString("CartFoodCode");
            SetFoodCode = FoodCode;
            FoodName = bundle.getString("CartFoodName");
            FoodCount = bundle.getString("CartFoodCount");
            FoodTotalPrice = bundle.getString("CartFoodTotalPrice");
            FoodType = bundle.getString("CartFoodType");
            //Topping Name
            ToppingName1 = bundle.getString("CartToppingName1");
            ToppingName2 = bundle.getString("CartToppingName2");
            ToppingName3 = bundle.getString("CartToppingName3");
            ToppingName4 = bundle.getString("CartToppingName4");
            ToppingName5 = bundle.getString("CartToppingName5");
            ToppingName6 = bundle.getString("CartToppingName6");
            ToppingName7 = bundle.getString("CartToppingName7");
            ToppingName8 = bundle.getString("CartToppingName8");
            ToppingName9 = bundle.getString("CartToppingName9");
            ToppingName10 = bundle.getString("CartToppingName10");
            //Topping Price
            ToppingPrice1 = bundle.getString("CartToppingPrice1");
            ToppingPrice2 = bundle.getString("CartToppingPrice2");
            ToppingPrice3 = bundle.getString("CartToppingPrice3");
            ToppingPrice4 = bundle.getString("CartToppingPrice4");
            ToppingPrice5 = bundle.getString("CartToppingPrice5");
            ToppingPrice6 = bundle.getString("CartToppingPrice6");
            ToppingPrice7 = bundle.getString("CartToppingPrice7");
            ToppingPrice8 = bundle.getString("CartToppingPrice8");
            ToppingPrice9 = bundle.getString("CartToppingPrice9");
            ToppingPrice10 = bundle.getString("CartToppingPrice10");
            //Total Price
            TotalPrice = bundle.getString("CartTotalPrice");

            TxtvCart2FoodCount.setText(FoodCount);
            TxtvCart2FoodName.setText(FoodName);
            TxtvCart2FoodPrice.setText(FoodTotalPrice);
            TxtvCart2FoodType.setText(FoodType);

            TxtvCart2Topping1.setText(ToppingName1);
            TxtvCart2Topping2.setText(ToppingName2);
            TxtvCart2Topping3.setText(ToppingName3);
            TxtvCart2Topping4.setText(ToppingName4);
            TxtvCart2Topping5.setText(ToppingName5);
            TxtvCart2Topping6.setText(ToppingName6);
            TxtvCart2Topping7.setText(ToppingName7);
            TxtvCart2Topping8.setText(ToppingName8);
            TxtvCart2Topping9.setText(ToppingName9);
            TxtvCart2Topping10.setText(ToppingName10);

            TxtvCart2ToppingPrice1.setText(ToppingPrice1);
            TxtvCart2ToppingPrice2.setText(ToppingPrice2);
            TxtvCart2ToppingPrice3.setText(ToppingPrice3);
            TxtvCart2ToppingPrice4.setText(ToppingPrice4);
            TxtvCart2ToppingPrice5.setText(ToppingPrice5);
            TxtvCart2ToppingPrice6.setText(ToppingPrice6);
            TxtvCart2ToppingPrice7.setText(ToppingPrice7);
            TxtvCart2ToppingPrice8.setText(ToppingPrice8);
            TxtvCart2ToppingPrice9.setText(ToppingPrice9);
            TxtvCart2ToppingPrice10.setText(ToppingPrice10);

            TxtvCart2TotalPrice.setText(TotalPrice);
        }
        else {}
    }

    private void CheckBundle() {

        if (bundle != null){
            //Food
            FoodCode = bundle.getString("CartFoodCode");
            FoodName = bundle.getString("CartFoodName");
            FoodCount = bundle.getString("CartFoodCount");
            FoodTotalPrice = bundle.getString("CartFoodTotalPrice");
            FoodType = bundle.getString("CartFoodType");
            //Topping Name
            ToppingName1 = bundle.getString("CartToppingName1");
            ToppingName2 = bundle.getString("CartToppingName2");
            ToppingName3 = bundle.getString("CartToppingName3");
            ToppingName4 = bundle.getString("CartToppingName4");
            ToppingName5 = bundle.getString("CartToppingName5");
            ToppingName6 = bundle.getString("CartToppingName6");
            ToppingName7 = bundle.getString("CartToppingName7");
            ToppingName8 = bundle.getString("CartToppingName8");
            ToppingName9 = bundle.getString("CartToppingName9");
            ToppingName10 = bundle.getString("CartToppingName10");
            //Topping Price
            ToppingPrice1 = bundle.getString("CartToppingPrice1");
            ToppingPrice2 = bundle.getString("CartToppingPrice2");
            ToppingPrice3 = bundle.getString("CartToppingPrice3");
            ToppingPrice4 = bundle.getString("CartToppingPrice4");
            ToppingPrice5 = bundle.getString("CartToppingPrice5");
            ToppingPrice6 = bundle.getString("CartToppingPrice6");
            ToppingPrice7 = bundle.getString("CartToppingPrice7");
            ToppingPrice8 = bundle.getString("CartToppingPrice8");
            ToppingPrice9 = bundle.getString("CartToppingPrice9");
            ToppingPrice10 = bundle.getString("CartToppingPrice10");
            //Total Price
            TotalPrice = bundle.getString("CartTotalPrice");

            TxtvCart1FoodCount.setText(FoodCount);
            TxtvCart1FoodName.setText(FoodName);
            TxtvCart1FoodPrice.setText(FoodTotalPrice);
            TxtvCart1FoodType.setText(FoodType);

            TxtvCart1Topping1.setText(ToppingName1);
            TxtvCart1Topping2.setText(ToppingName2);
            TxtvCart1Topping3.setText(ToppingName3);
            TxtvCart1Topping4.setText(ToppingName4);
            TxtvCart1Topping5.setText(ToppingName5);
            TxtvCart1Topping6.setText(ToppingName6);
            TxtvCart1Topping7.setText(ToppingName7);
            TxtvCart1Topping8.setText(ToppingName8);
            TxtvCart1Topping9.setText(ToppingName9);
            TxtvCart1Topping10.setText(ToppingName10);

            TxtvCart1ToppingPrice1.setText(ToppingPrice1);
            TxtvCart1ToppingPrice2.setText(ToppingPrice2);
            TxtvCart1ToppingPrice3.setText(ToppingPrice3);
            TxtvCart1ToppingPrice4.setText(ToppingPrice4);
            TxtvCart1ToppingPrice5.setText(ToppingPrice5);
            TxtvCart1ToppingPrice6.setText(ToppingPrice6);
            TxtvCart1ToppingPrice7.setText(ToppingPrice7);
            TxtvCart1ToppingPrice8.setText(ToppingPrice8);
            TxtvCart1ToppingPrice9.setText(ToppingPrice9);
            TxtvCart1ToppingPrice10.setText(ToppingPrice10);

            TxtvCart1TotalPrice.setText(TotalPrice);
        }
        else {
            LinearLayoutCartOrder1.setVisibility(View.GONE);
            LinearLayoutCartOrder2.setVisibility(View.GONE);
        }

    }
}