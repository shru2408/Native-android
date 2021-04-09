package com.company.task3_1;

public class main {
    public static void main(String[]args){
        product1 StudyMaterial1 = new product1("Copy", 50);
        product1 StudyMaterial2 = new product1("Book", 50);
        product1 StudyMaterial3 = new product1("Pen", 20);

        System.out.println(StudyMaterial1.toString());
        System.out.println(StudyMaterial2.toString());
        System.out.println(StudyMaterial3.toString());

        System.out.println("The equality of Study material1 and study material2 is " + StudyMaterial1.equals(StudyMaterial2));

        special_product specialProduct = special_product.applyOffOnProduct(StudyMaterial1, 10);
        System.out.println(specialProduct.toString());
    }
}

//Name : Copy @ Rs. 50
//Name : Book @ Rs. 50
//Name : Pen @ Rs. 20
//The equality of Study material1 and study material2 is false
//Here is special discount of: 10 Percent, So your Product Name is Copy and it's Regular price:50 and Discount price: 45