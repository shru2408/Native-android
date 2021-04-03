package com.company;

import java.util.Scanner;

public class add2int {

    public static void main (String[] args){
        Scanner num=new Scanner(System.in);
        //taking input from user
                System.out.println("Enter first number:\n");
        int x=num.nextInt();
        System.out.println("Enter second number:");
        int y=num.nextInt();

        int sum=x+y;
        System.out.println("Addition is: "+sum);

    }


}
