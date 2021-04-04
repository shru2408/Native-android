//Java Program to Differentiate String == operator and equals() method
package com.company.string;

public class Differentiate_equals_operator {
    public static void main(String[]args){
        String n1 = new String("java");
        String n2 = new String("java");
//String name1 = new String("java");
//String name2 = name1;
        System.out.println("Check if two strings are equal");

        // check if two strings are equal
        // using == operator
        boolean result1 = (n1 == n2);
        System.out.println("Using == operator: " + result1);

        // using equals() method
        boolean result2 = n1.equals(n2);
        System.out.println("Using equals(): " + result2);
    }
}

//Check if two strings are equal
//Using == operator: false
//Using equals(): true

//here == operator show false bcz name1 and name2 are two different references