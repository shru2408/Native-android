package com.company;

import java.util.Scanner;

public class frequency_character_string {
    public static void main(String[]args){

        Scanner i=new Scanner(System.in);
        String s="java is a aswesome language";

        char c='a';

        int frequency=0;

        for (int j=0; j<s.length();j++){
            if (c==s.charAt(j)){
                ++frequency;
            }
        }

        System.out.println("Frequency of "+c+" = "+frequency);

    }
}
