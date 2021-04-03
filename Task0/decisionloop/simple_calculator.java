//Java Program to Make a Simple Calculator Using switch...case
        package com.company.decisionloop;

import java.util.Scanner;

public class simple_calculator {
    public static void main(String[]args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double first = r.nextDouble();
        double second = r.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = r.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
    }
}