// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapters 1 and 2 Assignment

package dreslin1and2;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
// Create a new class.
public class Program4 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the length of a rectangle.
		System.out.print("Please enter the length of the rectangle: ");
		// Use type 'double' (length could be floating-point) and call the 'input' method for reading the user's input. Assign to variable 'length.'
		double length = input.nextDouble();
		// Prompt the user to enter the width of a rectangle. 
		System.out.print("Please enter the width of the rectangle: ");
		// Use type 'double' (width could be floating-point) and call the 'input' method for reading the user's input. Assign to variable 'width.'
		double width = input.nextDouble();
		// Calculate the perimeter of the rectangle by using the below formula. Use type 'double' and assign to variable 'perimeter.'
		double perimeter = 2 * (length + width); 
		// Calculate the area of the rectangle by using the below formula. Use type 'double' and assign to variable 'area.'
		double area = (length * width);
		// Display a statement telling the user that, for the dimensions they entered, the program calculated the following outputs.
		System.out.println("For the dimensions of this rectangle:");
		// OPTIONAL: Display a visual barrier for a clear indication of separation.
		System.out.println("-------------------------------------");
		// Display the perimeter of the rectangle to the user. 
		System.out.println("   Perimeter: " + perimeter);
		// Display the area of the rectangle to the user. 
		System.out.println("   Area: " + area);

	}

}
