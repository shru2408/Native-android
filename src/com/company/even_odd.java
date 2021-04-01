package com.company;

import java.util.Scanner;

public class even_odd {
    public static void main(String[]args){
        Scanner a =new Scanner(System.in);
        System.out.println("Enter number:");
        int num=a.nextInt();
        int rem=num%2;
        if (rem==0) {
            System.out.println("Number is Even!");
        }
        else{
            System.out.println("Number is Odd!");
        }


    }
}
