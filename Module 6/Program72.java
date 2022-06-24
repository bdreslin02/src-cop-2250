// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapters 7 and 11 Assignment
package dreslin7and11;
// Create a new class.
public class Program72 {
	// Create a 'main' method for which the program will be written in.
	public static void main(String[] args) {
		// Display a statement telling the user what the program will do when instructions are followed correctly. This is a bit redundant, however, as the statement will only show once user input is observed and the program is initiated. 
		System.out.println("This program takes three integer command line arguments (representing dimensions of a crate) and calculates both (a) volume and (b) surface. For this instance, we will assume that the dimensions and calculations will be reported in feet.");
		// Use an 'if' statement to determine whether or not the user has followed instructions. If the length of 'args' does NOT equal three (i.e., either more or less strings of input), tell the user to follow instructions.
		if (args.length != 3) {
			// Display a statement telling the user that improper usage of the program has been found and that they need to abide by the instructions.
			System.out.println("Improper usage. Please follow the following syntax to execute: 'java Program72 length width height'");
			// Terminate the program by calling the 'exit(1)' method of 'System.'
			System.exit(1);
		}
		// Declare five variables: Three that correspond to the dimensions of the crate (using the 'parseInt()' method of the 'Integer' class) and two that correspond to the calculations that will be performed in later lines. Assign to 'length,' 'width,' 'height,' 'volume,' and 'surfaceArea,' all of which are of type 'int.'  
		int length = Integer.parseInt(args[0]), width = Integer.parseInt(args[1]), height = Integer.parseInt(args[2]), volume, surfaceArea;
		// Report the length (first argument) to the user. 
		System.out.println("Length: " + length + " feet");
		// Report the width (second argument) to the user.
		System.out.println("Width: " + width + " feet");
		// Report the height (third argument) to the user.
		System.out.println("Height: " + height + " feet");
		// Display a statement telling the user that the calculations of the crate's dimensions will follow. 
		System.out.println("The calculations are as follows...");
		// OPTIONAL: Display a visual barrier between the dimensions and the results of the calculations for easier understanding. 
		System.out.println("----------------------------------");
		// Calculate the volume of the crate by multiplying 'length,' 'width,' and 'height' together. 
		volume = length * width * height;
		// Calculate the surface area of the crate by multiplying two times 'length' times 'width,' adding that result to two times 'length' times 'height,' and finally adding that result to two times 'width' times 'height.'
		surfaceArea = (2 * length * width) + (2 * length * height) + (2 * width * height);
		// Report the crate's volume to the user. 
		System.out.println("Volume: " + volume + " feet");
		// Report the crate's surface area to the user. 
		System.out.println("Surface Area: " + surfaceArea + " feet²");
	}

}
