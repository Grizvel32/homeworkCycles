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

        if (year % 400 == 0) {
            day = 12;
            output.print(String.format("%02d/%02d/%04d", day,month,year));
        }
        else if (year % 4 == 0 && year%100 !=0) {
            day = 12;
            output.print(String.format("%02d/%02d/%04d", day,month,year));
        }
        else {
            day = 13;
            output.printf(String.format("%02d/%02d/%04d", day,month,year));
        }
        output.flush();
    }
}
