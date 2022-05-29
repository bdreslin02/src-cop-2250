// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 4 Assignment

package dreslin4;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
// Create a new class.
public class Program2 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a three word phrase.
		System.out.print("Please enter a three (3) word phrase: ");
		// Read the full phrase by using the 'nextLine()' method to read the entire line of text. Assign to variable 'phrase.'
		String phrase = input.nextLine();
		// Close the Scanner class (i.e., input) to prevent a resource leak by using the 'close()' method. 
		input.close();
		// We will read the first word of the phrase by utilizing empty spaces to start and end the word search. To begin, locate the first space by calling the 'indexOf()' method of string 'phrase. Assign to variable 'firstSpace' of type 'int.'
		int firstSpace = phrase.indexOf(' '); 
		// Read the first word by starting at index 0 (first character) and ending at the first space, as defined by 'firstSpace.' 
		String firstWord = phrase.substring(0, firstSpace); 
		// Locate the second space in the string by using the same method found in line 17, but we will instead use the 'lastIndexOf()' method. Assign to variable 'secondSpace' of type 'int.'
		int secondSpace = phrase.lastIndexOf(' '); 
		// Read the second word by beginning at one plus the first space (we add one to 'firstSpace' so that the program does not count the space as part of the word) and ending at the second space. 
		String secondWord = phrase.substring (1 + firstSpace, secondSpace);
		// Read the final word by beginning at 'secondSpace' and adding one to it (so that it will ignore the space). 
		String finalWord = phrase.substring(secondSpace + 1); 
		// Display the original three word phrase to the user. 
		System.out.println("Your three word phrase: " + phrase);
		// OPTIONAL: Display a visual barrier between the full phrase and the individual words for easier understanding. 
		System.out.println("----------------------------------");
		// Report the first word to the user. 
		System.out.println(firstWord);
		// Report the second word to the user. 
		System.out.println(secondWord);
		// Report the final word to the user. 
		System.out.println(finalWord);
		// OPTIONAL: Display a visual barrier between the full phrase and the individual words for easier understanding. 
		System.out.println("----------------------------------");
		// Report the length of the entire phrase to the user by using the 'length()' method for string 'phrase.'
		System.out.println("The length of your phrase is " + phrase.length());
		// Report the length of the middle word to the user by using the 'length()' method for string 'middleWord.'
		System.out.println("The length of the middle word (" + secondWord + ") is " + secondWord.length());
		// Display the all upper case version of the last word to the user by using the 'toUpperCase()' method for string 'finalWord.'
		System.out.println("The final word in all uppercase looks like this: " + finalWord.toUpperCase());
		
	}

}
