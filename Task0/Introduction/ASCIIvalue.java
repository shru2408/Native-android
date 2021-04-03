package com.company;

import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String []args){
        Scanner i= new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        char c = i.next().charAt(0);
        int ascii =c;
        int castascii = (int)c;

        System.out.println("the Ascii value "+c+" is:"+ascii);
    }

}
