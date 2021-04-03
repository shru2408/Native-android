package com.company;

public class string_to_int {
    public static void main(String[]args){
        String str1= "56";
        String str2= "1256";

        int n1=Integer.parseInt(str1);
        int n2=Integer.valueOf(str2);

        System.out.println("Integer will be: "+n1);
        System.out.println("Integer will be: "+n2);


    }


}
