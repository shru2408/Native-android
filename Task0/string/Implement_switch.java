//Java Program to Implement switch statement on strings
package com.company.string;
public class Implement_switch {
    public static void main(String[] args) {
        // create a string
        String lang = "Programing language";

        switch (lang) {

            case "Java":
                System.out.println(lang + " is famous for enterprise applications.");
                break;

            case "Programing language":
                System.out.println(lang + " is very important for Engineering student.");
                break;

            case "Python":
                System.out.println(lang + " is famous for ML and AI.");
                break;

            default:
                System.out.println(lang + " not found on record.");
                break;
        }
    }
}

//Programing language is very important for Engineering student.