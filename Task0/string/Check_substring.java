//Java Program to Check if a string contains a substring
package com.company.string;

public class Check_substring {
    public static void  main(String[]args){

        String original="Java is most popular language!";
        String str1="Java ";
        String str2="Python is easy language";

        boolean result=original.contains(str1);
        if (result){
            System.out.println(str1+" is substring!");
        }
        else {
            System.out.println(str1 + " is not substring!");
        }

        result=original.contains(str2);
        if (result){
            System.out.println(str2+" is substring!");
        }
        else {
            System.out.println(str2+ " is not substring!");
        }
    }
}

//Java  is substring!
//Python is easy language is not substring!