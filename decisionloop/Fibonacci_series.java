//java Program to Display Fibonacci Series

package com.company.decisionloop;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args){
       Scanner i = new Scanner(System.in);

       System.out.print("Enter the value of n: ");
        int n=i.nextInt();
        int t1=0,t2=1;

        System.out.print("Upto "+n+ " terms: ");

        for (int j=1;j<=n;j++){
            System.out.print(t1+" + ");

            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }

    }
}
