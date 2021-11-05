package com.example.pesanpalgading20;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pesanpalgading20.Model.OrderSetterGetter.CartStatus;
import com.example.pesanpalgading20.Model.OrderSetterGetter.Order1;
import com.example.pesanpalgading20.Model.OrderSetterGetter.Order2;
import com.example.pesanpalgading20.Model.SharedPrefManager.SharedPrefmanager;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

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

    //Cart1 Status
    String Cart1Status, Cart2Status;
    //TotalPrices
    TextView TxtvCart1TotalPrice,TxtvCart2TotalPrice;

    //Bundle
    String TableCode, TableNumber,
            FoodCode,FoodName, FoodPrice, FoodCount, FoodType, FoodTotalPrice,
            FoodCodeC2,FoodNameC2, FoodPriceC2, FoodCountC2, FoodTypeC2, FoodTotalPriceC2,
            ToppingName1, ToppingName2, ToppingName3,
            ToppingName4, ToppingName5, ToppingName6,
            ToppingName7, ToppingName8, ToppingName9,
            ToppingName10,
            ToppingName1C2, ToppingName2C2, ToppingName3C2,
            ToppingName4C2, ToppingName5C2, ToppingName6C2,
            ToppingName7C2, ToppingName8C2, ToppingName9C2,
            ToppingName10C2,
            ToppingPrice1, ToppingPrice2, ToppingPrice3,
            ToppingPrice4, ToppingPrice5, ToppingPrice6,
            ToppingPrice7, ToppingPrice8, ToppingPrice9,
            ToppingPrice10,
            ToppingPrice1C2, ToppingPrice2C2, ToppingPrice3C2,
            ToppingPrice4C2, ToppingPrice5C2, ToppingPrice6C2,
            ToppingPrice7C2, ToppingPrice8C2, ToppingPrice9C2,
            ToppingPrice10C2,
            TotalPrice,
            TotalPriceC2;
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
    //SharedPref
    SharedPrefmanager sharedPrefmanager;

    //Button
    Button RefreshButton;

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

        //Refresh Button
        RefreshButton = viewRoot.findViewById(R.id.BtnCartRefresh);

        //default hide the cart
        LinearLayoutCartOrder1.setVisibility(VISIBLE);
        LinearLayoutCartOrder2.setVisibility(VISIBLE);

         bundle = this.getArguments();
        //Position
        TableCode = getActivity().getIntent().getExtras().getString("kodeMeja");
        TableNumber = getActivity().getIntent().getExtras().getString("noMejaFinal");



        TxtvCartTableCode.setText(TableCode);
        TxtvCartTableNumber.setText(TableNumber);

        CartStatus CheckCartStats = sharedPrefmanager.getInstance(getActivity()).GetCartStatus();
        Order2 order2 = sharedPrefmanager.getInstance(getActivity()).GetOrder2();
