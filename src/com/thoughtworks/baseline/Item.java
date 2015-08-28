//Instantiating items and calculating the sales taxes applicable on them
package com.thoughtworks.baseline;

public class Item {

    private String name;
    private double price;

    Item(String name,double price) {
        this.name = name;
        this.price = price;
    }

    public double basicSalesTax() {
        if(name.equalsIgnoreCase("chocolate")) {
            return 0.0;
        }
        else {
            return 0.1*price;
        }
    }
}