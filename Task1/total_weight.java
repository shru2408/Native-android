//to return the total weight of string s according to weights given.
package com.company;

import java.util.Scanner;

public class total_weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        System.out.println("Enter value of weights ");
        int[] weights = new int[5];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = sc.nextInt();
        }
        System.out.println("the total weight of given string is: " + totalWeight(string, weights));
    }

    public static int totalWeight(String s, int[] weights) {
        int weight = 0;
        for (int i = 0; i < s.length(); i++) {
            weight += weights[s.charAt(i) - 65];
        }
        return weight;
    }
}

//Enter a string
//ABDDECC
//Enter value of weights
//4
//2
//3
//6
//5
//the total weight of given string is: 29