package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class programmerDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        final int month = 9;
        int year,day;

        year = input.nextInt();

        if ((year % 400 == 0) ||
                (year % 4 == 0 && year%100 !=0)){
            day = 12;
        }
        else {
            day = 13;
        }
        output.print(String.format("%02d/%02d/%04d", day,month,year));
        output.flush();
    }
}
