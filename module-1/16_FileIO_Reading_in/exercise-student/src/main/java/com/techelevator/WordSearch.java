
package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordSearch {
	public static void main(String[] args) {
		File userFile = inputFileFromUser();
		getWordFromUserCaseSensative(userFile);
	}
	private static File inputFileFromUser() {
		//@SuppressWarnings("resource")
		Scanner fileInput = new Scanner(System.in);
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String filePath = fileInput.nextLine();
		File userFile = new File(filePath);
		return userFile;
	}
	public static String getWordFromUserCaseSensative(File userFile) {
		//@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a word to search");
		String word = userInput.nextLine();
		System.out.println("Would you like your search to be case sensitive? (Y)es or (N)o ");
		String yesOrNo = userInput.nextLine();
		try (Scanner input = new Scanner(userFile)) {
			int x = 0;
			while (input.hasNextLine()) {
				x++;
				if (yesOrNo.equals("N")) {

					String line = input.nextLine();
					if (line.toLowerCase().contains(word.toLowerCase())) {
						System.out.println(x + ") " + line);
					} else {
					}
				} else {
					String line = input.nextLine();
					if (line.contains(word)) {
						System.out.println(x + ") " + line);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Sorry your file doesn't exist");
		}
		return "";
	}
}