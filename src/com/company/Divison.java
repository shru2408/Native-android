package com.company;

import java.util.Scanner;

public class Divison {
    public static void main(String[]args){
        Scanner dividend=new Scanner(System.in);
        System.out.println("Enter the value of Dividend: ");
        int d=dividend.nextInt();
        Scanner divisor=new Scanner(System.in);
        System.out.println("Enter the value of Divisor: ");
        int dor=divisor.nextInt();
        int quotient=d / dor;
        int remainder=d%dor;

        System.out.println("Quotient is: "+quotient);
        System.out.println("Remainder is: "+remainder);

    }

}
