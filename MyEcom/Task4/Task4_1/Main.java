package com.company;


import com.company.models.Product;
import com.company.models.Variant;
import com.company.models.Variants_based_product;
import com.company.models.Weight_based_product;

public class Main {


    public static void main(String[] args) {
        //Product class
        Product product = new Product();
        System.out.println(product.name);

        //WeightBasedProduct class

        Weight_based_product weight_based_product = new Weight_based_product();
        System.out.println(weight_based_product.MaxQty);

        //VariantBasedProduct class
        Variants_based_product variants_based_product = new Variants_based_product();
        System.out.println(variants_based_product.name2);

        //Variant class
        Variant variant=new Variant();
        System.out.println(variant.imageURL);
    }
}


//ABC
//10.0
//Apple
//null