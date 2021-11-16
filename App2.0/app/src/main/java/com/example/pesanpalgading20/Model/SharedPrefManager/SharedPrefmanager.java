package com.example.pesanpalgading20.Model.SharedPrefManager;

import android.content.Context;
import android.content.SharedPreferences;
import android.opengl.Visibility;

import com.example.pesanpalgading20.Model.OrderSetterGetter.CartStatus;
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

    //order2
    private static final String KEY2_FoodCode = "key2foodcode";
    private static final String KEY2_FoodName = "key2foodname";
    private static final String KEY2_FoodCount = "key2foodcount";
    private static final String KEY2_FoodTotalPrice = "key2foodtotalprice";
    private static final String KEY2_FoodType = "key2foodtype";
    //topping name
    private static final String KEY2_ToppingName1 = "key2toppingname1";
    private static final String KEY2_ToppingName2 = "key2toppingname2";
    private static final String KEY2_ToppingName3 = "key2toppingname3";
    private static final String KEY2_ToppingName4 = "key2toppingname4";
    private static final String KEY2_ToppingName5 = "key2toppingname5";
    private static final String KEY2_ToppingName6 = "key2toppingname6";
    private static final String KEY2_ToppingName7 = "key2toppingname7";
    private static final String KEY2_ToppingName8 = "key2toppingname8";
    private static final String KEY2_ToppingName9 = "key2toppingname9";
    private static final String KEY2_ToppingName10 = "key2toppingname10";
    //topping price
    private static final String KEY2_ToppingPrice1 = "key2toppingprice1";
    private static final String KEY2_ToppingPrice2 = "key2toppingprice2";
    private static final String KEY2_ToppingPrice3 = "key2toppingprice3";
    private static final String KEY2_ToppingPrice4 = "key2toppingprice4";
    private static final String KEY2_ToppingPrice5 = "key2toppingprice5";
    private static final String KEY2_ToppingPrice6 = "key2toppingprice6";
    private static final String KEY2_ToppingPrice7 = "key2toppingprice7";
    private static final String KEY2_ToppingPrice8 = "key2toppingprice8";
    private static final String KEY2_ToppingPrice9 = "key2toppingprice9";
    private static final String KEY2_ToppingPrice10 = "key2toppingprice10";
    //Total Price
    private static final String KEY2_TotalPrice = "key2totalprice";

    private static final String CART1STATUS = "cart1status";
    private static final String CART2STATUS = "cart2status";

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

    public void CartStatus (CartStatus cartStats){
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editorStats = sharedPreferences.edit();
        editorStats.putString(CART1STATUS, cartStats.getCart1Status());
        editorStats.putString(CART2STATUS, cartStats.getCart2Status());
        editorStats.apply();

    }

    public CartStatus GetCartStatus() {
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new CartStatus(
                sharedPreferences.getString(CART1STATUS, "Available"),
                sharedPreferences.getString(CART2STATUS, "Available")
        );
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

    public void Order2 (Order2 order2) {
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = sharedPreferences.edit();

        editor2.putString(KEY2_FoodCode, order2.getC2FoodCode());
        editor2.putString(KEY2_FoodName,order2.getC2FoodName());
        editor2.putString(KEY2_FoodCount,order2.getC2FoodCount());
        editor2.putString(KEY2_FoodTotalPrice,order2.getC2FoodTotalPrice());
        editor2.putString(KEY2_FoodType, order2.getC2FoodType());
        //topping name
        editor2.putString(KEY2_ToppingName1,order2.getC2ToppingName1());
        editor2.putString(KEY2_ToppingName2,order2.getC2ToppingName2());
        editor2.putString(KEY2_ToppingName3,order2.getC2ToppingName3());
        editor2.putString(KEY2_ToppingName4,order2.getC2ToppingName4());
        editor2.putString(KEY2_ToppingName5,order2.getC2ToppingName5());
        editor2.putString(KEY2_ToppingName6,order2.getC2ToppingName6());
        editor2.putString(KEY2_ToppingName7,order2.getC2ToppingName7());
        editor2.putString(KEY2_ToppingName8,order2.getC2ToppingName8());
        editor2.putString(KEY2_ToppingName9,order2.getC2ToppingName9());
        editor2.putString(KEY2_ToppingName10,order2.getC2ToppingName10());
        //topping price
        editor2.putString(KEY2_ToppingPrice1,order2.getC2ToppingPrice1());
        editor2.putString(KEY2_ToppingPrice2,order2.getC2ToppingPrice2());
        editor2.putString(KEY2_ToppingPrice3,order2.getC2ToppingPrice3());
        editor2.putString(KEY2_ToppingPrice4,order2.getC2ToppingPrice4());
        editor2.putString(KEY2_ToppingPrice5,order2.getC2ToppingPrice5());
        editor2.putString(KEY2_ToppingPrice6,order2.getC2ToppingPrice6());
        editor2.putString(KEY2_ToppingPrice7,order2.getC2ToppingPrice7());
        editor2.putString(KEY2_ToppingPrice8,order2.getC2ToppingPrice8());
        editor2.putString(KEY2_ToppingPrice9,order2.getC2ToppingPrice9());
        editor2.putString(KEY2_ToppingPrice10,order2.getC2ToppingPrice10());
        //total
        editor2.putString(KEY2_TotalPrice,order2.getC2TotalPrice());
        editor2.apply();
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
                sharedPreferences.getString(KEY_ToppingName1, "null"),
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
        return new Order2 (
                sharedPreferences.getString(KEY2_FoodCode, "null"),
                sharedPreferences.getString(KEY2_FoodName,"null"),
                sharedPreferences.getString(KEY2_FoodCount, null),
                sharedPreferences.getString(KEY2_FoodTotalPrice, null),
                sharedPreferences.getString(KEY2_FoodType, "null"),
                //topping name
                sharedPreferences.getString(KEY2_ToppingName1,"null"),
                sharedPreferences.getString(KEY2_ToppingName2,"null"),
                sharedPreferences.getString(KEY2_ToppingName3,"null"),
                sharedPreferences.getString(KEY2_ToppingName4,"null"),
                sharedPreferences.getString(KEY2_ToppingName5,"null"),
                sharedPreferences.getString(KEY2_ToppingName6,"null"),
                sharedPreferences.getString(KEY2_ToppingName7,"null"),
                sharedPreferences.getString(KEY2_ToppingName8,"null"),
                sharedPreferences.getString(KEY2_ToppingName9,"null"),
                sharedPreferences.getString(KEY2_ToppingName10,"null"),
                //topping price
                sharedPreferences.getString(KEY2_ToppingPrice1,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice2,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice3,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice4,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice5,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice6,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice7,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice8,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice9,"null"),
                sharedPreferences.getString(KEY2_ToppingPrice10,"null"),
                //total price
                sharedPreferences.getString(KEY2_TotalPrice,null)
        );
    }

    public void logout() {
        SharedPreferences sharedPreferences = mcontext.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

}
