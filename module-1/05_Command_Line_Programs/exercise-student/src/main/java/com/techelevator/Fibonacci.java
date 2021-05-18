package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String fibonacci = myScanner.nextLine();
		//17
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		while(sum <= Integer.parseInt(fibonacci)){
			System.out.print(num1 + ",");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			sum = num3;
		}
		System.out.print(num1);
	}

}
