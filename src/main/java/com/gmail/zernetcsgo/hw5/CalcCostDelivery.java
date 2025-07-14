package com.gmail.zernetcsgo.hw5;

public class CalcCostDelivery extends CalcCostBase {

    private static final double DELIVERY_PRICE = 5.0;

    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + DELIVERY_PRICE;
    }
}
