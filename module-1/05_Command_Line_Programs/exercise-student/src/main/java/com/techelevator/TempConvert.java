package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		String temperature = myScanner.nextLine();
		double temperatureDouble = Double.parseDouble(temperature);

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String temperatureType = myScanner.nextLine();

		if(temperatureType.equals("C")){
			double Tf = temperatureDouble * 1.8 + 32;
			System.out.print(temperature +"C is " + (int)Tf + "F");
		}else{
			if(temperatureType.equals("F")){
				double Tc = (temperatureDouble - 32)/ 1.8;
				System.out.print(temperature +"F is " + (int)Tc + "C");
			}
		}
	}

}
