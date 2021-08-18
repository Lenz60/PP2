package com.example.pesanpalgading20.Model.SharedPrefManager;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.pesanpalgading20.Model.OrderSetterGetter.Order1;
import com.example.pesanpalgading20.Model.OrderSetterGetter.Order2;

public class SharedPrefmanager {
    private static final String SHARED_PREF_NAME = "sharedpreferencesmanager";
    private static final String KEY_FoodCode = "keyfoodcode";
    private static final String KEY_FoodName = "keyfoodname";
    private static final String KEY_FoodCount = "keyfoodcount";
    private static final String KEY_FoodTotalPrice = "keyfoodtotalprice";
    private static final String KEY_FoodType = "keyfoodtype";
    //topping name
    private static final String KEY_ToppingName1 = "keytoppingname1";
    private static final String KEY_ToppingName2 = "keytoppingname2";
    private static final String KEY_ToppingName3 = "keytoppingname3";
    private static final String KEY_ToppingName4 = "keytoppingname4";
    private static final String KEY_ToppingName5 = "keytoppingname5";
    private static final String KEY_ToppingName6 = "keytoppingname6";
    private static final String KEY_ToppingName7 = "keytoppingname7";
    private static final String KEY_ToppingName8 = "keytoppingname8";
    private static final String KEY_ToppingName9 = "keytoppingname9";
    private static final String KEY_ToppingName10 = "keytoppingname10";
    //topping price
    private static final String KEY_ToppingPrice1 = "keytoppingprice1";
    private static final String KEY_ToppingPrice2 = "keytoppingprice2";
    private static final String KEY_ToppingPrice3 = "keytoppingprice3";
    private static final String KEY_ToppingPrice4 = "keytoppingprice4";
    private static final String KEY_ToppingPrice5 = "keytoppingprice5";
    private static final String KEY_ToppingPrice6 = "keytoppingprice6";
    private static final String KEY_ToppingPrice7 = "keytoppingprice7";
    private static final String KEY_ToppingPrice8 = "keytoppingprice8";
    private static final String KEY_ToppingPrice9 = "keytoppingprice9";
    private static final String KEY_ToppingPrice10 = "keytoppingprice10";
    //Total Price
    private static final String KEY_TotalPrice = "keytotalprice";

    private static SharedPrefmanager mInstance;
    private static Context mcontext;

    private SharedPrefmanager(Context context) {
        mcontext = context;
    }
    public static synchronized SharedPrefmanager getInstance(Context context){
        if (mInstance == null){
            mInstance = new SharedPrefmanager(context);
        }
        return mInstance;
    }

