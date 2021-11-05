package com.example.pesanpalgading20.Model.OrderSetterGetter;

public class Order1 {
    private String FoodCode, FoodName, FoodCount
                        ,FoodTotalPrice,FoodType;
    //Topping Name
    private String ToppingName1,ToppingName2,ToppingName3
                        ,ToppingName4,ToppingName5,ToppingName6
                            ,ToppingName7,ToppingName8,ToppingName9
                                ,ToppingName10;
    //Topping Price
    private String ToppingPrice1,ToppingPrice2,ToppingPrice3
                        ,ToppingPrice4,ToppingPrice5,ToppingPrice6
                            ,ToppingPrice7,ToppingPrice8,ToppingPrice9
                                ,ToppingPrice10;
    //Total Price
    private String TotalPrice;

    //Constructor
    public Order1(String foodCode, String foodName, String foodCount, String foodTotalPrice,
                  String foodType, String toppingName1, String toppingName2, String toppingName3,
                  String toppingName4, String toppingName5, String toppingName6,
                  String toppingName7, String toppingName8, String toppingName9,
                  String toppingName10,
                  String toppingPrice1, String toppingPrice2, String toppingPrice3,
                  String toppingPrice4, String toppingPrice5, String toppingPrice6,
                  String toppingPrice7, String toppingPrice8, String toppingPrice9,
                  String toppingPrice10,
                  String totalPrice) {
        FoodCode = foodCode;
        FoodName = foodName;
        FoodCount = foodCount;
        FoodTotalPrice = foodTotalPrice;
        FoodType = foodType;
        ToppingName1 = toppingName1;
        ToppingName2 = toppingName2;
        ToppingName3 = toppingName3;
        ToppingName4 = toppingName4;
        ToppingName5 = toppingName5;
        ToppingName6 = toppingName6;
        ToppingName7 = toppingName7;
        ToppingName8 = toppingName8;
        ToppingName9 = toppingName9;
        ToppingName10 = toppingName10;
        ToppingPrice1 = toppingPrice1;
        ToppingPrice2 = toppingPrice2;
        ToppingPrice3 = toppingPrice3;
        ToppingPrice4 = toppingPrice4;
        ToppingPrice5 = toppingPrice5;
        ToppingPrice6 = toppingPrice6;
        ToppingPrice7 = toppingPrice7;
        ToppingPrice8 = toppingPrice8;
        ToppingPrice9 = toppingPrice9;
        ToppingPrice10 = toppingPrice10;
        TotalPrice = totalPrice;
    }

//    //Setter
//    public void setFoodCode(String foodCode) {
//        FoodCode = foodCode;
//    }
//
//    public void setFoodName(String foodName) {
//        FoodName = foodName;
//    }
//
//    public void setFoodCount(String foodCount) {
//        FoodCount = foodCount;
//    }
//
//    public void setFoodTotalPrice(String foodTotalPrice) {
//        FoodTotalPrice = foodTotalPrice;
//    }
//
//    public void setFoodType(String foodType) {
//        FoodType = foodType;
//    }
//
//    public void setToppingName1(String toppingName1) {
//        ToppingName1 = toppingName1;
//    }
//
//    public void setToppingName2(String toppingName2) {
//        ToppingName2 = toppingName2;
//    }
//
//    public void setToppingName3(String toppingName3) {
//        ToppingName3 = toppingName3;
//    }
//
//    public void setToppingName4(String toppingName4) {
//        ToppingName4 = toppingName4;
//    }
//
//    public void setToppingName5(String toppingName5) {
//        ToppingName5 = toppingName5;
//    }
//
//    public void setToppingName6(String toppingName6) {
//        ToppingName6 = toppingName6;
//    }
//
//    public void setToppingName7(String toppingName7) {
//        ToppingName7 = toppingName7;
//    }
//
//    public void setToppingName8(String toppingName8) {
//        ToppingName8 = toppingName8;
//    }
//
//    public void setToppingName9(String toppingName9) {
//        ToppingName9 = toppingName9;
//    }
//
//    public void setToppingName10(String toppingName10) {
//        ToppingName10 = toppingName10;
//    }
//
//    public void setToppingPrice1(String toppingPrice1) {
//        ToppingPrice1 = toppingPrice1;
//    }
//
//    public void setToppingPrice2(String toppingPrice2) {
//        ToppingPrice2 = toppingPrice2;
//    }
//
//    public void setToppingPrice3(String toppingPrice3) {
//        ToppingPrice3 = toppingPrice3;
//    }
//
//    public void setToppingPrice4(String toppingPrice4) {
//        ToppingPrice4 = toppingPrice4;
//    }
//
//    public void setToppingPrice5(String toppingPrice5) {
//        ToppingPrice5 = toppingPrice5;
//    }
//
//    public void setToppingPrice6(String toppingPrice6) {
//        ToppingPrice6 = toppingPrice6;
//    }
//
//    public void setToppingPrice7(String toppingPrice7) {
//        ToppingPrice7 = toppingPrice7;
//    }
//
//    public void setToppingPrice8(String toppingPrice8) {
//        ToppingPrice8 = toppingPrice8;
//    }
//
//    public void setToppingPrice9(String toppingPrice9) {
//        ToppingPrice9 = toppingPrice9;
//    }
//
//    public void setToppingPrice10(String toppingPrice10) {
//        ToppingPrice10 = toppingPrice10;
//    }
//
//    public void setTotalPrice(String totalPrice) {
//        TotalPrice = totalPrice;
//    }

    //Getter
    public String getFoodCode() {
        return FoodCode;
    }

    public String getFoodName() {
        return FoodName;
    }

    public String getFoodCount() {
        return FoodCount;
    }

    public String getFoodTotalPrice() {
        return FoodTotalPrice;
    }

    public String getFoodType() {
        return FoodType;
    }

    public String getToppingName1() {
        return ToppingName1;
    }

    public String getToppingName2() {
        return ToppingName2;
    }

    public String getToppingName3() {
        return ToppingName3;
    }

    public String getToppingName4() {
        return ToppingName4;
    }

    public String getToppingName5() {
        return ToppingName5;
    }

    public String getToppingName6() {
        return ToppingName6;
    }

    public String getToppingName7() {
        return ToppingName7;
    }

    public String getToppingName8() {
        return ToppingName8;
    }

    public String getToppingName9() {
        return ToppingName9;
    }

    public String getToppingName10() {
        return ToppingName10;
    }

    public String getToppingPrice1() {
        return ToppingPrice1;
    }

    public String getToppingPrice2() {
        return ToppingPrice2;
    }

    public String getToppingPrice3() {
        return ToppingPrice3;
    }

    public String getToppingPrice4() {
        return ToppingPrice4;
    }

    public String getToppingPrice5() {
        return ToppingPrice5;
    }

    public String getToppingPrice6() {
        return ToppingPrice6;
    }

    public String getToppingPrice7() {
        return ToppingPrice7;
    }

    public String getToppingPrice8() {
        return ToppingPrice8;
    }

    public String getToppingPrice9() {
        return ToppingPrice9;
    }

    public String getToppingPrice10() {
        return ToppingPrice10;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }
}
