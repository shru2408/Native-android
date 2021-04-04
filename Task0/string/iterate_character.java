//Java Program to Iterate through each characters of the string.
package com.company.string;

import java.util.Scanner;

public class iterate_character {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        System.out.println("Character in "+str+" are:");
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.print(ch+",");
        }

    }
}

//Enter the string:
//Java is good!
//Character in Java is good! are:
//J,a,v,a, ,i,s, ,g,o,o,d,!,