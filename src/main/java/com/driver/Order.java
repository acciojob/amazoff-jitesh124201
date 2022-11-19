package com.driver;

import io.swagger.models.auth.In;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {
        this.id=id;
        int hours=(Integer.valueOf(deliveryTime.charAt(0))-48)*10+(Integer.valueOf(deliveryTime.charAt(1))-48);
        int minutes=(Integer.valueOf(deliveryTime.charAt(3))-48)*10+(Integer.valueOf(deliveryTime.charAt(4))-48);
        this.deliveryTime=(hours*60)+minutes;
        //deliveryTime  = HH*60 + MM
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
}
