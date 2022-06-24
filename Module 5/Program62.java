// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 6 Assignment
package dreslin6;
//Import the Scanner class from the Java Utilities package.
import java.util.Scanner;
// Create a new class.
public class Program62 {
	// Create a 'main' method for which the program will be written in.
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the radius of a circle of their choosing, which will be the basis of performing the required calculations. 
		System.out.print("Please enter the radius of the circle (floating-point numbers are acceptable): ");
		// Read the input by calling the 'nextInt()' method to determine the value of the radius. Assign to variable 'radius' of type 'double.'
		double radius = input.nextDouble(); 
		// Close the Scanner class (i.e., input) to prevent a resource leak by calling the 'close()' method.
		input.close();
		// Invoke the 'printArea' method for argument 'radius.'
		printArea(radius); 
		// Invoke the 'getCircumference' method for argument 'radius.' 'Catch' the invocation by assigning it to variable 'circleCircumference' of type 'double.'
		double circleCircumference = getCircumference(radius); 
		// Display the circumference of the circle. Format the output to display four significant figures by calling the 'printf()' method. 
		System.out.printf("The circumference of your circle is %.4f", circleCircumference);
	// End the 'main' method by using a right curly bracket. 	
	}
	// Create a 'printArea' method (return value type 'void') to calculate the area of the circle. 
	public static void printArea(double radius) {
		// Calculate the area by calling the 'PI' and 'pow()' methods of the 'Math' class and multiplying it by 'radius' sqaured. Assign to variable 'circleArea' of type 'double.'
		double circleArea = (Math.PI * Math.pow(radius, 2)); 
		// Report the area of the circle to user. Format the output to display four significant figures by calling the 'printf()' method. 
		System.out.printf("The area of your circle is %.4f", circleArea);
		// Print a space - this will ensure that when invoked, the 'getCircumference' method does not appear on the same line as the last output of this method. 
		System.out.println();
	// End the 'printArea' method by using a right curly bracket. 	
	}
	// Create a 'getCircumference' method (return value type 'double') to calculate the circumference of the circle. 
	public static double getCircumference(double radius) {
		// Calculate the circumference by calling the 'PI' method of the 'Math' class and multiplying it by two and 'radius.' Assign to variable 'circleCircumference' of type 'double.'
		double circleCircumference = (2 * Math.PI * radius); 
		// Return the circumference. This statement will be caught in the 'main' method, as observed in line 20. 
		return circleCircumference; 
	// End the 'getCircumference' method by using a right curly bracket. 	
	}

}
