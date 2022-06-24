// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 6 Assignment

/* Program Rationale: In this program, we pretend that we are an employer for a very small (but expanding) software development firm. 
 * The company's employees are paid bi-weekly, though we will only be examining the pay for the second week. There are currently only three employees 
 * (for simplicity, we will assume that all employee's details have already been entered in the company database). This program utilizes method overloading 
 * to calculate all employees' regular pay and overtime pay (if applicable). All variables in the main method have been assigned (alphabetically) by letter, 
 * in order to avoid confusion in distinguishing between variable names such as 'employee1,' 'employee2,' 'hourlyPayRate1,' 'hourlyPayRate2,' etc. 
 * (which are the variable names that I used first, only to discover that it was confusing). In regards to overloading, one will observe that there are a total of three
 * different 'employeePay()' methods, all of which differ in either (a) return value type or (b) parameter lists (or both) - which is the definition of a method overload. 
 * Each overloaded method corresponds to one employee (i.e., Employee 1 (Tom) corresponds to the first method, and so on), so as to demonstrate that overloading is not confined to two methods. 
 * I believe that this program shows the application of this concept and its practicality in real world situations.
 */
package dreslin6;
// Create a new class.
public class Program64 {
	// Create a 'main' method for which the program will be written in.
	public static void main(String[] args) {
		// Create the name and rank of the first employee. Assign to variables 'a' and 'b', both of type 'String.'
		String a = "Tom", b = "Lead Developer";
		// Establish the hourly pay rate and overtime pay rate of the employee. Assign to variables 'c' and 'd,' both of type 'double.'
		double c = 33.80, d = 1.5;
		// Establish the number of hours worked during the week. Assign to variable 'e' of type 'int.'
		int e  = 47; 
		// Create the name and rank of the second employee. Assign to variables 'f' and 'g,' both of type 'String.'
		String f = "Chad", g = "Junior Web Developer";
		// Establish the hourly pay rate of the employee. Assign to variable 'h' of type 'double.'
		double h = 22.50;
		// Establish the number of hours worked during the week. Assign to variable 'i' of type 'int.'
		int i = 40;
		// Create the name, rank, and associated comments of the employee. Assign to variables 'j,' 'k,' and 'l,' all of type 'String.'
		String j = "Andrew", k = "Intern: Part time", l = "< 25 hours per week"; 
		// Establish the hourly pay rate of the employee. Assign to variable 'm' of type 'double.'
		double m = 12.50;
		// Establish the number of hours worked during the week. Assign to variable 'n' of type 'int.'
		int n = 20;
		// Display a statement telling the user that their employees' total pay for the week will follow. 
		System.out.println("Your employees' total pay for the week are as follows:");
		// Invoke the 'employee()' method for arguments 'a,' 'b,' 'c,' 'd,' and 'e' - this will output the results for employee 1 (Tom). 
		employeePay(a, b, c, d, e);
		// OPTIONAL: Display a visual barrier for a clear indication of separation between the first and second employee. 
		System.out.println("\n==============================");
		// Report the second employee's name and rank to the user. Format the output according to string formatting by calling the 'printf()' method. 
		System.out.printf("Employee 2: %s - %s", f, g);
		// Report the second employee's (Chad's) total weekly pay by invoking the 'employeePay()' method for arguments 'f,' 'g,' 'h,' and 'i.' Format the output according to currency format by calling the 'printf()' method. 
		System.out.printf("\n    Total weekly pay: $%.2f", employeePay(f, g, h, i));
		// OPTIONAL: Display a visual barrier for a clear indication of separation between the first and second employee.
		System.out.println("\n==============================");
		// Invoke the 'employee()' method for arguments 'j,' 'k,' 'l,' 'm,' and 'n' - this will output the results for employee 3 (Andrew). 
		employeePay(j, k, l, m, n); 
	// End the 'main' method by using a right curly bracket.
	}
	// Create an 'employeePay' method (return value type 'void') to calculate the regular pay, overtime pay, and total weekly pay of the employee - this is the first method overload. 
	public static void employeePay(String employee, String rank, double hourlyPayRate, double overtimePayRate, int hoursWorked) {
		// Calculate the regular pay by multiplying 'hourlyPayRate' and forty together. 
		double regularPay = (hourlyPayRate * 40);
		// Calculate the overtime pay by multiplying 'hourlyPayRate' and 'overtimePayRate' together, and then multiplying the result to 'hoursWorked' minus forty (i.e., the number of overtime hours worked). 
		double overtimePay = (hourlyPayRate * overtimePayRate) * (hoursWorked - 40);
		// Calculate the total weekly pay by adding 'regularPay' and 'overtimePay' together. 
		double totalWeeklyPay = (regularPay + overtimePay); 
		// Report the employee's name and rank to the user. Format the output according to string formatting by calling the 'printf()' method.
		System.out.printf("Employee 1: %s - %s", employee, rank);
		// Report the employee's hourly pay rate to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Hourly pay rate: $%.2f", hourlyPayRate);
		// Report the employee's number of hours worked for the week to the user. Format the output according to integer formatting by calling the 'printf()' method.
		System.out.printf("\n    Hours worked: %d", hoursWorked);
		// Report the employee's regular pay to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Regular pay: $%.2f", regularPay);
		// Report the employee's overtime pay to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Overtime Pay: $%.2f", overtimePay);
		// Report the employee's total weekly pay to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Total weekly pay: $%.2f", totalWeeklyPay);
	// End the 'employeePay' method by using a right curly bracket.
	}
	// Create a second 'employeePay' method (return value type 'double') to calculate the regular pay of the employee - this is the second method overload.
	public static double employeePay(String employee, String rank, double hourlyPayRate, int hoursWorked) {
		// Calculate the regular pay by multiplying 'hourlyPayRate' and 'hoursWorked' together. 
		double regularPay = (hourlyPayRate * hoursWorked);
		// Report the employee's hourly pay rate to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Hourly pay rate: $%.2f", hourlyPayRate);
		// Report the employee's number of hours worked for the week to the user. Format the output according to integer formatting by calling the 'printf()' method.
		System.out.printf("\n    Hours worked: %d", hoursWorked);
		// Report the employee's regular pay to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Regular pay: $%.2f", regularPay);
		// Return 'regularPay.' This statement will be caught in the 'main' method, as observed in line 34.
		return regularPay; 
	// End the 'employeePay' method by using a right curly bracket.
	}
	// Create a third 'employeePay' method (return value type 'void') to calculate the regular pay of the employee - this is the third method overload. 
	public static void employeePay(String employee, String rank, String comments, double hourlyPayRate, int hoursWorked) {
		// Calculate the regular pay by multiplying 'hourlyPayRate' and 'hoursWorked' together.
		double regularPay = (hourlyPayRate * hoursWorked); 
		// Since there is no added bonuses or additional pay for the employee, 'regularPay' is essentially the total weekly pay. However, to avoid confusion, I have decided to assign 'regularPay' to a new variable ('totalWeeklyPay'), so that printing outputs is easier. 
		double totalWeeklyPay = regularPay; 
		// Report the employee's name and rank to the user. Format the output according to string formatting by calling the 'printf()' method.
		System.out.printf("Employee 3: %s - %s; %s", employee, rank, comments);
		// Report the employee's hourly pay rate to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Hourly pay rate: $%.2f", hourlyPayRate);
		// Report the employee's number of hours worked for the week to the user. Format the output according to integer formatting by calling the 'printf()' method.
		System.out.printf("\n    Hours worked: %d", hoursWorked);
		// Report the employee's regular pay to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Regular pay: $%.2f", regularPay);
		// Report the employee's total weekly pay to the user. Format the output according to currency format by calling the 'printf()' method.
		System.out.printf("\n    Total weekly pay: $%.2f", totalWeeklyPay);
	// End the 'employeePay' method by using a right curly bracket.
	}

}
