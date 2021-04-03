//Java Code To Create Pyramid
package com.company.decisionloop;

//import java.util.Scanner;

public class pattern_pyramid {
    public static void main(String[]args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number of rows: ");
        int rows =5; //sc.nextInt();

        int count = 0, c1 = 0, k = 0;
        for (int i = 1; i <= rows; ++i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i + k) + " ");
                    ++count;
                } else {
                    ++c1;
                    System.out.print((i + k - 2 * c1) + " ");
                }

                ++k;
            }
            c1 = count = k = 0;

            System.out.println();

        }
    }

}
