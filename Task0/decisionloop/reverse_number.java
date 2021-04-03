//Java Program to Reverse a Number
package com.company.decisionloop;

import java.util.Scanner;

public class reverse_number {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter integer: ");
            int num = sc.nextInt();
            int rev=0;

            while (num!=0){
                int digit=num%10;
                rev=rev*10 + digit;
                num/=10;
            }
            System.out.println("Reversed number: "+rev);

        }
}
//Enter integer:
//984651321
//Reversed number: 123156489