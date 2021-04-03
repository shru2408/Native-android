//Java Program to Sort Elements in Lexicographical Order (Dictionary Order)
        package com.company.decisionloop;

public class Lexicographical_Order {
    public static void main(String[] args) {
        String[] str = {"ramesh", "suresh", "akansha", "ekta", "deepak", "lavish"};

        for (int i = 0; i < 5; ++i) {
            for (int j = i + 1; j < 6; ++j) {
                if (str[i].compareTo(str[j]) > 0) {

                    // swap words[i] with words[j[
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.print("In lexicographical order: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(str[i]);
        }
    }
}
