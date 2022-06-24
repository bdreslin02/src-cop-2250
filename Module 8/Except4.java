package chap12extra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except4 {
	
	public static void divide(int n1, int n2) {
		int quot = n1 / n2;
		System.out.println("The quotient is " + quot);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter two integers separated by a space ");
			int numer = input.nextInt();
			int denom = input.nextInt();
			divide(numer,denom); // might throw an Exception
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " is not permitted");
		}
		// NOTE: catch subclasses BEFORE superclasses
		catch(Exception ex) {
			System.out.println("Bad input. Enter two ints");
		}
		finally {
			input.close();  // good place for this
		}
	}
}
