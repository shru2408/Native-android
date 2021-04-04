//Java Program to Check if two strings are anagram
package com.company.string;

import java.util.Arrays;
import java.util.Scanner;

public class string_anagram {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }

        sc.close();
    }
}
//Enter two Strings: heart
//earth
//heart and earth are anagram.

//Enter two Strings: abcd
//defg
//abcd and defg are not anagram.