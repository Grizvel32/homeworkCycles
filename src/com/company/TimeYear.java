package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class TimeYear {
    public static void main(String[] args) {

        int month;

        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        month = input.nextInt();

        switch (month){
            case 1:
            case 2:
                output.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                output.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                output.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                output.println("Autumn");
                break;

            case 12:
                output.println("Winter");
                break;
            default:
                output.println("Error");
                break;
        }
        output.flush();
    }
}
