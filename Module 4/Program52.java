// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 5 Assignment

package dreslin5;
//Import the Scanner class from the Java Utilities package.
import java.util.Scanner;
// Create a new class.
public class Program52 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in); 
		// Prompt the user a binary number that is 8 bits or less
		System.out.print("Please enter a binary number (8 bits or less): ");
		// Use type 'String' and call the 'nextLine()' method for reading the user's input. Assign to variable 'binary.'
		String binary = input.nextLine(); 
		// To prevent a resource leak, call the 'close()' method for the Scanner object. 
		input.close();
		// Initialize one counter (variable 'bitNumber'), one accumulator (variable 'decimal') and one stand-alone variable ('binaryLength'), all of which are type 'int.'
		int decimal = 0, binaryLength = binary.length(), bitNumber = binaryLength - 1;
		// Use a 'for' loop to determine whether or not the loop body executes. For 'i' of type 'int,' where 'i' is less than 'binaryLength,' increment 'i' by one for each iteration of the loop.
		for (int i = 0; i < binaryLength; i++) {
			// Use an 'if' statement to determine whether or not the value at 'i' is one by calling the 'charAt()' method for 'binary.'
			if (binary.charAt(i) == '1') {
				// If the above statement is proven to be true, add the power of two and what the value of 'bitNumber' is to 'decimal.'
				decimal += Math.pow(2, bitNumber); 
			}
			// Decrement 'bitNumber' by one to ensure that an infinite loop will not occur. 
			bitNumber--;
		}
		// Report the resulting base-10 decimal number to the user after the conversion has been performed. 
		System.out.println("The binary number you entered (" + binary + ")" + " is " + decimal + " in base-10.");
		

	}

}
