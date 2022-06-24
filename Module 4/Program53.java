// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 5 Assignment

package dreslin5;
// Create a new class.
public class Program53 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a header for the first column of the table, which are numbers between five and one hundred in increments of five. Assign to variable 'headingOne' of type 'String.'
		String headingOne = "NUMBER"; 
		// Create a header for the second column of the table, which are the square roots of the aforementioned numbers. Assign to variable 'headingTwo' of type 'String.'
		String headingTwo = "SQ.ROOT"; 
		// Create a header for the third column of the table, which are the cube roots of the aforementioned numbers. Assign to variable 'headingThree' of type 'String.'
		String headingThree = "CU.ROOT"; 
		// Display a visual divider between the first header and the column itself for easier understanding. Assign to variable 'dividerOne' of type 'String.'
		String dividerOne = "------";
		// Display a visual divider between the second header and the column itself for easier understanding. Assign to variable 'dividerTwo' of type 'String.'
		String dividerTwo = "-------";
		// Display a visual divider between the third header and the column itself for easier understanding. Assign to variable 'dividerThree' of type 'String.'
		String dividerThree = "-------";
		// Display 'headingOne' in a formatted string ten characters wide by calling the 'printf()' method. 
		System.out.printf("%10s", headingOne);
		// Display 'headingTwo' in a formatted string ten characters wide by calling the 'printf()' method. 
		System.out.printf("%10s", headingTwo);
		// Display 'headingThree' in a formatted string ten characters wide by calling the 'printf()' method. 
		System.out.printf("%10s", headingThree);
		// Display a space between the headings and the dividers so that the outputs are not together on the same line. 
		System.out.println();
		// Display 'dividerOne' in a formatted string ten characters wide by calling the 'printf()' method. 
		System.out.printf("%10s", dividerOne);
		// Display 'dividerTwo' in a formatted string ten characters wide by calling the 'printf()' method. 
		System.out.printf("%10s", dividerTwo);
		// Display 'dividerThree' in a formatted string ten characters wide by calling the 'printf()' method. 
		System.out.printf("%10s", dividerThree);
		// Display a space between the dividers and the columns of numbers so that the first row is not accidentally misaligned. 
		System.out.println();
		// Initialize two variables ('squreRoot' and 'cubeRoot') of type 'double' that will later be called to store the square root and cube root of the numbers, respectively. 
		double squareRoot = 0, cubeRoot = 0; 
		// Use a 'for' loop to determine whether or not the loop body executes. For 'i' of type 'double,' where 'i' is less than or equal to one hundred, increment 'i' by five for each iteration of the loop. 
		for (double i = 5; i <= 100; i += 5) {
			// Calculate the square root of 'i' by calling the 'sqrt()' method of the 'Math' class. Assign to variable 'x.'
			squareRoot = Math.sqrt(i); 
			// Calculate the cube root of 'i' by calling the 'cbrt()' method of the 'Math' class. Assign to variable 'y.'
			cubeRoot = Math.cbrt(i); 
			// Report the values of 'i' (to one significant figure) to the user in a column ten characters wide. 
			System.out.printf("%10.1f", i);
			// Report the values of 'sqaureRoot' (to three significant figures) to the user in a column ten characters wide. 
			System.out.printf("%10.3f", squareRoot);
			// Report the values of 'cubeRoot' (to three significant figures) to the user in a column ten characters wide. 
			System.out.printf("%10.3f", cubeRoot);
			// Print a space between each value so that the columns remain - if the space were not included, the values would be spread out across a row, and not in columns.
			System.out.println();
		}
	}

}
