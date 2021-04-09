package com.company.task3_1;

public class special_product extends product1 {
        int mRegularPrice;
        int mPercentageOff;

        private special_product(String name, int price) {
            super(name, price);
        }

        public static special_product applyOffOnProduct(product1 product, int percentageOff) {
            int discountedPrice = product.getPrice() - product.getPrice()*percentageOff/100;

            special_product specialProduct = new special_product(product.getName(), discountedPrice);
            specialProduct.mRegularPrice = product.getPrice();
            specialProduct.mPercentageOff = percentageOff;

            return specialProduct  ;
        }
        public String toString() {
            return String.format("Here is special discount of: %d Percent,"+" So your"+" Product Name is %s and it's Regular price:%d and Discount price: %d", mPercentageOff,this.getName(),mRegularPrice,this.getPrice());
        }
}
