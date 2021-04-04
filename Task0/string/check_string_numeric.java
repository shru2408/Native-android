//Java Program to Check if a String is Numeric
package com.company.string;

import java.util.Scanner;

public class check_string_numeric {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check whether it is numeric or not: ");
        String str = sc.next();
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(str + " is a number");
        else
            System.out.println(str + " is not a number");
    }
}
//Enter the string to check whether it is numeric or not:
//        52b
//        52b is not a number



// String string = "12345.15";
//        boolean numeric = true;
//        try {
//            Double num = Double.parseDouble(string);
//        } catch (NumberFormatException e) {
//            numeric = false;
//        }
//        if(numeric)
//            System.out.println(string + " is a number");
//        else
//            System.out.println(string + " is not a number");
