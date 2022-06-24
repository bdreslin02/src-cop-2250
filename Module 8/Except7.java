package chap12extra;

import java.util.Scanner;

public class Except7 {

	public static void main(String[] args) {
		// compiler does not warn about UNCHECKED exceptions
		// UNCHECKED are sublasses of RuntimeException and Error
		
		String str = null;
		// run then comment out next line and run again
		System.out.print(str.length());

		try {
			System.out.print(str.length());
		} 
		catch (Exception e) {
			System.out.println("String was declared but not assigned");
		}

	}
}
