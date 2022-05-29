// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapters 1 and 2 Assignment
package dreslin1and2;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
//Create a new class.
public class Program5 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a floating-point number.
		System.out.print("Please enter a floating-point number: ");
		// Use type 'float' and call the 'input' method for reading the user's input. Assign to variable 'number1.'
		float number1 = input.nextFloat();
		// Prompt the user to enter another floating-point number.
		System.out.print("Please enter another floating-point number: ");
		// Use type 'float' and call the 'input' method for reading the user's input. Assign to variable 'number2.'
		float number2 = input.nextFloat();
		// OPTIONAL: Display a visual barrier for a clear indication of separation.
		System.out.println("-------------------------------------------");
		// Calculate the quotient when the first number is divided by the second number. Use type 'double' (though type 'float' could also be used) and assign to variable 'quotient.'
		double quotient = (number1 / number2); 
		// Display the resulting quotient to the user.
		System.out.println("When the first number is divided by the second number, the quotient is " + quotient);
		// Use the subtraction assignment operator to decrease the quotient by 2.5. 
		quotient -= 2.5; 
		// Display the resulting number to the user. 
		System.out.println("When the quotient is decreased by 2.5, " + quotient + " is our resulting number.");
		
	}

}
