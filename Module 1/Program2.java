// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapters 1 and 2 Assignment

package dreslin1and2;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
// Create a new class.
public class Program2 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt user to enter the unit price of the item.
		System.out.print("Please enter unit price of the item: ");
		// Use type 'double' (price could have decimals) and call the 'input' method for reading the user's input. Assign to variable 'price.'
		double price = input.nextDouble();
		// Prompt the user to enter the quantity of the item.
		System.out.print("Please enter quantity of the item: ");
		// Use type 'int' (quantity cannot be floating-point) and call the 'input' method for reading the user's input. Assign to variable 'quantity.'
		int quantity = input.nextInt();
		// Multiply 'price' and 'quantity' together to reach the subtotal. Use type 'double' and assign to variable 'subtotal.'
		double subtotal = price * quantity; 
		// Print the subtotal (calculation's output) to the user - though not required, I chose to display the price in currency format. 
		System.out.println("Your subtotal is $" + (int)(subtotal * 100) / 100.0);
	
	}

}