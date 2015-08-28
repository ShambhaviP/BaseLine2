package com.thoughtworks.baseline;

//Instantiating items and calculating the sales taxes applicable on them
public class Item {

    private String name;

    Item(String name) {
        this.name = name;
    }

    public double basicSalesTax() {
        return 0.0;
    }
}