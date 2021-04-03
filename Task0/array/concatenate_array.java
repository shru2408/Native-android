//Java Program to Concatenate Two Arrays
package com.company.array;


import java.util.Arrays;

public class concatenate_array {
    public static void main(String[]args){
        int[] arr={1,2,3,4};
        int[] arr2={5,6,7,8};

        int len=arr.length+ arr2.length;

        int[] result=new int[len];
        int position=0;

for (int element: arr){
    result[position]=element;
    position++;
}
        for (int element: arr2){
            result[position]=element;
            position++;    }
        System.out.println("Array will be: " +Arrays.toString(result));}
}

//Array will be: [1, 2, 3, 4, 5, 6, 7, 8]