    public void Order1 (Order1 order1){
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_FoodCode, order1.getFoodCode());
        editor.putString(KEY_FoodName,order1.getFoodName());
        editor.putString(KEY_FoodCount,order1.getFoodCount());
        editor.putString(KEY_FoodTotalPrice,order1.getFoodTotalPrice());
        editor.putString(KEY_FoodType, order1.getFoodType());
        //topping name
        editor.putString(KEY_ToppingName1,order1.getToppingName1());
        editor.putString(KEY_ToppingName2,order1.getToppingName2());
        editor.putString(KEY_ToppingName3,order1.getToppingName3());
        editor.putString(KEY_ToppingName4,order1.getToppingName4());
        editor.putString(KEY_ToppingName5,order1.getToppingName5());
        editor.putString(KEY_ToppingName6,order1.getToppingName6());
        editor.putString(KEY_ToppingName7,order1.getToppingName7());
        editor.putString(KEY_ToppingName8,order1.getToppingName8());
        editor.putString(KEY_ToppingName9,order1.getToppingName9());
        editor.putString(KEY_ToppingName10,order1.getToppingName10());
        //topping price
        editor.putString(KEY_ToppingPrice1,order1.getToppingPrice1());
        editor.putString(KEY_ToppingPrice2,order1.getToppingPrice2());
        editor.putString(KEY_ToppingPrice3,order1.getToppingPrice3());
        editor.putString(KEY_ToppingPrice4,order1.getToppingPrice4());
        editor.putString(KEY_ToppingPrice5,order1.getToppingPrice5());
        editor.putString(KEY_ToppingPrice6,order1.getToppingPrice6());
        editor.putString(KEY_ToppingPrice7,order1.getToppingPrice7());
        editor.putString(KEY_ToppingPrice8,order1.getToppingPrice8());
        editor.putString(KEY_ToppingPrice9,order1.getToppingPrice9());
        editor.putString(KEY_ToppingPrice10,order1.getToppingPrice10());
        //total
        editor.putString(KEY_TotalPrice,order1.getTotalPrice());
        editor.apply();
    }

    public void Order2 (Order2 order2){
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_FoodCode, order2.getFoodCode());
        editor.putString(KEY_FoodName,order2.getFoodName());
        editor.putString(KEY_FoodCount,order2.getFoodCount());
        editor.putString(KEY_FoodTotalPrice,order2.getFoodTotalPrice());
        editor.putString(KEY_FoodType, order2.getFoodType());
        //topping name
        editor.putString(KEY_ToppingName1,order2.getToppingName1());
        editor.putString(KEY_ToppingName2,order2.getToppingName2());
        editor.putString(KEY_ToppingName3,order2.getToppingName3());
        editor.putString(KEY_ToppingName4,order2.getToppingName4());
        editor.putString(KEY_ToppingName5,order2.getToppingName5());
        editor.putString(KEY_ToppingName6,order2.getToppingName6());
        editor.putString(KEY_ToppingName7,order2.getToppingName7());
        editor.putString(KEY_ToppingName8,order2.getToppingName8());
        editor.putString(KEY_ToppingName9,order2.getToppingName9());
        editor.putString(KEY_ToppingName10,order2.getToppingName10());
        //topping price
        editor.putString(KEY_ToppingPrice1,order2.getToppingPrice1());
        editor.putString(KEY_ToppingPrice2,order2.getToppingPrice2());
        editor.putString(KEY_ToppingPrice3,order2.getToppingPrice3());
        editor.putString(KEY_ToppingPrice4,order2.getToppingPrice4());
        editor.putString(KEY_ToppingPrice5,order2.getToppingPrice5());
        editor.putString(KEY_ToppingPrice6,order2.getToppingPrice6());
        editor.putString(KEY_ToppingPrice7,order2.getToppingPrice7());
        editor.putString(KEY_ToppingPrice8,order2.getToppingPrice8());
        editor.putString(KEY_ToppingPrice9,order2.getToppingPrice9());
        editor.putString(KEY_ToppingPrice10,order2.getToppingPrice10());
        //total
        editor.putString(KEY_TotalPrice,order2.getTotalPrice());
        editor.apply();
    }

    public Order1 GetOrder1() {
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new Order1(
                sharedPreferences.getString(KEY_FoodCode, "null"),
                sharedPreferences.getString(KEY_FoodName,"null"),
                sharedPreferences.getString(KEY_FoodCount, null),
                sharedPreferences.getString(KEY_FoodTotalPrice, null),
                sharedPreferences.getString(KEY_FoodType, "null"),
                //topping name
                sharedPreferences.getString(KEY_ToppingName1,"null"),
                sharedPreferences.getString(KEY_ToppingName2,"null"),
                sharedPreferences.getString(KEY_ToppingName3,"null"),
                sharedPreferences.getString(KEY_ToppingName4,"null"),
                sharedPreferences.getString(KEY_ToppingName5,"null"),
                sharedPreferences.getString(KEY_ToppingName6,"null"),
                sharedPreferences.getString(KEY_ToppingName7,"null"),
                sharedPreferences.getString(KEY_ToppingName8,"null"),
                sharedPreferences.getString(KEY_ToppingName9,"null"),
                sharedPreferences.getString(KEY_ToppingName10,"null"),
                //topping price
                sharedPreferences.getString(KEY_ToppingPrice1,"null"),
                sharedPreferences.getString(KEY_ToppingPrice2,"null"),
                sharedPreferences.getString(KEY_ToppingPrice3,"null"),
                sharedPreferences.getString(KEY_ToppingPrice4,"null"),
                sharedPreferences.getString(KEY_ToppingPrice5,"null"),
                sharedPreferences.getString(KEY_ToppingPrice6,"null"),
                sharedPreferences.getString(KEY_ToppingPrice7,"null"),
                sharedPreferences.getString(KEY_ToppingPrice8,"null"),
                sharedPreferences.getString(KEY_ToppingPrice9,"null"),
                sharedPreferences.getString(KEY_ToppingPrice10,"null"),
                //total price
                sharedPreferences.getString(KEY_TotalPrice,null)
        );
    }

    public Order2 GetOrder2() {
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new Order2(
                sharedPreferences.getString(KEY_FoodCode,"null"),
                sharedPreferences.getString(KEY_FoodName,"null"),
                sharedPreferences.getString(KEY_FoodCount, null),
                sharedPreferences.getString(KEY_FoodTotalPrice, null),
                sharedPreferences.getString(KEY_FoodType, "null"),
                //topping name
                sharedPreferences.getString(KEY_ToppingName1,"null"),
                sharedPreferences.getString(KEY_ToppingName2,"null"),
                sharedPreferences.getString(KEY_ToppingName3,"null"),
                sharedPreferences.getString(KEY_ToppingName4,"null"),
                sharedPreferences.getString(KEY_ToppingName5,"null"),
                sharedPreferences.getString(KEY_ToppingName6,"null"),
                sharedPreferences.getString(KEY_ToppingName7,"null"),
                sharedPreferences.getString(KEY_ToppingName8,"null"),
                sharedPreferences.getString(KEY_ToppingName9,"null"),
                sharedPreferences.getString(KEY_ToppingName10,"null"),
                //topping price
                sharedPreferences.getString(KEY_ToppingPrice1,"null"),
                sharedPreferences.getString(KEY_ToppingPrice2,"null"),
                sharedPreferences.getString(KEY_ToppingPrice3,"null"),
                sharedPreferences.getString(KEY_ToppingPrice4,"null"),
                sharedPreferences.getString(KEY_ToppingPrice5,"null"),
                sharedPreferences.getString(KEY_ToppingPrice6,"null"),
                sharedPreferences.getString(KEY_ToppingPrice7,"null"),
                sharedPreferences.getString(KEY_ToppingPrice8,"null"),
                sharedPreferences.getString(KEY_ToppingPrice9,"null"),
                sharedPreferences.getString(KEY_ToppingPrice10,"null"),
                //total price
                sharedPreferences.getString(KEY_TotalPrice,null)
        );
    }

    public void logout() {
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

}
