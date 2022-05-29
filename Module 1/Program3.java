// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapters 1 and 2 Assignment

package dreslin1and2;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
//Create a new class.
public class Program3 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a temperature (in degrees Fahrenheit) of their choosing.
		System.out.print("Please enter a temperature in degrees Fahrenheit: ");
		// Use type 'double' (temperature could be floating-point) and call the 'input' method for reading the user's input. Assign to variable 'fahrenheit.'
		double fahrenheit = input.nextDouble();
		// Calculate the equivalent Celsius temperature by utilizing the conversion formula. Use type 'double' for output precision. 
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		// Display the equivalent Celsius temperature to the user - I chose to turn the type 'double' of 'celsius' into type 'int' so that extraneous significant figures were omitted. 
		System.out.println("The temperature you entered - " + (fahrenheit) + " degrees Fahrenheit - is approximately equivalent to " + (int)(celsius) + " degrees Celsius.");

	}

}
