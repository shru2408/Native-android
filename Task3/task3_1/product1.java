package com.company.task3_1;

public class product1 {
    private String mName;
    private int mPrice;

    //    Defining constructors
    product1() {

    }
    product1(String name, int price) {
        this.mName = name;
        this.mPrice = price;
    }

    //    Define getter for name and price both
    public String getName() {
        return mName;
    }
    public int getPrice() {
        return mPrice;
    }

    public boolean equals(Object o) {
        product1 product = (product1) o;

        return this.mName.equals(product.getName());
    }

    public String toString() {
        return String.format("Name : %s @ Rs. %d", mName, mPrice);
    }
}
