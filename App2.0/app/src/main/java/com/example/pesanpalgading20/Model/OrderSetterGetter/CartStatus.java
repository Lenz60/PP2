package com.example.pesanpalgading20.Model.OrderSetterGetter;

public class CartStatus {
    private String Cart1Status, Cart2Status;

    public CartStatus(String cart1Status, String cart2Status) {
        Cart1Status = cart1Status;
        Cart2Status = cart2Status;
    }

    public String getCart1Status() {
        return Cart1Status;
    }

    public String getCart2Status() {
        return Cart2Status;
    }

//    public void setCart1Status(String cart1Status) {
//        Cart1Status = cart1Status;
//    }
//
//    public void setCart2Status(String cart2Status) {
//        Cart2Status = cart2Status;
//    }
}
