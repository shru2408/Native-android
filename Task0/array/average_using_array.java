//Java Program to Calculate Average Using Arrays
package com.company.array;

public class average_using_array {
    public static void main(String[]args) {

        Double[] arr = {452.25, 542.0, 895.0, -567.5, 123.002};
        double sum=0.0;
        for (double num: arr){
            sum+=num;
        }
        double av=sum/ arr.length;
        System.out.print("Average will be: "+av);
        //System.out.printf("Average will be: %.2f",av);
    }
}
//Average will be: 288.9504