package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int radiusField, radiusCircle1, radiusCircle2,radiusCircles;

        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        radiusField = input.nextInt();
        radiusCircle1 = input.nextInt();
        radiusCircle2 = input.nextInt();
        radiusCircles = radiusCircle1+radiusCircle2;

        if(radiusField >= (radiusCircle1+radiusCircle2)){

            output.println("YES");
        }
        else {

            output.println("NO");
        }

        output.flush();

    }
}