//        TxtvCart2FoodName.setText(CheckCartStats.getCart1Status().toString());
//        TxtvCart2FoodType.setText(CheckCartStats.getCart2Status().toString());


        RefreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        CheckChart();
        //FillNextCart();
        return viewRoot;
    }


    private void CheckChart() {
        Order1 order1 = sharedPrefmanager.getInstance(getActivity()).GetOrder1();
        Order2 order2 = sharedPrefmanager.getInstance(getActivity()).GetOrder2();
        CartStatus CheckCartStats = sharedPrefmanager.getInstance(getActivity()).GetCartStatus();
        if (order2.getC2FoodName() == "null"){
            LinearLayoutCartOrder1.setVisibility(VISIBLE);
        }
        else {
            if (LinearLayoutCartOrder1.getVisibility() == VISIBLE){
                LinearLayoutCartOrder1.setVisibility(View.VISIBLE);
                Cart1Status = "full";
                //Fill the cart 1
                 order1 = sharedPrefmanager.getInstance(getActivity()).GetOrder1();
                //Food
                FoodCode = order1.getFoodCode();
                FoodName = order1.getFoodName();
                FoodCount = order1.getFoodCount();
                FoodTotalPrice = order1.getFoodTotalPrice();
                FoodType = order1.getFoodType();
                //Topping Name
                ToppingName1 = order1.getToppingName1();
                ToppingName2 = order1.getToppingName2();
                ToppingName3 = order1.getToppingName3();
                ToppingName4 = order1.getToppingName4();
                ToppingName5 = order1.getToppingName5();
                ToppingName6 = order1.getToppingName6();
                ToppingName7 = order1.getToppingName7();
                ToppingName8 = order1.getToppingName8();
                ToppingName9 = order1.getToppingName9();
                ToppingName10 = order1.getToppingName10();
                //Topping Price
                ToppingPrice1 = order1.getToppingPrice1();
                ToppingPrice2 = order1.getToppingPrice2();
                ToppingPrice3 = order1.getToppingPrice3();
                ToppingPrice4 = order1.getToppingPrice4();
                ToppingPrice5 = order1.getToppingPrice5();
                ToppingPrice6 = order1.getToppingPrice6();
                ToppingPrice7 = order1.getToppingPrice7();
                ToppingPrice8 = order1.getToppingPrice8();
                ToppingPrice9 = order1.getToppingPrice9();
                ToppingPrice10 = order1.getToppingPrice10();
                //Total Price
                TotalPrice = order1.getTotalPrice();

                //If the food is without type then Visibility to food type is gone

                if (FoodType == "null"){
                    TxtvCart1FoodCount.setText(FoodCount);
                    TxtvCart1FoodName.setText(FoodName);
                    TxtvCart1FoodPrice.setText(FoodTotalPrice);

                    TxtvCart1FoodType.setText(FoodType);
                    TxtvCart1FoodType.setVisibility(GONE);

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
            }
            else if (CheckCartStats.getCart2Status() == "Available"){
                LinearLayoutCartOrder2.setVisibility(View.VISIBLE);
                order2 = sharedPrefmanager.getInstance(getActivity()).GetOrder2();
                //Fill the cart 2
                //Food
                FoodCodeC2 = order2.getC2FoodCode();
                FoodNameC2 = order2.getC2FoodName();
                FoodCountC2 = order2.getC2FoodCount();
                FoodTotalPriceC2 = order2.getC2FoodTotalPrice();
                FoodTypeC2 = order2.getC2FoodType();
                //Topping Name
                ToppingName1C2 = order2.getC2ToppingName1();
                ToppingName2C2 = order2.getC2ToppingName2();
                ToppingName3C2 = order2.getC2ToppingName3();
                ToppingName4C2 = order2.getC2ToppingName4();
                ToppingName5C2 = order2.getC2ToppingName5();
                ToppingName6C2 = order2.getC2ToppingName6();
                ToppingName7C2 = order2.getC2ToppingName7();
                ToppingName8C2 = order2.getC2ToppingName8();
                ToppingName9C2 = order2.getC2ToppingName9();
                ToppingName10C2 = order2.getC2ToppingName10();
                //Topping Price
                ToppingPrice1C2 = order2.getC2ToppingPrice1();
                ToppingPrice2C2 = order2.getC2ToppingPrice2();
                ToppingPrice3C2 = order2.getC2ToppingPrice3();
                ToppingPrice4C2 = order2.getC2ToppingPrice4();
                ToppingPrice5C2 = order2.getC2ToppingPrice5();
                ToppingPrice6C2 = order2.getC2ToppingPrice6();
                ToppingPrice7C2 = order2.getC2ToppingPrice7();
                ToppingPrice8C2 = order2.getC2ToppingPrice8();
                ToppingPrice9C2 = order2.getC2ToppingPrice9();
                ToppingPrice10C2 = order2.getC2ToppingPrice10();
                //Total Price
                TotalPriceC2 = order2.getC2TotalPrice();

                //If the food is without type then Visibility to food type is gone
                if (FoodType == "null"){
                    TxtvCart2FoodCount.setText(FoodCountC2);
                    TxtvCart2FoodName.setText(FoodNameC2);
                    TxtvCart2FoodPrice.setText(FoodTotalPriceC2);
                    TxtvCart2FoodType.setText(FoodTypeC2);
                    TxtvCart2FoodType.setVisibility(GONE);

                    TxtvCart2Topping1.setText(ToppingName1C2);
                    TxtvCart2Topping2.setText(ToppingName2C2);
                    TxtvCart2Topping3.setText(ToppingName3C2);
                    TxtvCart2Topping4.setText(ToppingName4C2);
                    TxtvCart2Topping5.setText(ToppingName5C2);
                    TxtvCart2Topping6.setText(ToppingName6C2);
                    TxtvCart2Topping7.setText(ToppingName7C2);
                    TxtvCart2Topping8.setText(ToppingName8C2);
                    TxtvCart2Topping9.setText(ToppingName9C2);
                    TxtvCart2Topping10.setText(ToppingName10C2);

                    TxtvCart2ToppingPrice1.setText(ToppingPrice1C2);
                    TxtvCart2ToppingPrice2.setText(ToppingPrice2C2);
                    TxtvCart2ToppingPrice3.setText(ToppingPrice3C2);
                    TxtvCart2ToppingPrice4.setText(ToppingPrice4C2);
                    TxtvCart2ToppingPrice5.setText(ToppingPrice5C2);
                    TxtvCart2ToppingPrice6.setText(ToppingPrice6C2);
                    TxtvCart2ToppingPrice7.setText(ToppingPrice7C2);
                    TxtvCart2ToppingPrice8.setText(ToppingPrice8C2);
                    TxtvCart2ToppingPrice9.setText(ToppingPrice9C2);
                    TxtvCart2ToppingPrice10.setText(ToppingPrice10C2);

                    TxtvCart2TotalPrice.setText(TotalPriceC2);
                }
                else {
                    TxtvCart2FoodCount.setText(FoodCountC2);
                    TxtvCart2FoodName.setText(FoodNameC2);
                    TxtvCart2FoodPrice.setText(FoodTotalPriceC2);
                    TxtvCart2FoodType.setText(FoodTypeC2);

                    TxtvCart2Topping1.setText(ToppingName1C2);
                    TxtvCart2Topping2.setText(ToppingName2C2);
                    TxtvCart2Topping3.setText(ToppingName3C2);
                    TxtvCart2Topping4.setText(ToppingName4C2);
                    TxtvCart2Topping5.setText(ToppingName5C2);
                    TxtvCart2Topping6.setText(ToppingName6C2);
                    TxtvCart2Topping7.setText(ToppingName7C2);
                    TxtvCart2Topping8.setText(ToppingName8C2);
                    TxtvCart2Topping9.setText(ToppingName9C2);
                    TxtvCart2Topping10.setText(ToppingName10C2);

                    TxtvCart2ToppingPrice1.setText(ToppingPrice1C2);
                    TxtvCart2ToppingPrice2.setText(ToppingPrice2C2);
                    TxtvCart2ToppingPrice3.setText(ToppingPrice3C2);
                    TxtvCart2ToppingPrice4.setText(ToppingPrice4C2);
                    TxtvCart2ToppingPrice5.setText(ToppingPrice5C2);
                    TxtvCart2ToppingPrice6.setText(ToppingPrice6C2);
                    TxtvCart2ToppingPrice7.setText(ToppingPrice7C2);
                    TxtvCart2ToppingPrice8.setText(ToppingPrice8C2);
                    TxtvCart2ToppingPrice9.setText(ToppingPrice9C2);
                    TxtvCart2ToppingPrice10.setText(ToppingPrice10C2);

                    TxtvCart2TotalPrice.setText(TotalPriceC2);
                }

            }
        }
    }
}