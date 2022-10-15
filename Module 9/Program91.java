// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 9 Assignment

/* Note: When writing this program, I took inspiration from our lesson on Chapter 9 from this past Monday (06/22), 
 * when we were going over creating 'Car' objects. We wrote a similar object class and executable program that made objects
 * and displayed their attributes in a similar fashion to the way this program is written - one method that created objects, 
 * put them in an array, and returned the array, and one method that displayed each car object and its attributes.
 * This methodology of writing the program makes more logical sense than writing everything in the 'main' method, hence why 
 * I chose to take the same approach. 
 */
package dreslin9;
// Create a new class - class 'Gift' will be called within the 'main' method. 
public class Program91 {
	// Create a 'main' method for which the executable program will be written in.
	public static void main(String[] args) {
		// Display a statement telling the user that the gift information will appear shortly. 
		System.out.println("Retrieving gift information...");
		// OPTIONAL: Display a visual barrier for a clear indication of separation between the previous statement and the gift information.
		System.out.println("------------------------------");
		// Invoke the 'makeGifts' method for an empty argument field by catching it in an array named 'holidayParty' of array object 'Gift[].'
		Gift[] holidayParty = makeGifts();
		// Invoke the 'showGifts' method for argument 'holidayParty.'
		showGifts(holidayParty);
	// End the 'main' method by using a right curly bracket.	
	}
	// Create a 'makeGifts' method (return type 'Gift[]') to (a) create at least six new gift instances, (b) create an array of these instances, and (c) return the array. 
	public static Gift[] makeGifts() {
		// Create a new 'Gift' object by using the 'new' operator and assigning it to variable 'gift1.'
		Gift gift1 = new Gift("Penny", "Dolls", 89.99, 2);
		// Create a second new 'Gift' object by using the 'new' operator and assigning it to variable 'gift2.'
		Gift gift2 = new Gift("Kenny", "Toys", 29.99, 4); 
		// Create a third new 'Gift' object by using the 'new' operator and assigning it to variable 'gift3.'
		Gift gift3 = new Gift("Benny", "Games", 29.99, 6);
		// Create a fourth new 'Gift' object by using the 'new' operator and assigning it to variable 'gift4.'
		Gift gift4 = new Gift("Jenny", "Makeup", 69.99, 3); 
		// Create a fifth new 'Gift' object by using the 'new' operator and assigning it to variable 'gift5.'
		Gift gift5 = new Gift("Denny", "Boots", 129.99, 1);
		// Create a sixth new 'Gift' object by using the 'new' operator and assigning it to variable 'gift6.'
		Gift gift6 = new Gift("Lenny", "Tablet", 199.99, 1);
		// Create a one-dimensional array of these six 'Gift' objects by using the array initializer syntax. Assign to variable 'gifts.'
		Gift[] gifts = {gift1, gift2, gift3, gift4, gift5, gift6};
		// Return 'gifts.' This statement will be caught in the 'main' method, as observed in line 12.
		return gifts;
	// End the 'makeGifts' method by using a right curly bracket.
	}
	// Create a 'showGifts' method (return type 'void') to (a) display the values of each 'Gift' attribute, (b) identify the recipient of the most expensive gift and the amount spent, (c) accumulate the grand total spent on gifts, (d) report how many people were gifted. 
	public static void showGifts(Gift[] gifts) {
		// Declare two variables - 'price' and 'largest' - and one accumulator: 'grandTotal', all of type 'double.' Initialize the latter two to zero. 
		double subtotal, largest = 0, grandTotal = 0;
		// Declare an empty string to hold the name of the recipient who received the most expensive gift. Assign to variable 'mostExpensiveGift' of type 'String.'
		String mostExpensiveGift = " ";
		// Use an enhanced 'for' loop ('foreach' loop) to iterate over the array, which will print out the attributes of each object, who received the most expensive gift, and accumulate the total amount spent. 
		for (Gift g : gifts) {
			// Display the attributes of each object according to the 'toString()' method found in 'Gift.java.'
			System.out.println(g);
			// Call the 'giftsVal' method for reference variable 'g' - this will print out the total spent on each person according to the 'giftsVal()' method found in 'Gift.java.'
			g.giftsVal();
			// Recalculate the subtotal for each recipient by multiplying the 'getPrice()' and 'getQty()' methods of reference variable 'g' together. 
			subtotal = g.getPrice() * g.getQty();
			// Use an 'if' statement to determine which person received the most expensive gift. If 'subtotal' is greater than 'largest,' execute the statements within the 'if' block.
			if (subtotal > largest) {
				// Assign 'largest' to the 'subtotal' - this logic will change which price is stored within largest if it is greater than the previous subtotal; thus, the most expensive gift can be found and stored within the 'largest' variable. 
				largest = subtotal;
				// Assign the individual who recieved the most expensive gift by calling the 'getRecipient()' method for reference variable 'g.' 
				mostExpensiveGift = g.getRecipient();
			}
			// Accumulate the subtotal of each 'Gift' object to 'grandTotal.'
			grandTotal += subtotal;
			// Print an empty line between the outputs so that they do not appear next to each other on the same line once the program is executed. 
			System.out.println();
		}
		// Report (a) how many people were gifted by calling the 'recipients' attribute for object 'Gift,' and (b) the total amount spent on all gifts to the user, ensuring the output is formatted according to currency format by calling the 'printf()' method. 
		System.out.printf("\nOn " + Gift.recipients + " people I spent $%,.2f", grandTotal);
		// Report who received the most expensive gift and the amount spent on that individual. Format the output according to (1) String formatting and (2) currency formatting by calling the 'printf()' method. 
		System.out.printf("\nI spent most on %s, $%,.2f", mostExpensiveGift, largest);
	// End the 'showGifts' method by using a right curly bracket.
	}

}
