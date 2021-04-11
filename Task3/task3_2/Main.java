package com.company;

public class Main {
    public static void main(String[] args) {
        GroceryItem sugar = new GroceryItem("Sugar", 35);
        GroceryItem jaggery = new GroceryItem("Jaggery", 40);
        GroceryItem apple = new GroceryItem("Apple", 100);
        GroceryItem mango = new GroceryItem("Mango", 60);

        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(sugar, "3kg 0g"));
        cart.add(GroceryCartItem.createNew(jaggery, "0kg 750g"));
        cart.add(GroceryCartItem.createNew(apple, "1kg 500g"));
        cart.add(GroceryCartItem.createNew(mango, "3kg 500g"));

        System.out.println(cart.toString());
    }
}


/*Cart{
	groceryCartItems = {
		Sugar (₹35 X 3.00kg) = ₹105.0,
		Jaggery (₹40 X 0.75kg) = ₹30.0,
		Apple (₹100 X 1.50kg) = ₹150.0,
		Mango (₹60 X 3.50kg) = ₹210.0
	],
totalAmount = ₹0.0}
*/
