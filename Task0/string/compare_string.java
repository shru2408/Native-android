//Java Program to Compare Strings
package com.company.string;

import java.util.Scanner;

public class compare_string {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str=sc.next();
        String str2=sc.next();

        if (str.equals(str2)) {
            System.out.println("Both strings are equal");
        }
        else    {
            System.out.println("Both strings are not equal");

        }
    }
}

////Enter two strings:
//        Java
//        python
//        Both strings are not equal

//Enter two strings:
//java
//java
//Both strings are equal