// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapters 7 and 11 Assignment
package dreslin7and11;
// Import the ArrayList class from the Java Utilities package.
import java.util.ArrayList;
// Import the Arrays class from the Java Utilities package. 
import java.util.Arrays;
// Import the Scanner class from the Java Utilities package.
import java.util.Scanner;
// Create a new class.
public class Program74 {
	// Create a 'main' method for which the program will be written in.
	public static void main(String[] args) {
		// Create an array by declaring the array variable 'names' of type 'int' and, using the 'new' operator, assigning its size to six.
		String[] names = new String[6];
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in); 
		// Prompt the user to enter six first names.
		System.out.print("Enter six first names: ");
		// Use a 'for' loop to iterate over and initialize the array with the user's input.
		for (int i = 0; i < names.length; i++) {
			// Add the first names to the array for iteration 'i' by calling the 'next()' method for reading the user's input. 
			names[i] = input.next();
		}
		// Use an enhanced 'for' loop ('foreach' loop) to iterate over the array, which will print the first names on one line separated by a single space.
		for (String n : names) {
			// Display all of the first names on one line separated by a single space. 
			System.out.print(n + " ");
		}
		// To prevent a resource leak, call the 'close()' method for the Scanner object. 
		input.close();
		// Invoke the 'modifyArray' method for argument 'names.'
		modifyArray(names);
	// End the 'main' method by using a right curly bracket.
	}
	// Create a 'modifyArray' method (return value type 'void') to (a) sort and display the array, (b) create and initialize a new ArrayList to hold all of the names, (c) insert another name at the start of the ArrayList, (d) remove the name at the end of the ArrayList, and (e) display the the ArrayList. 
	public static void modifyArray(String[] names) {
		// Sort the 'names' array (alphabetically) by calling the 'sort()' method of the static 'Arrays' class.
		Arrays.sort(names); 
		// Display a statement telling the user that the sorted array of names will follow. 
		System.out.println("\nSorted array of names...");
		// // Use an enhanced 'for' loop ('foreach' loop) to iterate over the array, which will print the sorted array of first names on one line separated by a single space.
		for (String n : names) {
			// Display the sorted first names on one line separated by a single space. 
			System.out.print(n + " ");
		}
		// Create an ArrayList by declaring the variable 'friends' of class 'String,' and using the 'new' operator to initialize it -  we could have also used the 'asList()' method of the 'Arrays' class to save an extra step (using a loop to add and display the names). 
		ArrayList<String> friends = new ArrayList<String>();
		// Use an enhanced 'for' loop ('foreach' loop) to iterate over the array, which will add each first name to the ArrayList 'friends.'
		for (String i : names) {
			// Add the first name to the ArrayList by calling the 'add()' method  for 'friends.'
			friends.add(i); 
		}
		// Insert another name at the start of the ArrayList by calling the 'add(index, "String")' method for 'friends.'
		friends.add(0, "Tom");
		// Remove the name at the end of the ArrayList by calling the 'remove(index)' method for 'friends.'
		friends.remove(6); 
		// Display a statement telling the user that the final list of names will follow. 
		System.out.println("\nFinal list of names...");
		// Use an enhanced 'for' loop ('foreach' loop) to iterate over the ArrayList, which will print the first names on one line separated by a single space.
		for (String n : friends) {
			// Display all of the first names on one line separated by a single space. 
			System.out.print(n + " ");
		}
	// End the 'modifyArray' method by using a right curly bracket.
	}

}
