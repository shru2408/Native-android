//Java Program to Create random strings
package com.company.string;

import java.util.Random;
import java.util.Scanner;

public class create_random_string {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();


        StringBuilder sb=new StringBuilder();
        Random ran =new Random();
        int length=10;

        for (int i=0; i<length; i++){
            int index =ran.nextInt(str.length());
            char ranChar=str.charAt(index);

            sb.append(ranChar);
        }
        String ranstr = sb.toString();
        System.out.println("Random string: "+ranstr);
    }
}

//Enter the string:
//abcdefghijklmnopqrstuvwxyz123
//Random string: bfwiomiddr

//Enter the string:
//!@##$%%*)(^%$@abcdefghi123456789
//Random string: d$i$)924$2