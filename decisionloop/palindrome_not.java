//Java Program to Check Whether a Number is Palindrome or Not
package com.company.decisionloop;

import java.util.Scanner;

public class palindrome_not {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check palindrome: ");
        int num=sc.nextInt();
        int rev=0,n;
        n=num;
        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if (n==rev){
            System.out.println(n+" is palindrome!");

        }
        else {
            System.out.println(n+" is not palindrome!");
        }
    }
}
//Enter the number to check palindrome:
//156
//156 is not palindrome!

//Enter the number to check palindrome:
//1221
//1221 is palindrome!
