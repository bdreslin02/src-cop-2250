// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapters 7 and 11 Assignment
package dreslin7and11;
// Import the ArrayList class from the Java Utilities package.
import java.util.ArrayList;
// Create a new class.
public class Program73 {
	// Create a 'main' method for which the program will be written in.
	public static void main(String[] args) {
		// Create an array by declaring the array variable 'randomTemperatures' of type 'int' and, using the 'new' operator, assigning its size to fourteen.
		int[] randomTemperatures = new int[14];
		// Use a 'for' loop to iterate over the array - this is used to create fourteen random integers (temperatures). To control execution, ensure that iteration 'i' remains less than the length of the array.
		for (int i = 0; i < randomTemperatures.length; i++) {
			// Create random temperatures between ten degrees Fahrenheit and fifty degrees Fahrenheit, inclusive. With each iteration of the loop, array 'randomTemperatures[i]' will hold a random integer. 
			randomTemperatures[i] = (int)(Math.random() * 41) + 10;
		}
		// Invoke the 'getBelowFreezing' method for argument 'randomTemperatures' by catching it in an ArrayList named 'belowFreezing' of wrapper class 'Integer.'
		ArrayList<Integer> belowFreezing = getBelowFreezing(randomTemperatures);
		// Use an enhanced 'for' loop ('foreach' loop) to iterate over the array, which will print the temperatures that were below freezing on one line separated by a single space. 
		for (int t : belowFreezing) {
			// Display these temperatures on one line separated by a single space. 
			System.out.print(t + " ");
		}
	// End the 'main' method by using a right curly bracket.
	}
	// Create a 'getBelowFreezing' method (return value type 'ArrayList<Integer>') to (a) print the temperatures within the last two weeks and (b) create an ArrayList of the temperatures that were observed to be below freezing (32 degrees Fahrenheit). 
	public static ArrayList<Integer> getBelowFreezing(int[] randomTemperatures) {
		// Initialize one counter to zero - this will determine and report how many of the temperatures were observed to be below freezing. Assign to variable 'numOfTemps' of type 'int.'
		int numOfTemps = 0; 
		// Display a statement telling the user that the temperatures for the last two weeks will follow. 
		System.out.println("Temperatures in the last 2 weeks...");
		// Use an enhanced 'for' loop ('foreach' loop) to iterate over the array, which will print all of the temperatures within the last two weeks on one line separated by a single space.
		for (int t : randomTemperatures) {
			// Display all of the temperatures on one line separated by a single space. 
			System.out.print(t + " ");
		}
		
		System.out.println();
		// Create an ArrayList by declaring the variable 'belowFreezing' of wrapper class 'Integer,' and using the 'new' operator to initialize it. 
		ArrayList<Integer> belowFreezing = new ArrayList<Integer>();
		// Use an enhanced 'for' loop ('foreach' loop) to iterate over the array, which will add temperatures to the new ArrayList if they are below freezing. 
		for (int i : randomTemperatures) {
			// Use an 'if' statement to determine whether or not a temperature is added to 'belowFreezing.'
			if (i < 32) {
				// If the above statement is proven to be true, add one on to the 'numOfTemps' counter.
				numOfTemps++;
				// Add the temperature to the ArrayList by calling the 'add()' method  for 'belowFreezing.'
				belowFreezing.add(i);
			}
		}	
		// Display a statement telling the user the number of temperatures within the past two weeks were observed to be below freezing. 
		System.out.println("These " + numOfTemps + " were below freezing...");
		// Return 'belowFreezing.' This statement will be caught in the 'main' method, as observed in line 17. 
		return belowFreezing; 
	// End the 'getBelowFreezing' method by using a right curly bracket.
	}
	
}


