// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 3 Assignment 

package dreslin3;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
// Create a new class.
public class Program2 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the age of the park guest for which the price bracket will be determined. 
		System.out.print("Please enter the age of park guest: ");
		// Use type 'int' and call the 'nextInt()' method for reading the user's input. Assign to variable 'age.'
		int age = input.nextInt(); 
		// Use a multi-way 'if-else' statement for lines 16-27 to determine the price that the guest will have to pay. If the guest is older than or exactly 20 years old, they pay $125.
		if (age >= 20) {
			// If the above line is proven to be true, display to the user that they will have to pay $125 for admission. 
			System.out.println("Price of admission: $125.00.");
		}
		// If the guest is older than or exactly 12 years old, but younger than or exactly 19 years old, they pay $100 - we don't include a compound boolean expression because it is redundant.
		else if (age >= 12) {
			// If the above line is proven to be true, display to the user that they will have to pay $100 for admission. 
			System.out.println("Price of admission: $100.00.");
		}
		// If the guest is older than or exactly 4 years old, but younger than or exactly 11 years old, they pay $65.
		else if (age >= 4) { 
			// If the above line is proven to be true, display to the user that they will have to pay $65 for admission. 
			System.out.println("Price of admission: $65.00.");
		}
		// If the above statements are proven to be false, we know that the guest is under 4 years of age and therefore, they cannot enter WallyWorld. 
		else {
			// If the above line is proven to be true (i.e., all other statements are proven to be false), display to the user that the guest cannot be admitted into the park. 
			System.out.println("Children under 4 years old are not allowed into WallyWorld.");
		}
	
	}

}
