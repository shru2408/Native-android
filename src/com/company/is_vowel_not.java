package com.company;

import java.util.Scanner;

public class is_vowel_not {
    public static void main(String[]args){

        Scanner a=new Scanner(System.in);
        System.out.print("Enter any alphabet: ");

        char ch=a.next().charAt(0);

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Alphabet is vowel!");
        }

        else {
                System.out.println("Alphabet is consonant!");
            }

        }


    }

