package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		/*Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet. Convert the length to the opposite measurement, and display the old and new measurements to the console.

				Please enter the length: 58
		Is the measurement in (m)eter, or (f)eet? f
		58f is 17m.*/
		/*m = f * 0.3048
		f = m * 3.2808399
		*/

		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		String length = myScanner.nextLine();
		double lengthDouble = Double.parseDouble(length);
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String lengthType = myScanner.nextLine();
		if(lengthType.equals("m")){
			double f = lengthDouble* 3.2808399;
			System.out.print((int)lengthDouble+"m"+" is "+(int)f+"f");
		}else{
			if (lengthType.equals("f")){
				double m = lengthDouble*0.3048;
				System.out.print((int)lengthDouble+"f is "+(int)m+"m");

			}
		}
	}

}
