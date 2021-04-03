package com.company;

import java.util.Scanner;

public class Decimal_place {
    public static void main(String[]args){
        Scanner i =new Scanner(System.in);
        System.out.println("Enter the number in decimal: ");
        double num=i.nextDouble();

        System.out.format("%.4f",num);
    }



}
