//Java Program to Count Number of Digits in an Integer
package com.company.decisionloop;

import java.util.Scanner;

public class count_number_in_integer {
    public static void  main(String[] args){
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=i.nextInt();
        int count=0;

        while (num != 0){
            num/=10;
            count++;

        }
        System.out.println("Digits are: "+count);
    }

}
