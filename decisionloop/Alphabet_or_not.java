//Java Program to Check Whether a Character is Alphabet or Not

package com.company.decisionloop;

import java.util.Scanner;

public class Alphabet_or_not {
    public static void main(String[]args){
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char c=i.next().charAt(0);
//if ((char c>='a' && c<='z')|| (char>='A' && char<='Z'))
        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is alphabet!");
        }
        else {
            System.out.println(c+" is not alphabet!");
        }

    }
}
