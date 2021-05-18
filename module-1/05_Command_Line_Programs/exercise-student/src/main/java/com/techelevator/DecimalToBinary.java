package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter in a series of decimal values (separated by spaces): ");
        String decimalToBinary = myScanner.nextLine();
        String[] decimalArray = decimalToBinary.split(" ");
        //460 8218 1 31313 987654321
        for (int i = 0; i <= decimalArray.length - 1; i = i + 1){
            System.out.println(decimalArray[i] + " in binary is " + Integer.toBinaryString(Integer.parseInt(decimalArray[i])));
        }

    }
}
