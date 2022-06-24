package chap12extra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except6 {
	// using value-returning method and a do...while loop
	// now adding a throw statement for denom of zero
	// NOTE: argument for ctor is "message" returned by getMessage() 
	public static int divide(int n1, int n2) {
		if(n2 == 0) {
			throw new ArithmeticException("Division by zero");
		}
		return n1 / n2;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean keepOn = true; // used to continue loop

		do {
			try {
				System.out.print("Enter two integers separated by a space ");
				int numer = input.nextInt();
				int denom = input.nextInt();
				int quot = divide(numer, denom); // might throw an Exception
				System.out.println("The quotient is " + quot);
				
				keepOn = false;  // to stop loop when no exception is thrown	
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage() + " is not permitted");
				input.nextLine();
			}
			// NOTE: catch subclasses BEFORE superclasses
			catch (Exception ex) {
				System.out.println("Bad input. Enter two ints");
				input.nextLine();
			}
			
		} while (keepOn);
	}
}
