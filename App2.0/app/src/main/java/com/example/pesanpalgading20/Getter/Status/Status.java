package com.example.pesanpalgading20.Getter.Status;

import java.util.ArrayList;

public class Status {
    private String OrderCode,Name,FoodName,TypeFood,NoTable,Status;
    private int TotalPrice;

    public Status(){

    }

    public Status(String orderCode, String name, String foodName, String typeFood, String noTable, String status, int totalPrice) {
        OrderCode = orderCode;
        Name = name;
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

    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }
}
