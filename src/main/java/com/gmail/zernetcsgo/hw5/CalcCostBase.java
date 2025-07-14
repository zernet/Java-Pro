package com.gmail.zernetcsgo.hw5;

public class CalcCostBase {

    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice();
    }
}