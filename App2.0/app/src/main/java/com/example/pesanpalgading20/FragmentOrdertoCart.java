package com.example.pesanpalgading20;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.pesanpalgading20.Model.Menu.Jajanan.HomeJajananFragment;
import com.example.pesanpalgading20.Model.Menu.Makanan.HomeMakananBaksoBakarFragment;
import com.example.pesanpalgading20.Model.Menu.Makanan.HomeMakananBaksoFragment;
import com.example.pesanpalgading20.Model.Menu.Makanan.HomeMakananMieayamFragment;
import com.example.pesanpalgading20.Model.Menu.Makanan.HomeMakananSotoFragment;
import com.example.pesanpalgading20.Model.Menu.Minuman.HomeMinumanEsDurianFragment;
import com.example.pesanpalgading20.Model.Menu.Minuman.HomeMinumanEsJusFragment;
import com.example.pesanpalgading20.Model.Menu.Minuman.HomeMinumanEsOriFragment;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

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
    //Topping
    CheckBox CBTopping1,CBTopping2,CBTopping3,
            CBTopping4,CBTopping5,CBTopping6,
            CBTopping7,CBTopping8,CBTopping9,
            CBTopping10;
    TextView TxtvToppingPrice1,TxtvToppingPrice2,TxtvToppingPrice3,
            TxtvToppingPrice4,TxtvToppingPrice5,TxtvToppingPrice6,
            TxtvToppingPrice7,TxtvToppingPrice8,TxtvToppingPrice9,
            TxtvToppingPrice10;
    Integer Price1,Price2,Price3,
            Price4,Price5,Price6,
            Price7,Price8,Price9,
            Price10;
    Integer FinalPrice1,FinalPrice2,FinalPrice3,
            FinalPrice4,FinalPrice5,FinalPrice6,
            FinalPrice7,FinalPrice8,FinalPrice9,
            FinalPrice10;

    Integer SelectedPrice1,SelectedPrice2,SelectedPrice3,
            SelectedPrice4,SelectedPrice5,SelectedPrice6,
            SelectedPrice7,SelectedPrice8,SelectedPrice9,
            SelectedPrice10;

    String StringSelectedPrice1,StringSelectedPrice2,StringSelectedPrice3,
            StringSelectedPrice4,StringSelectedPrice5,StringSelectedPrice6,
            StringSelectedPrice7,StringSelectedPrice8,StringSelectedPrice9,
            StringSelectedPrice10;
    Integer TotalFinalPrice;


    String Check1,Check2,Check3,
            Check4,Check5,Check6,
            Check7,Check8,Check9,
            Check10;

    Button BtnAddtoCart,BtnConfirmationPayment, BtnAddItem, BtnReduceItem;

    EditText EdFoodCount;

    String GetTotalHarga, GetCurrentToppingPrice;

    TextView TxtvSelectedToppName1, TxtvSelectedToppName2, TxtvSelectedToppName3,
            TxtvSelectedToppName4, TxtvSelectedToppName5, TxtvSelectedToppName6,
            TxtvSelectedToppName7, TxtvSelectedToppName8, TxtvSelectedToppName9,
            TxtvSelectedToppName10;

    TextView TxtvSelectedToppPrice1,TxtvSelectedToppPrice2,TxtvSelectedToppPrice3,
            TxtvSelectedToppPrice4,TxtvSelectedToppPrice5,TxtvSelectedToppPrice6,
            TxtvSelectedToppPrice7,TxtvSelectedToppPrice8,TxtvSelectedToppPrice9,
            TxtvSelectedToppPrice10;

    TextView TxtvRp1,TxtvRp2,TxtvRp3,
            TxtvRp4,TxtvRp5,TxtvRp6,
            TxtvRp7,TxtvRp8,TxtvRp9,
            TxtvRp10;

    //Radio Button
    RadioGroup RgTipeFood;
    RadioButton RbChoice1, RbChoice2, RbChoice3;
    RadioButton RbSelectedChoice;

    TextView TxtvSelectedFoodCount, TxtvSelectedFoodName, TxtvSelectedFoodPrice;

    String ValueTotalSelectedFoodPrice;

    //Count Total FoodCount
    Integer TotalFoodCount;
    Integer IntegerSelectedFoodPrice;

    Integer FoodPrice1;
    //Total
    TextView TxtvTotalHarga;

    //Tipe Food
    TextView TxtvSelectedFoodType;

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
        final View viewRoot = inflater.inflate(R.layout.fragment_orderto_cart, container, false);

        TxtvOrdertoCartCode = viewRoot.findViewById(R.id.TxtvOrdertoCartCode);
        TxtvOrdertoCartName = viewRoot.findViewById(R.id.TxtvOrdertoCartName);
        TxtvOrdertoCartPrice = viewRoot.findViewById(R.id.TxtvOrdertoCartPrice);
        ContainerContentOrdertoCart = viewRoot.findViewById(R.id.ContainerContentOrdertoCart);

        //Topping
        CBTopping1 = viewRoot.findViewById(R.id.CheckboxTopping1);
        CBTopping2 = viewRoot.findViewById(R.id.CheckboxTopping2);
        CBTopping3 = viewRoot.findViewById(R.id.CheckboxTopping3);
        CBTopping4 = viewRoot.findViewById(R.id.CheckboxTopping4);
        CBTopping5 = viewRoot.findViewById(R.id.CheckboxTopping5);
        CBTopping6 = viewRoot.findViewById(R.id.CheckboxTopping6);
        CBTopping7 = viewRoot.findViewById(R.id.CheckboxTopping7);
        CBTopping8 = viewRoot.findViewById(R.id.CheckboxTopping8);
        CBTopping9 = viewRoot.findViewById(R.id.CheckboxTopping9);
        CBTopping10 = viewRoot.findViewById(R.id.CheckboxTopping10);

        //Topping Price
        TxtvToppingPrice1 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice1);
        TxtvToppingPrice2 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice2);
        TxtvToppingPrice3 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice3);
        TxtvToppingPrice4 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice4);
        TxtvToppingPrice5 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice5);
        TxtvToppingPrice6 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice6);
        TxtvToppingPrice7 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice7);
        TxtvToppingPrice8 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice8);
        TxtvToppingPrice9 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice9);
        TxtvToppingPrice10 = viewRoot.findViewById(R.id.TxtvOrdertoCartToppingPrice10);

        TxtvTotalHarga = viewRoot.findViewById(R.id.TxtvOrdertoCartTotalPrice);

        //Selected Topping Name
        TxtvSelectedToppName1 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName1);
        TxtvSelectedToppName2 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName2);
        TxtvSelectedToppName3 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName3);
        TxtvSelectedToppName4 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName4);
        TxtvSelectedToppName5 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName5);
        TxtvSelectedToppName6 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName6);
        TxtvSelectedToppName7 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName7);
        TxtvSelectedToppName8 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName8);
        TxtvSelectedToppName9 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName9);
        TxtvSelectedToppName10 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppName10);

        //Selected Topping Price
        TxtvSelectedToppPrice1 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice1);
        TxtvSelectedToppPrice2 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice2);
        TxtvSelectedToppPrice3 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice3);
        TxtvSelectedToppPrice4 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice4);
        TxtvSelectedToppPrice5 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice5);
        TxtvSelectedToppPrice6 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice6);
        TxtvSelectedToppPrice7 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice7);
        TxtvSelectedToppPrice8 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice8);
        TxtvSelectedToppPrice9 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice9);
        TxtvSelectedToppPrice10 = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedToppPrice10);

        //Rp Selected Topping
        TxtvRp1 = viewRoot.findViewById(R.id.OrdertoCartRp1);
        TxtvRp2 = viewRoot.findViewById(R.id.OrdertoCartRp2);
        TxtvRp3 = viewRoot.findViewById(R.id.OrdertoCartRp3);
        TxtvRp4 = viewRoot.findViewById(R.id.OrdertoCartRp4);
        TxtvRp5 = viewRoot.findViewById(R.id.OrdertoCartRp5);
        TxtvRp6 = viewRoot.findViewById(R.id.OrdertoCartRp6);
        TxtvRp7 = viewRoot.findViewById(R.id.OrdertoCartRp7);
        TxtvRp8 = viewRoot.findViewById(R.id.OrdertoCartRp8);
        TxtvRp9 = viewRoot.findViewById(R.id.OrdertoCartRp9);
        TxtvRp10 = viewRoot.findViewById(R.id.OrdertoCartRp10);

        //Button AddtoCart
        BtnAddtoCart = viewRoot.findViewById(R.id.BtnOrdertoCartAddtoCart);

        //Button Confirmation
        BtnConfirmationPayment = viewRoot.findViewById(R.id.BtnOrdertoCartConfirm);

        //Selected Food Name, Count & Price
        TxtvSelectedFoodCount = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedFoodCount);
        TxtvSelectedFoodName = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedFoodName);
        TxtvSelectedFoodPrice = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedFoodPrice);
        TxtvSelectedFoodType = viewRoot.findViewById(R.id.TxtvOrdertoCartSelectedFoodTipe);

        //Add And Reduce Food Item
        BtnAddItem = viewRoot.findViewById(R.id.BtnOrdertoCartAddItem);
        BtnReduceItem = viewRoot.findViewById(R.id.BtnOrdertoCartReduceItem);
        EdFoodCount = viewRoot.findViewById(R.id.EdOrdertoCartFoodCount);

        //Radio Group & Radio Button Tipe Makanan
        RgTipeFood = viewRoot.findViewById(R.id.RadioChoiceFood);
        RbChoice1 = viewRoot.findViewById(R.id.RbChoice1);
        RbChoice2 = viewRoot.findViewById(R.id.RbChoice2);
        RbChoice3 = viewRoot.findViewById(R.id.RbChoice3);


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


        //Back based where the position is
        toolbarOrdertoCart = viewRoot.findViewById(R.id.ToolbarOrdertoCart);
        toolbarOrdertoCart.setNavigationIcon(R.drawable.arrowbackicon);
        toolbarOrdertoCart.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContainerContentOrdertoCart.setVisibility(GONE);
                FragmentOrdertoCart fragmentOrdertoCart = new FragmentOrdertoCart();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                manager.getBackStackEntryCount();
                transaction.remove(fragmentOrdertoCart);
                transaction.commit();
                CheckWhere();

            }
        });

        FinalPrice1 = 0;
        FinalPrice2 = 0;
        FinalPrice3 = 0;
        FinalPrice4 = 0;
        FinalPrice5 = 0;
        FinalPrice6 = 0;
        FinalPrice7 = 0;
        FinalPrice8 = 0;
        FinalPrice9 = 0;
        FinalPrice10 = 0;

        RgTipeFood.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int selectedIdRg = RgTipeFood.getCheckedRadioButtonId();
                RbSelectedChoice = (RadioButton) viewRoot.findViewById(selectedIdRg);
                TxtvSelectedFoodType.setText(RbSelectedChoice.getText().toString());
            }
        });

        //Set Value of Selected Food
        TxtvSelectedFoodName.setText(Name);
        TxtvSelectedFoodPrice.setText(Price);
        TxtvSelectedFoodType.setText(" ");


        ChangeValueTopping();
        ConfirmationPayment();
        BtnAddtoCart.setVisibility(GONE);
        //set Foodcount
        EdFoodCount.setEnabled(false);
        EdFoodCount.setText("1");
        TxtvSelectedFoodCount.setText("1");
        CalculateFoodCount();
        AddtoCart();
        // Inflate the layout for this fragment
        return viewRoot;
    }

    private void AddtoCart() {
        BtnAddtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(RgTipeFood.getVisibility() == VISIBLE) {
                    if (RgTipeFood.getCheckedRadioButtonId() == -1) {
                        Toast errorTipeFood = Toast.makeText(getActivity(), "Silahkan Pilih Tipe Makanan Terlebih Dahulu", Toast.LENGTH_SHORT);
                        errorTipeFood.show();
                    }
                    else {
                        //Pass to cart function here 
                    }
                }
                else {
                    //Pass to Cart function here
                }
            }
        });
    }

    private void CalculateFoodCount() {
        BtnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnAddtoCart.setVisibility(GONE);
                int a = Integer.parseInt(EdFoodCount.getText().toString());
                int b = a+1;

                //set default count to 1
                if (b <= 0){
                    b = 1;
                }

                EdFoodCount.setText(new Integer(b).toString());
                String ValueEdFoodCount = EdFoodCount.getText().toString();
                TotalFoodCount = Integer.valueOf(Integer.valueOf(ValueEdFoodCount) * Integer.valueOf(Price));
                TxtvOrdertoCartPrice.setText(String.valueOf(TotalFoodCount));
                TxtvSelectedFoodCount.setText(ValueEdFoodCount);
                TxtvSelectedFoodPrice.setText(String.valueOf(TotalFoodCount));
            }
        });
        BtnReduceItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtnAddtoCart.setVisibility(GONE);
                int a = Integer.parseInt(EdFoodCount.getText().toString());
                int b = a-1;

                //set default count to 1
                if (b <= 0){
                    b = 1;
                }

                EdFoodCount.setText(new Integer(b).toString());
                String ValueEdFoodCount = EdFoodCount.getText().toString();
                TotalFoodCount = Integer.valueOf(Integer.valueOf(ValueEdFoodCount) * Integer.valueOf(Price));
                TxtvOrdertoCartPrice.setText(String.valueOf(TotalFoodCount));
                TxtvSelectedFoodCount.setText(ValueEdFoodCount);
                TxtvSelectedFoodPrice.setText(String.valueOf(TotalFoodCount));
            }
        });
    }

    public void ConfirmationPayment() {
        final String codefood = Code;
        BtnConfirmationPayment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(RgTipeFood.getVisibility() == VISIBLE){
                    if (RgTipeFood.getCheckedRadioButtonId() == -1 ){
                        Toast errorTipeFood = Toast.makeText(getActivity(), "Silahkan Pilih Tipe Makanan Terlebih Dahulu", Toast.LENGTH_SHORT);
                        errorTipeFood.show();
                    }
                    else {
                        StringSelectedPrice1 = TxtvSelectedToppPrice1.getText().toString();
                        SelectedPrice1 = Integer.parseInt(StringSelectedPrice1);

                        StringSelectedPrice2 = TxtvSelectedToppPrice2.getText().toString();
                        SelectedPrice2 = Integer.parseInt(StringSelectedPrice2);

                        StringSelectedPrice3 = TxtvSelectedToppPrice3.getText().toString();
                        SelectedPrice3 = Integer.parseInt(StringSelectedPrice3);

                        StringSelectedPrice4 = TxtvSelectedToppPrice4.getText().toString();
                        SelectedPrice4 = Integer.parseInt(StringSelectedPrice4);

                        StringSelectedPrice5 = TxtvSelectedToppPrice5.getText().toString();
                        SelectedPrice5 = Integer.parseInt(StringSelectedPrice5);

                        StringSelectedPrice6 = TxtvSelectedToppPrice6.getText().toString();
                        SelectedPrice6 = Integer.parseInt(StringSelectedPrice6);

                        StringSelectedPrice7 = TxtvSelectedToppPrice7.getText().toString();
                        SelectedPrice7 = Integer.parseInt(StringSelectedPrice7);

                        StringSelectedPrice8 = TxtvSelectedToppPrice8.getText().toString();
                        SelectedPrice8 = Integer.parseInt(StringSelectedPrice8);

                        StringSelectedPrice9 = TxtvSelectedToppPrice9.getText().toString();
                        SelectedPrice9 = Integer.parseInt(StringSelectedPrice9);

                        StringSelectedPrice10 = TxtvSelectedToppPrice10.getText().toString();
                        SelectedPrice10 = Integer.parseInt(StringSelectedPrice10);

                        ValueTotalSelectedFoodPrice = TxtvSelectedFoodPrice.getText().toString();
                        IntegerSelectedFoodPrice = Integer.valueOf(ValueTotalSelectedFoodPrice);

                        TotalFinalPrice = IntegerSelectedFoodPrice + SelectedPrice1 + SelectedPrice2 +
                                SelectedPrice3 + SelectedPrice4 + SelectedPrice5 +
                                SelectedPrice6 + SelectedPrice7 + SelectedPrice8 +
                                SelectedPrice9 + SelectedPrice10;
                        TxtvTotalHarga.setText(String.valueOf(TotalFinalPrice));
                        BtnAddtoCart.setVisibility(View.VISIBLE);
                    }
                }
                else {
                    StringSelectedPrice1 = TxtvSelectedToppPrice1.getText().toString();
                    SelectedPrice1 = Integer.parseInt(StringSelectedPrice1);

                    StringSelectedPrice2 = TxtvSelectedToppPrice2.getText().toString();
                    SelectedPrice2 = Integer.parseInt(StringSelectedPrice2);

                    StringSelectedPrice3 = TxtvSelectedToppPrice3.getText().toString();
                    SelectedPrice3 = Integer.parseInt(StringSelectedPrice3);

                    StringSelectedPrice4 = TxtvSelectedToppPrice4.getText().toString();
                    SelectedPrice4 = Integer.parseInt(StringSelectedPrice4);

                    StringSelectedPrice5 = TxtvSelectedToppPrice5.getText().toString();
                    SelectedPrice5 = Integer.parseInt(StringSelectedPrice5);

                    StringSelectedPrice6 = TxtvSelectedToppPrice6.getText().toString();
                    SelectedPrice6 = Integer.parseInt(StringSelectedPrice6);

                    StringSelectedPrice7 = TxtvSelectedToppPrice7.getText().toString();
                    SelectedPrice7 = Integer.parseInt(StringSelectedPrice7);

                    StringSelectedPrice8 = TxtvSelectedToppPrice8.getText().toString();
                    SelectedPrice8 = Integer.parseInt(StringSelectedPrice8);

                    StringSelectedPrice9 = TxtvSelectedToppPrice9.getText().toString();
                    SelectedPrice9 = Integer.parseInt(StringSelectedPrice9);

                    StringSelectedPrice10 = TxtvSelectedToppPrice10.getText().toString();
                    SelectedPrice10 = Integer.parseInt(StringSelectedPrice10);

                    ValueTotalSelectedFoodPrice = TxtvSelectedFoodPrice.getText().toString();
                    IntegerSelectedFoodPrice = Integer.valueOf(ValueTotalSelectedFoodPrice);

                    TotalFinalPrice = IntegerSelectedFoodPrice + SelectedPrice1 + SelectedPrice2 +
                            SelectedPrice3 + SelectedPrice4 + SelectedPrice5 +
                            SelectedPrice6 + SelectedPrice7 + SelectedPrice8 +
                            SelectedPrice9 + SelectedPrice10;
                    TxtvTotalHarga.setText(String.valueOf(TotalFinalPrice));
                    BtnAddtoCart.setVisibility(View.VISIBLE);
                }
            }
        });
    }


    public void ChangeValueTopping(){
        if (Code.toUpperCase().matches((inMieAyam.toUpperCase()))){

            //set text topping
            CBTopping1.setText("Extra Ayam");
            CBTopping2.setText("Extra Tetelan Sapi");
            CBTopping3.setText("Cakar (2 pcs)");
            CBTopping4.setText("Kepala");
            CBTopping5.setText("Bakso Sapi");
            CBTopping6.setText("Telur Mata Sapi");
            CBTopping7.setText("Balungan Rica Ayam");
            CBTopping8.setText("Extra Sawi");
            CBTopping9.setText("Extra Acar");

            //set text tipe
            RbChoice1.setText("Kuah");
            RbChoice2.setText("Goreng");

            //hide remaining tipe
            RbChoice3.setVisibility(GONE);

            //hide remaining topping CB
            CBTopping10.setVisibility(GONE);

            //set price to variable
            Price1 = 3000;
            Price2 = 7000;
            Price3 = 4000;
            Price4 = 4000;
            Price5 = 3000;
            Price6 = 4000;
            Price7 = 4000;
            Price8 = 1000;
            Price9 = 1000;
            Price10 = 0;

            //set price topping
            TxtvToppingPrice1.setText("Rp."+Price1);
            TxtvToppingPrice2.setText("Rp."+Price2);
            TxtvToppingPrice3.setText("Rp."+Price3);
            TxtvToppingPrice4.setText("Rp."+Price4);
            TxtvToppingPrice5.setText("Rp."+Price5);
            TxtvToppingPrice6.setText("Rp."+Price6);
            TxtvToppingPrice7.setText("Rp."+Price7);
            TxtvToppingPrice8.setText("Rp."+Price8);
            TxtvToppingPrice9.setText("Rp."+Price9);


            //hide remaining topping price Txtv
            TxtvToppingPrice10.setVisibility(GONE);

            //hide all selected topping
            TxtvSelectedToppName1.setVisibility(GONE);
            TxtvRp1.setVisibility(GONE);
            TxtvSelectedToppPrice1.setVisibility(GONE);

            TxtvSelectedToppName2.setVisibility(GONE);
            TxtvRp2.setVisibility(GONE);
            TxtvSelectedToppPrice2.setVisibility(GONE);

            TxtvSelectedToppName3.setVisibility(GONE);
            TxtvRp3.setVisibility(GONE);
            TxtvSelectedToppPrice3.setVisibility(GONE);

            TxtvSelectedToppName4.setVisibility(GONE);
            TxtvRp4.setVisibility(GONE);
            TxtvSelectedToppPrice4.setVisibility(GONE);

            TxtvSelectedToppName5.setVisibility(GONE);
            TxtvRp5.setVisibility(GONE);
            TxtvSelectedToppPrice5.setVisibility(GONE);

            TxtvSelectedToppName6.setVisibility(GONE);
            TxtvRp6.setVisibility(GONE);
            TxtvSelectedToppPrice6.setVisibility(GONE);

            TxtvSelectedToppName7.setVisibility(GONE);
            TxtvRp7.setVisibility(GONE);
            TxtvSelectedToppPrice7.setVisibility(GONE);

            TxtvSelectedToppName8.setVisibility(GONE);
            TxtvRp8.setVisibility(GONE);
            TxtvSelectedToppPrice8.setVisibility(GONE);

            TxtvSelectedToppName9.setVisibility(GONE);
            TxtvRp9.setVisibility(GONE);
            TxtvSelectedToppPrice9.setVisibility(GONE);

            TxtvSelectedToppName10.setVisibility(GONE);
            TxtvRp10.setVisibility(GONE);
            TxtvSelectedToppPrice10.setVisibility(GONE);


            CBTopping1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice1 = Price1;
                        TxtvSelectedToppName1.setVisibility(View.VISIBLE);
                        TxtvRp1.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice1.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName1.setText(CBTopping1.getText().toString());
                        TxtvSelectedToppPrice1.setText(String.valueOf(FinalPrice1));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice1 = 0;
                        TxtvSelectedToppName1.setVisibility(GONE);
                        TxtvRp1.setVisibility(GONE);
                        TxtvSelectedToppPrice1.setVisibility(GONE);
                        TxtvSelectedToppName1.setText("null");
                        TxtvSelectedToppPrice1.setText("0");
                    }
                }
            });

            CBTopping2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice2 = Price2;
                        TxtvSelectedToppName2.setVisibility(View.VISIBLE);
                        TxtvRp2.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice2.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName2.setText(CBTopping2.getText());
                        TxtvSelectedToppPrice2.setText(String.valueOf(FinalPrice2));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice2 = 0;
                        TxtvSelectedToppName2.setVisibility(GONE);
                        TxtvRp2.setVisibility(GONE);
                        TxtvSelectedToppPrice2.setVisibility(GONE);
                        TxtvSelectedToppName2.setText("null");
                        TxtvSelectedToppPrice2.setText("0");
                    }
                }
            });

            CBTopping3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice3 = Price3;
                        TxtvSelectedToppName3.setVisibility(View.VISIBLE);
                        TxtvRp3.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice3.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName3.setText(CBTopping3.getText());
                        TxtvSelectedToppPrice3.setText(String.valueOf(FinalPrice3));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice3 = 0;
                        TxtvSelectedToppName3.setVisibility(GONE);
                        TxtvRp3.setVisibility(GONE);
                        TxtvSelectedToppPrice3.setVisibility(GONE);
                        TxtvSelectedToppName3.setText("null");
                        TxtvSelectedToppPrice3.setText("0");
                    }
                }
            });

            CBTopping4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice4 = Price4;
                        TxtvSelectedToppName4.setVisibility(View.VISIBLE);
                        TxtvRp4.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice4.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName4.setText(CBTopping2.getText());
                        TxtvSelectedToppPrice4.setText(String.valueOf(FinalPrice4));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice4 = 0;
                        TxtvSelectedToppName4.setVisibility(GONE);
                        TxtvRp4.setVisibility(GONE);
                        TxtvSelectedToppPrice4.setVisibility(GONE);
                        TxtvSelectedToppName4.setText("null");
                        TxtvSelectedToppPrice4.setText("0");
                    }
                }
            });

            CBTopping5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice5 = Price5;
                        TxtvSelectedToppName5.setVisibility(View.VISIBLE);
                        TxtvRp5.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice5.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName5.setText(CBTopping5.getText());
                        TxtvSelectedToppPrice5.setText(String.valueOf(FinalPrice5));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice5 = 0;
                        TxtvSelectedToppName5.setVisibility(GONE);
                        TxtvRp5.setVisibility(GONE);
                        TxtvSelectedToppPrice5.setVisibility(GONE);
                        TxtvSelectedToppName5.setText("null");
                        TxtvSelectedToppPrice5.setText("0");
                    }
                }
            });

            CBTopping6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice6 = Price6;
                        TxtvSelectedToppName6.setVisibility(View.VISIBLE);
                        TxtvRp6.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice6.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName6.setText(CBTopping6.getText());
                        TxtvSelectedToppPrice6.setText(String.valueOf(FinalPrice6));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice6 = 0;
                        TxtvSelectedToppName6.setVisibility(GONE);
                        TxtvRp6.setVisibility(GONE);
                        TxtvSelectedToppPrice6.setVisibility(GONE);
                        TxtvSelectedToppName6.setText("null");
                        TxtvSelectedToppPrice6.setText("0");
                    }
                }
            });

            CBTopping7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice7 = Price7;
                        TxtvSelectedToppName7.setVisibility(View.VISIBLE);
                        TxtvRp7.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice7.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName7.setText(CBTopping7.getText());
                        TxtvSelectedToppPrice7.setText(String.valueOf(FinalPrice7));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice7 = 0;
                        TxtvSelectedToppName7.setVisibility(GONE);
                        TxtvRp7.setVisibility(GONE);
                        TxtvSelectedToppPrice7.setVisibility(GONE);
                        TxtvSelectedToppName7.setText("null");
                        TxtvSelectedToppPrice7.setText("0");
                    }
                }
            });

            CBTopping8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice8 = Price8;
                        TxtvSelectedToppName8.setVisibility(View.VISIBLE);
                        TxtvRp8.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice8.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName8.setText(CBTopping8.getText());
                        TxtvSelectedToppPrice8.setText(String.valueOf(FinalPrice8));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice8 = 0;
                        TxtvSelectedToppName8.setVisibility(GONE);
                        TxtvRp8.setVisibility(GONE);
                        TxtvSelectedToppPrice8.setVisibility(GONE);
                        TxtvSelectedToppName8.setText("null");
                        TxtvSelectedToppPrice8.setText("0");
                    }
                }
            });

            CBTopping9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice9 = Price9;
                        TxtvSelectedToppName9.setVisibility(View.VISIBLE);
                        TxtvRp9.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice9.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName9.setText(CBTopping2.getText());
                        TxtvSelectedToppPrice9.setText(String.valueOf(FinalPrice9));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice9 = 0;
                        TxtvSelectedToppName9.setVisibility(GONE);
                        TxtvRp9.setVisibility(GONE);
                        TxtvSelectedToppPrice9.setVisibility(GONE);
                        TxtvSelectedToppName9.setText("null");
                        TxtvSelectedToppPrice9.setText("0");
                    }
                }
            });





