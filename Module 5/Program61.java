// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 6 Assignment
package dreslin6;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
// Create a new class.
public class Program61 {
	// Create a 'main' method for which the program will be written in.
	public static void main(String[] args) {
		// OPTIONAL: Display a statement telling the user what the program will do, given user input. 
		System.out.println("This program takes any improper fraction of your choosing and determines the equivalent mixed number.");
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in); 
		// Prompt the user to enter the numerator of their chosen improper fraction.
		System.out.print("Please enter the numerator: ");
		// Read the first input by calling the 'nextInt()' method to determine the value of the numerator. Assign to variable 'numerator' of type 'int.'
		int numerator = input.nextInt(); 
		// Prompt the user to enter the numerator of their chosen improper fraction.
		System.out.print("Please enter the denominator: ");
		// Read the second input by calling the 'nextInt()' method to determine the value of the denominator. Assign to variable 'denominator' of type 'int.'
		int denominator = input.nextInt();  
		// Close the Scanner class (i.e., input) to prevent a resource leak by calling the 'close()' method. 
		input.close();
		// Invoke the 'toMixedNumer' method for arguments 'numerator' and 'denominator.'
		toMixedNumber(numerator, denominator);
	// End the 'main' method by using a right curly bracket. 	
	}
	// Create a 'toMixedNumber' method (return value type 'void') to convert the user's improper fraction to a proper mixed number.
	public static void toMixedNumber(int numerator, int denominator) {
			// Calculate the whole number of the mixed number by calling the 'floorDiv()' method of the 'Math' class for arguments 'numerator' and 'denominator.' Assign to variable 'wholeNumber' of type 'int.'
			int wholeNumber = Math.floorDiv(numerator, denominator); 
			// Calculate the proper fraction of the mixed number by (a) finding the numerator and (b) leaving the denominator as is. Append a forward slash, so as to indicate that the string is indeed a fraction. Assign to variable 'properFraction' of type 'String.'
			String properFraction = (numerator - wholeNumber * denominator) + "/" + denominator; 
			// Create the proper mixed fraction by concatenating 'wholeNumber' and 'properFraction' together and appending a space between them - this will ensure that the outputs do not appear next to each other. 
			String mixedNumber = wholeNumber + " " + properFraction;
			// Report the resulting mixed number to the user. 
			System.out.println("Your improper fraction (" + numerator + "/" + denominator + ") is " + mixedNumber + " as a mixed number.");
	// End the 'toMixedNumber' method by using a right curly bracket.
	}
	
}
