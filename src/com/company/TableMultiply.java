package com.company;

public class TableMultiply {
    public static void main(String[] args) {

        int firstDigit,secondDigit = 7, result;


        for(firstDigit = 1; firstDigit<=9;firstDigit++)
        {
            result = firstDigit*secondDigit;
            System.out.println(firstDigit+" * "+secondDigit+" = "+result);
        }
    }

}
