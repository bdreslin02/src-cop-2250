// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 3 Assignment 

package dreslin3;
// Create a new class.
public class Program1 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Generate the first random integer between 20 and 50 (inclusive) by calling the 'random()' method of the 'Math' class and casting the number to type 'int.' Assign to variable 'number1.'
		int number1 = (int)(Math.random() * 31) + 20;
		// Generate the second random integer between 20 and 50 (inclusive) by calling the 'random()' method of the 'Math' class and casting the number to type 'int.' Assign to variable 'number2.'
		int number2 = (int)(Math.random() * 31) + 20;
		// Display the first random integer to the user - this makes it easier to see what the code is doing and if the 'if' statement is controlling the positive difference. 
		System.out.println("Integer 1: " + number1);
		// Display the second random integer to the user. 
		System.out.println("Integer 2: " + number2);
		// Use an 'if' statement to control whether or not the value of 'number2' should switch with the value of 'number1,' if 'number1' is less than 'number2.'
		if (number1 < number2) {
			// Use type 'int' to assign new variable 'temp' to 'number1.'
			int temp = number1; 
			// Switch the values of both integers, such that 'number1' now has the value of 'number2.'
			number1 = number2;
			// Assign the value of 'temp' to 'number2' - now, if 'number1' < 'number2,' both values are effectively switched so that there is a positive difference instead of a negative difference.
			number2 = temp; 
		}
		// Calculate the positive difference between the two integers using the subtraction operator. Assign to variable 'positiveDifference.'
		int positiveDifference = (number1 - number2); 
		// Display a statement telling the user what the positive difference between the two integers was calculated to be. 
		System.out.println("The positive difference between " + number1 + " and " + number2 + " is " + positiveDifference); 

	}

}
