package com.company;

import java.util.Scanner;

public class JavaCyclesWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 9;
        int number = 7;
        int step = 1;

        System.out.print("a: ");
        a = input.nextInt();

        System.out.print("b: ");
        b = input.nextInt();

        System.out.print("step: ");
        step = input.nextInt();

        int i = a;

        while(i<=b){
            System.out.println(String.format("%d*%d=%d",number,i,number*i));
            i+=step;
        }

         i = b;

        while(i>=a){
            System.out.println(String.format("%d*%d=%d",number,i,number*i));
            i-=step;
        }

    }
}
