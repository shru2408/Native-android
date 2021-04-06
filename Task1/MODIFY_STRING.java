//to form a new string such that each digit in s is replaced by its corresponding character as given in replacements string.
package com.company;

import java.util.Scanner;

public class MODIFY_STRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the numeric string to be converted: ");
        String str = sc.nextLine();

        System.out.print("Please enter the replacement  string: ");
        String replacements = sc.nextLine();

        System.out.println("The replaces string is " + modify(str, replacements));
    }

    public static String modify(String str, String replacements) {
        char[] array = new char[10];

        for (int i = 0; i < replacements.length(); i += 2) {
            array[replacements.charAt(i)-48] = replacements.charAt(i+1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = array[str.charAt(i)-48];
            sb.append(ch);
        }
        return sb.toString();

    }
    }

//Please enter the numeric string to be converted: 12332321
//Please enter the replacement string: 2R3S1T4D
//The replaces string is TRSSRSRT

//Please enter the numeric string to be converted: 12345678
//Please enter the replacement string: 2D3D1F5E
//The replaces string is FDD E