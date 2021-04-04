//Java Program to Capitalize the first character of each word in a String
package com.company.string;

import java.util.Scanner;

public class capitalize_first_letter {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();

        char[] arr=str.toCharArray();
        boolean  foundSpace= true;
        for (int i=0; i< arr.length;i++){
            if (Character.isLetter(arr[i])){
                if (foundSpace){
                    arr[i]=Character.toUpperCase(arr[i]);
                    foundSpace=false;
                }
            }
            else {
                foundSpace=true;
            }
        }
        str =String.valueOf(arr);
        System.out.println("Result will be: "+str);

    }


}

//Enter string:
//java is good
//Result will be: Java Is Good