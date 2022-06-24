// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 5 Assignment

package dreslin5;
//Import the Scanner class from the Java Utilities package.
import java.util.Scanner;
// Create a new class.
public class Program54 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Initialize one accumulator and set it equal to zero. Assign to variable 'total' of type 'double.'
		double total = 0;
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in); 
		// Prompt the user to enter the item's price or zero to quit the program. 
		System.out.print("Please enter item price or zero to quit: ");
		// Use type 'double' and call the 'nextDouble()' method for reading the user's input. Assign to variable 'price.'
		double price = input.nextDouble(); 
		// Use a 'while' loop to determine whether or not the loop body executes. To control execution, ensure that 'price' does NOT equal zero.
		while (price != 0) {
			// Prompt the user to enter the quantity for the item. 
			System.out.print("Please enter quantity for this item: ");
			// Use type 'int' and call the 'nextInt()' method for reading the user's input. Assign to variable 'quantity.'
			int quantity = input.nextInt(); 
			// Calculate the subtotal for the item by multiplying 'price' and 'quantity' together. Assign to variable 'subtotal' of type 'double.'
			double subtotal = price * quantity;  
			// Add 'subtotal' to 'total' - this will increase the value of the accumulator by the value of 'subtotal' so that the total price of all items can be reported later. 
			total += subtotal;
			// Report the subtotal to the user and format the price according to currency format by calling the 'printf()' method. 
			System.out.printf("This item's subtotal: $%,.2f", subtotal);
			// Display a space between the subtotal and the next price prompt so that the two statements are not pushed together on one line. 
			System.out.println();
			// Re-prompt the user to enter the item's price or zero to quit the program - this ensures that the loop is maintained and that multiple user inputs are possible. 
			System.out.print("Enter item price or zero to quit: ");
			// Call the 'nextDouble()' method for reading the user's input. Assign to variable 'price' - NOTE: We do not have to re-declare the variable as type 'double' because we are only reusing the variable, not creating a new one. 
			price = input.nextDouble(); 
		}
		// To prevent a resource leak, call the 'close()' method for the Scanner object. 
		input.close();
		// Report the total (formatted according to currency format) to the user by calling the 'printf()' method. 
		System.out.printf("Total: $%,.2f", total);
	}

}