//            TxtvTotalHarga.setText(Integer.toString(TotalFinalPrice));
            TxtvTotalHarga.invalidate();

        }
        else if (Code.toUpperCase().matches((inBakso.toUpperCase()))){
            //set text topping
            CBTopping1.setText("1 Pentol Bakso Urat/Halus");
            CBTopping2.setText("1 Pangist Goreng/Kukus (/pcs)");
            CBTopping3.setText("1 Tahu Bakso (/pcs)");
            CBTopping4.setText("Tetelan Sapi");
            CBTopping5.setText("Kuah Bakso, Mie Kuning & Mie Soon");

            if (Code == "BK5"){
                //set text tipe
                RbChoice1.setText("Urat");
                RbChoice2.setText("Halus");
                //hide remaining tipe
                RbChoice3.setVisibility(GONE);
            }
            else if (Code == "BK4"&&Code == "BK6"&&Code == "BK7"){
                //hide remaining tipe
                RbChoice1.setVisibility(GONE);
                RbChoice2.setVisibility(GONE);
                RbChoice3.setVisibility(GONE);
            }
            else {
                //set text tipe
                RbChoice1.setText("Urat");
                RbChoice2.setText("Halus");
                RbChoice3.setText("Campur");
            }

            //hide remaining topping CB
            CBTopping6.setVisibility(GONE);
            CBTopping7.setVisibility(GONE);
            CBTopping8.setVisibility(GONE);
            CBTopping9.setVisibility(GONE);
            CBTopping10.setVisibility(GONE);

            //set price to variable
            Price1 = 3000;
            Price2 = 1500;
            Price3 = 1500;
            Price4 = 7000;
            Price5 = 2000;
            Price6 = 0;
            Price7 = 0;
            Price8 = 0;
            Price9 = 0;
            Price10 = 0;

            //set price topping
            TxtvToppingPrice1.setText("Rp."+Price1);
            TxtvToppingPrice2.setText("Rp."+Price2);
            TxtvToppingPrice3.setText("Rp."+Price3);
            TxtvToppingPrice4.setText("Rp."+Price4);
            TxtvToppingPrice5.setText("Rp."+Price5);

            //hide remaining topping price Txtv
            TxtvToppingPrice6.setVisibility(GONE);
            TxtvToppingPrice7.setVisibility(GONE);
            TxtvToppingPrice8.setVisibility(GONE);
            TxtvToppingPrice9.setVisibility(GONE);
            TxtvToppingPrice10.setVisibility(GONE);

            //hide all selected topping
            TxtvSelectedToppName1.setVisibility(GONE);
            TxtvRp1.setVisibility(GONE);
            TxtvSelectedToppPrice1.setVisibility(GONE);

            TxtvSelectedToppName2.setVisibility(GONE);
            TxtvRp2.setVisibility(GONE);
            TxtvSelectedToppPrice2.setVisibility(GONE);

            TxtvSelectedToppName3.setVisibility(GONE);
            TxtvRp3.setVisibility(GONE);
            TxtvSelectedToppPrice3.setVisibility(GONE);

            TxtvSelectedToppName4.setVisibility(GONE);
            TxtvRp4.setVisibility(GONE);
            TxtvSelectedToppPrice4.setVisibility(GONE);

            TxtvSelectedToppName5.setVisibility(GONE);
            TxtvRp5.setVisibility(GONE);
            TxtvSelectedToppPrice5.setVisibility(GONE);

            TxtvSelectedToppName6.setVisibility(GONE);
            TxtvRp6.setVisibility(GONE);
            TxtvSelectedToppPrice6.setVisibility(GONE);

            TxtvSelectedToppName7.setVisibility(GONE);
            TxtvRp7.setVisibility(GONE);
            TxtvSelectedToppPrice7.setVisibility(GONE);

            TxtvSelectedToppName8.setVisibility(GONE);
            TxtvRp8.setVisibility(GONE);
            TxtvSelectedToppPrice8.setVisibility(GONE);

            TxtvSelectedToppName9.setVisibility(GONE);
            TxtvRp9.setVisibility(GONE);
            TxtvSelectedToppPrice9.setVisibility(GONE);

            TxtvSelectedToppName10.setVisibility(GONE);
            TxtvRp10.setVisibility(GONE);
            TxtvSelectedToppPrice10.setVisibility(GONE);



            CBTopping1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice1 = Price1;
                        TxtvSelectedToppName1.setVisibility(View.VISIBLE);
                        TxtvRp1.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice1.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName1.setText(CBTopping1.getText().toString());
                        TxtvSelectedToppPrice1.setText(String.valueOf(FinalPrice1));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice1 = 0;
                        TxtvSelectedToppName1.setVisibility(GONE);
                        TxtvRp1.setVisibility(GONE);
                        TxtvSelectedToppPrice1.setVisibility(GONE);
                        TxtvSelectedToppName1.setText("null");
                        TxtvSelectedToppPrice1.setText("0");
                    }
                }
            });

            CBTopping2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice2 = Price2;
                        TxtvSelectedToppName2.setVisibility(View.VISIBLE);
                        TxtvRp2.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice2.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName2.setText(CBTopping2.getText());
                        TxtvSelectedToppPrice2.setText(String.valueOf(FinalPrice2));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice2 = 0;
                        TxtvSelectedToppName2.setVisibility(GONE);
                        TxtvRp2.setVisibility(GONE);
                        TxtvSelectedToppPrice2.setVisibility(GONE);
                        TxtvSelectedToppName2.setText("null");
                        TxtvSelectedToppPrice2.setText("0");
                    }
                }
            });

            CBTopping3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice3 = Price3;
                        TxtvSelectedToppName3.setVisibility(View.VISIBLE);
                        TxtvRp3.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice3.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName3.setText(CBTopping3.getText());
                        TxtvSelectedToppPrice3.setText(String.valueOf(FinalPrice3));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice3 = 0;
                        TxtvSelectedToppName3.setVisibility(GONE);
                        TxtvRp3.setVisibility(GONE);
                        TxtvSelectedToppPrice3.setVisibility(GONE);
                        TxtvSelectedToppName3.setText("null");
                        TxtvSelectedToppPrice3.setText("0");
                    }
                }
            });

            CBTopping4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice4 = Price4;
                        TxtvSelectedToppName4.setVisibility(View.VISIBLE);
                        TxtvRp4.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice4.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName4.setText(CBTopping2.getText());
                        TxtvSelectedToppPrice4.setText(String.valueOf(FinalPrice4));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice4 = 0;
                        TxtvSelectedToppName4.setVisibility(GONE);
                        TxtvRp4.setVisibility(GONE);
                        TxtvSelectedToppPrice4.setVisibility(GONE);
                        TxtvSelectedToppName4.setText("null");
                        TxtvSelectedToppPrice4.setText("0");
                    }
                }
            });

            CBTopping5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice5 = Price5;
                        TxtvSelectedToppName5.setVisibility(View.VISIBLE);
                        TxtvRp5.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice5.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName5.setText(CBTopping5.getText());
                        TxtvSelectedToppPrice5.setText(String.valueOf(FinalPrice5));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice5 = 0;
                        TxtvSelectedToppName5.setVisibility(GONE);
                        TxtvRp5.setVisibility(GONE);
                        TxtvSelectedToppPrice5.setVisibility(GONE);
                        TxtvSelectedToppName5.setText("null");
                        TxtvSelectedToppPrice5.setText("0");
                    }
                }
            });
        }
        else if (Code.toUpperCase().matches((inBaksoBakar.toUpperCase()))){
            //set text topping
            CBTopping1.setText("Extra Kuah, Mie & Soon");
            CBTopping2.setText("Extra Pangsit Goreng");
            CBTopping3.setText("Extra Tahu Bakso");

            //hide remaining topping CB
            CBTopping4.setVisibility(GONE);
            CBTopping5.setVisibility(GONE);
            CBTopping6.setVisibility(GONE);
            CBTopping7.setVisibility(GONE);
            CBTopping8.setVisibility(GONE);
            CBTopping9.setVisibility(GONE);
            CBTopping10.setVisibility(GONE);

            //set text tipe
            RbChoice1.setText("Pedas");
            RbChoice2.setText("Manis");
            //hide remaining tipe
            RbChoice3.setVisibility(GONE);

            //set price to variable
            Price1 = 2000;
            Price2 = 1500;
            Price3 = 1500;
            Price4 = 0;
            Price5 = 0;
            Price6 = 0;
            Price7 = 0;
            Price8 = 0;
            Price9 = 0;
            Price10 = 0;

            //set price topping
            TxtvToppingPrice1.setText("Rp."+Price1);
            TxtvToppingPrice2.setText("Rp."+Price2);
            TxtvToppingPrice3.setText("Rp."+Price3);

            //hide remaining topping price Txtv
            TxtvToppingPrice4.setVisibility(GONE);
            TxtvToppingPrice5.setVisibility(GONE);
            TxtvToppingPrice6.setVisibility(GONE);
            TxtvToppingPrice7.setVisibility(GONE);
            TxtvToppingPrice8.setVisibility(GONE);
            TxtvToppingPrice9.setVisibility(GONE);
            TxtvToppingPrice10.setVisibility(GONE);

            //hide all selected topping
            TxtvSelectedToppName1.setVisibility(GONE);
            TxtvRp1.setVisibility(GONE);
            TxtvSelectedToppPrice1.setVisibility(GONE);

            TxtvSelectedToppName2.setVisibility(GONE);
            TxtvRp2.setVisibility(GONE);
            TxtvSelectedToppPrice2.setVisibility(GONE);

            TxtvSelectedToppName3.setVisibility(GONE);
            TxtvRp3.setVisibility(GONE);
            TxtvSelectedToppPrice3.setVisibility(GONE);

            TxtvSelectedToppName4.setVisibility(GONE);
            TxtvRp4.setVisibility(GONE);
            TxtvSelectedToppPrice4.setVisibility(GONE);

            TxtvSelectedToppName5.setVisibility(GONE);
            TxtvRp5.setVisibility(GONE);
            TxtvSelectedToppPrice5.setVisibility(GONE);

            TxtvSelectedToppName6.setVisibility(GONE);
            TxtvRp6.setVisibility(GONE);
            TxtvSelectedToppPrice6.setVisibility(GONE);

            TxtvSelectedToppName7.setVisibility(GONE);
            TxtvRp7.setVisibility(GONE);
            TxtvSelectedToppPrice7.setVisibility(GONE);

            TxtvSelectedToppName8.setVisibility(GONE);
            TxtvRp8.setVisibility(GONE);
            TxtvSelectedToppPrice8.setVisibility(GONE);

            TxtvSelectedToppName9.setVisibility(GONE);
            TxtvRp9.setVisibility(GONE);
            TxtvSelectedToppPrice9.setVisibility(GONE);

            TxtvSelectedToppName10.setVisibility(GONE);
            TxtvRp10.setVisibility(GONE);
            TxtvSelectedToppPrice10.setVisibility(GONE);


            CBTopping1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice1 = Price1;
                        TxtvSelectedToppName1.setVisibility(View.VISIBLE);
                        TxtvRp1.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice1.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName1.setText(CBTopping1.getText().toString());
                        TxtvSelectedToppPrice1.setText(String.valueOf(FinalPrice1));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice1 = 0;
                        TxtvSelectedToppName1.setVisibility(GONE);
                        TxtvRp1.setVisibility(GONE);
                        TxtvSelectedToppPrice1.setVisibility(GONE);
                        TxtvSelectedToppName1.setText("null");
                        TxtvSelectedToppPrice1.setText("0");
                    }
                }
            });

            CBTopping2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice2 = Price2;
                        TxtvSelectedToppName2.setVisibility(View.VISIBLE);
                        TxtvRp2.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice2.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName2.setText(CBTopping2.getText());
                        TxtvSelectedToppPrice2.setText(String.valueOf(FinalPrice2));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice2 = 0;
                        TxtvSelectedToppName2.setVisibility(GONE);
                        TxtvRp2.setVisibility(GONE);
                        TxtvSelectedToppPrice2.setVisibility(GONE);
                        TxtvSelectedToppName2.setText("null");
                        TxtvSelectedToppPrice2.setText("0");
                    }
                }
            });

            CBTopping3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice3 = Price3;
                        TxtvSelectedToppName3.setVisibility(View.VISIBLE);
                        TxtvRp3.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice3.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName3.setText(CBTopping3.getText());
                        TxtvSelectedToppPrice3.setText(String.valueOf(FinalPrice3));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice3 = 0;
                        TxtvSelectedToppName3.setVisibility(GONE);
                        TxtvRp3.setVisibility(GONE);
                        TxtvSelectedToppPrice3.setVisibility(GONE);
                        TxtvSelectedToppName3.setText("null");
                        TxtvSelectedToppPrice3.setText("0");
                    }
                }
            });
        }
        else if (Code.toUpperCase().matches((inSoto.toUpperCase()))){
            //set text topping
            CBTopping1.setText("Tetelan Sapi");

            //hide remaining topping CB
            CBTopping2.setVisibility(GONE);
            CBTopping3.setVisibility(GONE);
            CBTopping4.setVisibility(GONE);
            CBTopping5.setVisibility(GONE);
            CBTopping6.setVisibility(GONE);
            CBTopping7.setVisibility(GONE);
            CBTopping8.setVisibility(GONE);
            CBTopping9.setVisibility(GONE);
            CBTopping10.setVisibility(GONE);


            //hide remaining tipe
            RgTipeFood.setVisibility(GONE);
            RbChoice1.setVisibility(GONE);
            RbChoice2.setVisibility(GONE);
            RbChoice3.setVisibility(GONE);

            //set price to variable
            Price1 = 7000;
            Price2 = 0;
            Price3 = 0;
            Price4 = 0;
            Price5 = 0;
            Price6 = 0;
            Price7 = 0;
            Price8 = 0;
            Price9 = 0;
            Price10 = 0;

            //set price topping
            TxtvToppingPrice1.setText("Rp."+Price1);

            //hide remaining topping price Txtv
            TxtvToppingPrice2.setVisibility(GONE);
            TxtvToppingPrice3.setVisibility(GONE);
            TxtvToppingPrice4.setVisibility(GONE);
            TxtvToppingPrice5.setVisibility(GONE);
            TxtvToppingPrice6.setVisibility(GONE);
            TxtvToppingPrice7.setVisibility(GONE);
            TxtvToppingPrice8.setVisibility(GONE);
            TxtvToppingPrice9.setVisibility(GONE);
            TxtvToppingPrice10.setVisibility(GONE);

            //hide remaining topping price Txtv
            TxtvToppingPrice4.setVisibility(GONE);
            TxtvToppingPrice5.setVisibility(GONE);
            TxtvToppingPrice6.setVisibility(GONE);
            TxtvToppingPrice7.setVisibility(GONE);
            TxtvToppingPrice8.setVisibility(GONE);
            TxtvToppingPrice9.setVisibility(GONE);
            TxtvToppingPrice10.setVisibility(GONE);

            //hide all selected topping
            TxtvSelectedToppName1.setVisibility(GONE);
            TxtvRp1.setVisibility(GONE);
            TxtvSelectedToppPrice1.setVisibility(GONE);

            TxtvSelectedToppName2.setVisibility(GONE);
            TxtvRp2.setVisibility(GONE);
            TxtvSelectedToppPrice2.setVisibility(GONE);

            TxtvSelectedToppName3.setVisibility(GONE);
            TxtvRp3.setVisibility(GONE);
            TxtvSelectedToppPrice3.setVisibility(GONE);

            TxtvSelectedToppName4.setVisibility(GONE);
            TxtvRp4.setVisibility(GONE);
            TxtvSelectedToppPrice4.setVisibility(GONE);

            TxtvSelectedToppName5.setVisibility(GONE);
            TxtvRp5.setVisibility(GONE);
            TxtvSelectedToppPrice5.setVisibility(GONE);

            TxtvSelectedToppName6.setVisibility(GONE);
            TxtvRp6.setVisibility(GONE);
            TxtvSelectedToppPrice6.setVisibility(GONE);

            TxtvSelectedToppName7.setVisibility(GONE);
            TxtvRp7.setVisibility(GONE);
            TxtvSelectedToppPrice7.setVisibility(GONE);

            TxtvSelectedToppName8.setVisibility(GONE);
            TxtvRp8.setVisibility(GONE);
            TxtvSelectedToppPrice8.setVisibility(GONE);

            TxtvSelectedToppName9.setVisibility(GONE);
            TxtvRp9.setVisibility(GONE);
            TxtvSelectedToppPrice9.setVisibility(GONE);

            TxtvSelectedToppName10.setVisibility(GONE);
            TxtvRp10.setVisibility(GONE);
            TxtvSelectedToppPrice10.setVisibility(GONE);


            CBTopping1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice1 = Price1;
                        TxtvSelectedToppName1.setVisibility(View.VISIBLE);
                        TxtvRp1.setVisibility(View.VISIBLE);
                        TxtvSelectedToppPrice1.setVisibility(View.VISIBLE);
                        TxtvSelectedToppName1.setText(CBTopping1.getText().toString());
                        TxtvSelectedToppPrice1.setText(String.valueOf(FinalPrice1));
                    }
                    else {
                        BtnAddtoCart.setVisibility(GONE);
                        FinalPrice1 = 0;
                        TxtvSelectedToppName1.setVisibility(GONE);
                        TxtvRp1.setVisibility(GONE);
                        TxtvSelectedToppPrice1.setVisibility(GONE);
                        TxtvSelectedToppName1.setText("null");
                        TxtvSelectedToppPrice1.setText("0");
                    }
                }
            });
        }
        else {

            //hide remaining topping CB
            CBTopping1.setVisibility(GONE);
            CBTopping2.setVisibility(GONE);
            CBTopping3.setVisibility(GONE);
            CBTopping4.setVisibility(GONE);
            CBTopping5.setVisibility(GONE);
            CBTopping6.setVisibility(GONE);
            CBTopping7.setVisibility(GONE);
            CBTopping8.setVisibility(GONE);
            CBTopping9.setVisibility(GONE);
            CBTopping10.setVisibility(GONE);

            //hide remaining Topping
            //hide all selected topping
            TxtvSelectedToppName1.setVisibility(GONE);
            TxtvRp1.setVisibility(GONE);
            TxtvSelectedToppPrice1.setVisibility(GONE);

            TxtvSelectedToppName2.setVisibility(GONE);
            TxtvRp2.setVisibility(GONE);
            TxtvSelectedToppPrice2.setVisibility(GONE);

            TxtvSelectedToppName3.setVisibility(GONE);
            TxtvRp3.setVisibility(GONE);
            TxtvSelectedToppPrice3.setVisibility(GONE);

            TxtvSelectedToppName4.setVisibility(GONE);
            TxtvRp4.setVisibility(GONE);
            TxtvSelectedToppPrice4.setVisibility(GONE);

            TxtvSelectedToppName5.setVisibility(GONE);
            TxtvRp5.setVisibility(GONE);
            TxtvSelectedToppPrice5.setVisibility(GONE);

            TxtvSelectedToppName6.setVisibility(GONE);
            TxtvRp6.setVisibility(GONE);
            TxtvSelectedToppPrice6.setVisibility(GONE);

            TxtvSelectedToppName7.setVisibility(GONE);
            TxtvRp7.setVisibility(GONE);
            TxtvSelectedToppPrice7.setVisibility(GONE);

            TxtvSelectedToppName8.setVisibility(GONE);
            TxtvRp8.setVisibility(GONE);
            TxtvSelectedToppPrice8.setVisibility(GONE);

            TxtvSelectedToppName9.setVisibility(GONE);
            TxtvRp9.setVisibility(GONE);
            TxtvSelectedToppPrice9.setVisibility(GONE);

            TxtvSelectedToppName10.setVisibility(GONE);
            TxtvRp10.setVisibility(GONE);
            TxtvSelectedToppPrice10.setVisibility(GONE);

            RgTipeFood.setVisibility(GONE);

            //set price to variable
            Price1 = 0;
            Price2 = 0;
            Price3 = 0;
            Price4 = 0;
            Price5 = 0;
            Price6 = 0;
            Price7 = 0;
            Price8 = 0;
            Price9 = 0;
            Price10 = 0;


            //hide remaining topping price Txtv
            TxtvToppingPrice1.setVisibility(GONE);
            TxtvToppingPrice2.setVisibility(GONE);
            TxtvToppingPrice3.setVisibility(GONE);
            TxtvToppingPrice4.setVisibility(GONE);
            TxtvToppingPrice5.setVisibility(GONE);
            TxtvToppingPrice6.setVisibility(GONE);
            TxtvToppingPrice7.setVisibility(GONE);
            TxtvToppingPrice8.setVisibility(GONE);
            TxtvToppingPrice9.setVisibility(GONE);
            TxtvToppingPrice10.setVisibility(GONE);

            TxtvTotalHarga.setText(String.valueOf(Price));
        }


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