// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 5 Assignment

package dreslin5;
// Create a new class.
public class Program51 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Initialize two counters (variables 'multiples' and 'number') to zero and two hundred (respectively) and one accumulator (variable 'total') to zero that will ensure that the 'while' loop runs effectively. Use type 'int' for all three variables.
		int multiples = 0, number = 200, total = 0; 
		// Use a 'while' loop to determine whether or not the loop body executes. To control execution, ensure that 'multiples' remains less than sixteen - predetermined by assignment instructions. 
		while (multiples < 16) {
			// Add one to 'number' - this will increase the value of the integers that the program will examine.
			number += 1;
			// Use an 'if' statement to determine whether 'number' is a multiple of either thirteen or seventeen, but not both.
			if (number % 13 == 0 ^ number % 17 == 0) { 
				// Display the multiples to the user in fields nine characters wide that are right aligned.
				System.out.printf("%9d", number);
				// Add one to 'multiples' - this will increase the value of the counter so that successively larger integers are examined until sixteen is reached.
				multiples += 1;
				// Add 'number' to 'total' - this will increase the value of the accumulator by the value of 'number' so that the total of all integers can be reported later. 
				total += number; 
				// Use an 'if' statement to determine whether or not a new line should be created. If 'multiples' is divisible by four (i.e., four integers on a single line is found to be true), a new line will be created, and the process repeats. 
				if (multiples % 4 == 0) {
					// Create a new line everytime the above statement is proven to be true. 
					System.out.println();
				}
			}
		}
		// OPTIONAL: Display a visual barrier between the full phrase and the individual words for easier understanding. 
		System.out.println("      ------------------------------");
		// Report the total of all sixteen integers (which are, in fact, multiples of either thirteen or seventeen, but not both) to the user. 
		System.out.println("      Total: " + total);
	}

}
