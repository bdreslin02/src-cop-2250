// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 3 Assignment

package dreslin3;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
// Create a new class.
public class Program3 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter an even multiple of 23 that is under 500.
		System.out.print("Please enter an even multiple of 23 that is under 500: ");
		// Use type 'int' and call the 'nextInt()' method for reading the user's input. Assign to variable 'number.'
		int number = input.nextInt(); 
		// Use an 'if' statement that utilizes a compound boolean expression (in this case, '&&') to determine whether or not the number is (a) an even multiple of 23 and (b) under 500. 
		if (number % 23 == 0 && number % 2 == 0 && number < 500) {
			// Display a statement telling the user that their input is correct. 
			System.out.println("Correct!");
			// Display a statement telling the user that their input is an even multiple of 23 that is also under 500. 
			System.out.println(number + " is an even multiple of 23 that is under 500.");
		}
		// If the above 'if' statement is proven to be false, we know that either: (a) the number is not a multiple of 23, (b) the number is not an even multiple of 23, or (c) the number > 500.
		else {
			// Display a statement telling the user that their input is incorrect. 
			System.out.println("Incorrect.");
			// Display a statement telling the user that their input is either NOT an even multiple of 23 or is over 500.
			System.out.println(number + " is either not an even multiple of 23 or is over 500.");
		}

	}

}
