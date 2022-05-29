// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 4 Assignment

package dreslin4;
// Create a new class.
public class Program1 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Generate one random integer between 48 and 122 (inclusive) by calling the 'random()' method of the 'Math' class and casting the number to type 'int.' Assign to variable 'number.'
		int number = (int)(Math.random() * 75) + 48;
		// Report the randomly generated integer to the user. 
		System.out.println("The integer is " + number);
		// Report to the user the corresponding ASCII category/character of the random integer by explicitly casting 'number' into type 'char.' 
		System.out.println("The ASCII character for " + number + " is " + (char)number);
		// Use a multi-way 'if-else' statement for lines 15-AJHEH to determine the ASCII category of 'number.' If the number is between the ASCII values for letters 'A' and 'Z,' it is an uppercase character.
		if (number >= 'A' && number <= 'Z') {
			// Report that the value is an uppercase character (letter) to the user. 
			System.out.println("That is an uppercase letter.");
		}
		// If the number is between the ASCII values for letters 'a' and 'z,' it is a lowercase character.
		else if (number >= 'a' && number <= 'z') {
			// Report that the value is a lowercase character (letter) to the user. 
			System.out.println("That is a lowercase letter.");
		}
		// If the number is between the ASCII values for numbers between '0' and '9,' it is a numeric character.
		else if (number >= '0' && number <= '9') {
			// Report that the value is a numeric character to the user. 
			System.out.println("That is a numeric character.");
		}
		// If the above statements are proven to be false, we know that the remainder of the ASCII values correlate to either punctuation or special characters (to determine between the two, we could use more multi-way if-else statements, but the assignment did not ask for that.)
		else {
			// Report that the value is either punctuation or a special character. 
			System.out.println("That is punctuation or a special character.");
		}

	}

}
