//Java Program to Convert String to Date
package com.company.string;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class string_to_date {
    public static void main(String[]args){
        String str="2021-03-03";
        LocalDate date=LocalDate.parse(str, DateTimeFormatter.ISO_DATE);

        System.out.println("Date is: "+date);
    }
}

//Date is: 2021-03-03