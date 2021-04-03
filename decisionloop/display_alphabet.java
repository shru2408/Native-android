//Java Program to Display Alphabets (A to Z) using loop
package com.company.decisionloop;

public class display_alphabet {
    public static void main(String[]args){
        System.out.print("lower case: ");
        for (char c='a'; c<='z';c++){
            System.out.print(c+" ");
        }

        System.out.print("UPPER CASE: ");
        for(char c1='A'; c1<='Z';c1++){
            System.out.print(c1+" ");
        }
    }
}
