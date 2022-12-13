package com.example.pesanpalgading20.Getter.Status;

import java.util.ArrayList;

public class Status {
    private String OrderCode,Name,FoodCount,FoodName,TypeFood,NoTable,Status,TotalPrice;

    public Status(){

    }

    public Status(String orderCode, String name, String foodCount, String foodName, String typeFood, String noTable, String status, String totalPrice) {
        OrderCode = orderCode;
        Name = name;
        FoodCount = foodCount;
        FoodName = foodName;
        TypeFood = typeFood;
        NoTable = noTable;
        Status = status;
        TotalPrice = totalPrice;
    }

    public String getOrderCode() {
        return OrderCode;
    }

    public void setOrderCode(String orderCode) {
        OrderCode = orderCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFoodCount() {
        return FoodCount;
    }

    public void setFoodCount(String foodCount) {
        FoodCount = foodCount;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public String getTypeFood() {
        return TypeFood;
    }

    public void setTypeFood(String typeFood) {
        TypeFood = typeFood;
    }

    public String getNoTable() {
        return NoTable;
    }

    public void setNoTable(String noTable) {
        NoTable = noTable;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        TotalPrice = totalPrice;
    }
}
