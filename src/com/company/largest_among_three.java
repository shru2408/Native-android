package com.company;

import java.util.Scanner;

public class largest_among_three {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three number: ");
        double num1=s.nextDouble();
        double num2=s.nextDouble();
        double num3=s.nextDouble();

        if (num1>=num2 && num1>=num3){
            System.out.println(num1+" is the largest number!");
            }
        else if (num2>=num1 && num2>=num3){
            System.out.println(num2+" is the largest number!");
        }
        else{
            System.out.println(num3+" is the largest number!");
        }
    }
}
