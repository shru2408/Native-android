package com.company;

import java.util.Scanner;

public class swap {
    public static void main(String[]args){
    Scanner a=new Scanner(System.in);
    System.out.println("Enter the value of F and S:");
    float F= a.nextFloat();
    float S= a.nextFloat();
        System.out.println("Before Swap");
        System.out.println("F="+F);
        System.out.println("S="+S);
    float temp=F;
    F=S;
    S=temp;
        System.out.println("After Swap");
        System.out.println("F="+F);
        System.out.println("S="+S);
    }
}
