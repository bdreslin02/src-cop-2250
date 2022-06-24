// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapters 7 and 11 Assignment
package dreslin7and11;
// Create a new class.
public class Program71 {
	// Create a 'main' method for which the program will be written in.
	public static void main(String[] args) {
		// Create an array by declaring the array variable 'randomInteger' of type 'int' and, using the 'new' operator, assigning its size to twenty-four. 
		int[] randomIntegers = new int[24];
		// Use a 'for' loop to iterate over the array - this is used to create twenty-four random integers. To control execution, ensure that iteration 'i' remains less than the length of the array. 
		for (int i = 0; i < randomIntegers.length; i++) {
			// Create random integers between forty and sixty, inclusive. With each iteration of the loop, array 'randomIntegers[i]' will hold a random integer. 
			randomIntegers[i] = (int)(Math.random() * 21) + 40;
		}
		// Display a statement telling the user that the randomized array will follow. 
		System.out.println("Here is the random array...");
		// Invoke the 'displayArray' method for argument 'randomIntegers.' Report the mean (average) of the array to the user. Format the output to one significant figure by calling the 'printf()' method.
		System.out.printf("The mean of the array is %.1f", displayArray(randomIntegers));
	// End the 'main' method by using a right curly bracket.
	}
	// Create a 'displayArray' method (return value type 'double') to (a) print the array according to the program's requirements, (b) calculate the average of the array, and (c) returning the average to the 'main' method. 
	public static double displayArray(int[] randomIntegers) {
		// Initialize one counter to zero - this will control how many integers are printed per one line. Assign to variable 'line' of type 'int.'
		int line = 0;
		// Declare one accumulator and one variable - 'sum' and 'average', respectively (both of type 'double') - that will later be used to calculate and store the average of the array. 
		double sum = 0, average = 0; 
		// Use an enhanced 'for' loop ('foreach' loop) to iterate over the array, which will print and format the array elements in six columns, with each column being six characters wide.
		for (int n : randomIntegers) {
			// Accumulate the value of 'n' (each random integer) to 'sum.'
			sum += n;
			// Print the elements within the array in columns six characters wide by calling the 'printf()' method. 
			System.out.printf("%6d", n);
			line++;
			// Use an 'if' statement to determine whether or not a new line should be created. If 'line' is divisible by six (i.e., six integers on a single line is found to be true), a new line will be created, and the process repeats.
			if (line % 6 == 0) {
				// Create a new line every time the above statement is proven to be true. 
				System.out.println();
			}
		}
		// Calculate the array's average by dividing 'sum' by twenty-four - 'randomIntegers.length' could have been used instead.
		average = (sum / 24);
		// Return the average. This statement will be caught in the 'main' method, as observed in line 17. 
		return average;
	// End the 'displayArray' method by using a right curly bracket.
	}

}
