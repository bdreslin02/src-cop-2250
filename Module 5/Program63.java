// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 6 Assignment
package dreslin6;
// Import the Scanner class from the Java Utilities package.
import java.util.Scanner;
// Create a new class.
public class Program63 {
	// Create a 'main' method for which the program will be written in.
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the number of different items being purchased. 
		System.out.print("How many different items are being purchased? ");
		// Read the input by calling the 'nextInt()' method to determine the number of items being purchased. Assign to variable 'numberOfItems' of type 'int.'
		int numberOfItems = input.nextInt(); 
		// Initialize an items counter to zero - this will control the number of times the 'while' loop executes. Assign to counter 'items' of type 'int.'
		int items = 0;
		// Initialize a grand total accumulator to zero - this will be used to report the grand total of the grocery bill to the user. Assign to accumulator 'grandTotal' of type 'double.'
		double grandTotal = 0;
		// Use a 'while' loop to control the user's inputs and program outputs. The loop body will only execute if 'items' is less than 'numberOfItems.'
		while (items < numberOfItems) {
			// Increment 'items' by one for each iteration of the loop. 
			items++;
			// Prompt the user to enter the price of the current item.
			System.out.print("Enter price of item " + items + ": ");
			// Read the input by calling the 'nextDouble()' method to determine the price of the current item. Assign to variable 'price' of type 'double.'
			double price = input.nextDouble(); 
			// Prompt the user to enter the quantity of the current item. 
			System.out.print("Enter quantity of this item: ");
			// Read the input by calling the 'nextInt()' method to determine the quantity of the current item. Assign to variable 'quantity' of type 'int.'
			int quantity = input.nextInt();
			// Prompt the user to enter whether or not the item is taxable (using boolean values true or false). 
			System.out.print("Is this item taxable (true/false)? ");
			// Read the input by calling the 'nextBoolean()' method to determine whether or not the item is taxable. Assign to variable 'taxable' of type 'boolean.'
			boolean taxable = input.nextBoolean();
			// Invoke the 'item()' method for arguments 'price,' 'quantity,' and 'taxable.' Accumulate the value returned by the method to 'grandTotal.'
			grandTotal += item(price, quantity, taxable); 
			// Print a space - this will ensure that when invoked, the 'item' method does not appear on the same as the next user prompt (if any) of this method's loop. 
			System.out.println();
			
		}
		// Close the Scanner class (i.e., input) to prevent a resource leak by calling the 'close()' method.
		input.close();
		// Report the grand total of the grocery bill to the user. Format the output according to currency format. 
		System.out.printf("Please pay: $%.2f", grandTotal);
		
	// End the 'main' method by using a right curly bracket.
	}
	// Create an 'item' method (return value type 'double') to calculate the subtotal, sales tax (where applicable), and total of the items being purchased. 
	public static double item(double price, int quantity, boolean taxable) {
		// Create a constant for the predetermined rate of sales tax. Assign to constant 'SALES_TAX_RATE' of type 'double.'
		final double SALES_TAX_RATE = 0.07;
		// Calculate the item's subtotal by multiplying 'price' and 'quantity' together. Assign to variable 'subtotal' of type 'double.'
		double subtotal = (price * quantity); 
		// Declare variable 'salesTax.'
		double salesTax;
		// Use an 'if-else' block to determine whether or not sales tax should be applied to the item. If parameter 'taxable' is proven to be true, calculate the sales tax. 
		if (taxable == true) {
			// Calculate the sales tax by multiplying 'price,' 'quantity,' and 'SALES_TAX_RATE' together. 
			salesTax = (price * quantity * SALES_TAX_RATE); 
		}
		// If line 57 is proven to be false, the sales tax will be $0.00. 
		else {
			// Declare 'salesTax' as being equal to zero. 
			salesTax = 0;
		}
		// Calculate the item's total by adding 'subtotal' and 'salesTax' together. 
		double total = (subtotal + salesTax); 
		// Report the item's subtotal to the user. Format according to currency format. 
		System.out.printf("Subtotal: $%,.2f", subtotal);
		// Report the item's sales tax to the user. Format according to currency format. 
		System.out.printf("\nSales tax: $%,.2f", salesTax);
		// Report the item's total to the user. Format according to currency format. 
		System.out.printf("\nTotal: $%.2f", total);
		// Return 'total.' This statement will be caught in the 'main' method, as observed in line 36.
		return total; 
	// End the 'item' method by using a right curly bracket.
	}
	
}

