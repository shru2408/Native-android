package com.company;

import java.util.ArrayList;

class GroceryItem {
     String mName;
     int mPricePerKg;

    GroceryItem(String name, int pricePerKg) {
        this.mName = name;
        this.mPricePerKg = pricePerKg;
    }

    public String getName() {
        return mName;
    }
    public int getPricePerKg() {
        return mPricePerKg;
    }
}

//Now we create Cart
class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

    Cart() {
        cartItems = new ArrayList<>();
        totalAmount = 0;
    }

    public void add(GroceryCartItem item) {
        cartItems.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Cart{" +
                "\tgroceryCartItems = {");
        for (GroceryCartItem gci : cartItems) {
            sb.append("\n\t\t").append(gci.toString()).append(",");
        }
        sb.append("""
                \b
                \t],
                totalAmount = ₹""").append(this.totalAmount).append("}");

        return sb.toString();
    }
}
//Now we create Grocery Cart item
 class GroceryCartItem extends GroceryItem {
    float mPrice;
    float mQuantity;

    private GroceryCartItem(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return String.format("%s (₹%d X %.2fkg) = ₹%.1f", this.getName(), this.getPricePerKg(), this.mQuantity, this.mPrice);
    }

    public static float extractQuantity(String quantityStr) {
        String[] weightInString = quantityStr.split(" ");
        int[] weightInInteger = {Integer.parseInt(weightInString[0].replace("kg", "")), Integer.parseInt(weightInString[1].replace("g", ""))};

        double f = weightInInteger[0] + weightInInteger[1]*Math.pow(10, -3);

        return (float) f;
    }

    public static GroceryCartItem createNew(GroceryItem item, String quantityStr) {
        GroceryCartItem gci = new GroceryCartItem(item.getName(), item.getPricePerKg());
        gci.mQuantity = GroceryCartItem.extractQuantity(quantityStr);
        gci.mPrice = gci.mQuantity*gci.getPricePerKg();

        return gci;
    }
}