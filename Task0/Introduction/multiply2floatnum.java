package com.company;

import java.util.Scanner;

public class multiply2floatnum {
    public static void main(String[] args)
    {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter first number:");
        float x=m.nextFloat();
        System.out.println("Enter second number:");
        float y=m.nextFloat();
        float product= x*y;
        System.out.println("Product will be: "+ product);


    }
}
