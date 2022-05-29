// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 3 Assignment

package dreslin3;
// Import the Scanner class from the Java Utilities package. 
import java.util.Scanner;
// Create a new class.
public class Program4 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Create a new Scanner object.
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the day number of the week.
		System.out.print("Please enter the day number of the week: ");
		// Use type 'int' and call the 'nextInt()' method for reading the user's input. Assign to variable 'dayOfTheWeek.'
		int dayOfTheWeek = input.nextInt();
		// Use a switch for the 'dayOfTheWeek.'
		switch (dayOfTheWeek) {
		// If the user inputs a value of '0,' it is assigned to 'case 0.'
		case 0:
			// Display a statement to the user telling them that, because they entered 0 as the day number of the week, the day of the week is Sunday.
			System.out.println("It is Sunday.");
			// Use a 'break' statement to immediately end the switch statement - this ensures that 'fall-through behavior' does not exist - thus, only one output will be displayed at a time.
			break;
		// If the user inputs a value of '1,' it is assigned to 'case 1.'
		case 1: 
			// Display a statement to the user telling them that, because they entered 1 as the day number of the week, the day of the week is Monday.
			System.out.println("It is Monday.");
			// Use a 'break' statement to immediately end the switch statement.
			break; 
		// If the user inputs a value of '2,' it is assigned to 'case 2.'
		case 2:
			// Display a statement to the user telling them that, because they entered 2 as the day number of the week, the day of the week is Tuesday.
			System.out.println("It is Tuesday.");
			// Use a 'break' statement to immediately end the switch statement.
			break; 
		// If the user inputs a value of '3,' it is assigned to 'case 3.'
		case 3: 
			// Display a statement to the user telling them that, because they entered 3 as the day number of the week, the day of the week is Wednesday.
			System.out.println("It is Wednesday.");
			// Use a 'break' statement to immediately end the switch statement.
			break; 
		// If the user inputs a value of '4,' it is assigned to 'case 4.'
		case 4: 
			// Display a statement to the user telling them that, because they entered 4 as the day number of the week, the day of the week is Thursday.
			System.out.println("It is Thursday."); 
			// Use a 'break' statement to immediately end the switch statement.
			break; 
		// If the user inputs a value of '5,' it is assigned to 'case 5.'
		case 5: 
			// Display a statement to the user telling them that, because they entered 5 as the day number of the week, the day of the week is Friday.
			System.out.println("It is Friday.");
			// Use a 'break' statement to immediately end the switch statement.
			break; 
		// If the user inputs a value of '6,' it is assigned to 'case 6.'
		case 6: 
			// Display a statement to the user telling them that, because they entered 6 as the day number of the week, the day of the week is Saturday.
			System.out.println("It is Saturday.");
			// Use a 'break' statement to immediately end the switch statement.
			break;
		// Use the 'default' case to catch all bad input.
		default: 
			// Display a statement telling the user to follow the directions and enter the day number of the week from 0-6, with 0 being Sunday.
			System.out.println("Please follow directions: Enter the day number of the week.");
		}

	}

}
