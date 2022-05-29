// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 4 Assignment

package dreslin4;
// Create a new class.
public class Program3 {
	// Create a 'main' method for which the program will be written in. 
	public static void main(String[] args) {
		// Assign the given name to variable 'name' and use type 'String.'
		String name = "Keisha"; 
		// Assign the given age to variable 'age' and use type 'int.'
		int age = 23; 
		// Assign the given hourly pay rate to constant 'HOURLY_PAY_RATE' and use type 'double' - this could have also been assigned to a variable of type 'double.'
		final double HOURLY_PAY_RATE = 32.50; 
		// Assign the given office to variable 'office' and use type 'char,' since it is only one character (letter). 
		char office = 'C'; 
		// Assign the given number of hours worked in a given week to variable 'hoursWorked' and use type 'int.'
		int hoursWorked =  40; 
		// Calculate the salary for the week by multiplying the hourly pay rate by the number of hours worked. Assign to variable 'weekSalary.' 
		double weekSalary = HOURLY_PAY_RATE * hoursWorked; 
		// Display the employee's name and her age to the user by using a 'printf()' statement. Use %s for string 'name' and %d for int 'age.' Include '\n' to cause a new line for the next output. 
		System.out.printf("%s is %d years old.\n", name, age);
		// Display the employee's office location by using a 'printf()' statement. Use %c for character 'office.' Include '\n' to cause a new line for the next output. 
		System.out.printf("She is in office %c.\n", office);
		// Display the employee's salary for the week by using a 'printf()' statement. Use $%,.2f to format both the hourly pay rate and salary for the week in currency format. Include '\n' to cause a new line for the next output. 
		System.out.printf("Because %s earns $%.2f per hour, in a 40-hour week, her pay is $%,.2f\n", name, HOURLY_PAY_RATE , weekSalary);

	}

}
