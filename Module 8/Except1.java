package chap12extra;

import java.util.Scanner;

public class Except1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int num = 0;
		try {
			System.out.print("Enter an integer ");
			// try a small int
			// try again with 12345678900 to see the effect
			num = input.nextInt();
		}
		catch(Exception e) {
			System.out.println("Input too big for type int");
		}
		System.out.println("Variable num is " + num);
	}
}
