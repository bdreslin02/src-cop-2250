package chap12extra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int num = 0;
		try {
			System.out.print("Enter an integer ");
			// try a small int
			// try text characters or a number with decimals to see the effect
			num = input.nextInt();
		}
		catch(InputMismatchException ex) {
			System.out.println("Bad input. Enter an int");
		}
		finally {
			input.close();  // good place for this
		}
		System.out.println("Variable num is " + num);
	}
}
