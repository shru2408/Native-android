// to return a boolean stating whether x & y are directly proportional to each other.
package com.company;
import java.util.Scanner;

public class DIRECTLY_PROPORTIONAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int n = sc.nextInt();

        System.out.print("Please enter the elements of first: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Please enter the elements of second: ");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("The proportionality of x and y is " + isDirectlyProportional(a, b));
    }
    public static boolean isDirectlyProportional(int[] a, int[] b) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i-1]) {
                if(b[i] < b[i-1]) {
                    return false;
                }
            }
            else if (a[i] < a[i-1]) {
                if(b[i] > b[i-1]) {
                    return false;
                }
            }
            else {
                if (b[i] != b[i-1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

//Please enter the number of elements: 2
//Please enter the elements of first: 2
//3
//Please enter the elements of second: 2
//3
//The proportionality of x and y is true



//Please enter the number of elements: 2
//Please enter the elements of first: 7
//9
//Please enter the elements of second: 5
//2
//The proportionality of x and y is false