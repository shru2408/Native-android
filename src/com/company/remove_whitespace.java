package com.company;

import java.util.Scanner;

public class remove_whitespace {
    public static void main(String[]args){
        String sen="Th   is    ver   y  good  pa  la  ce !";
        System.out.println("Original sentence:"+ sen);

        sen=sen.replaceAll("\\s","");
        System.out.println("Correct Sentence:"+sen);
    }
}
