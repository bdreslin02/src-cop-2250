package chap12extra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Except8 {

	public static void main(String[] args) {
		// compiler forces you to handle CHECKED exceptions
		// CHECKED are all EXCEPT sublasses of RuntimeException and Error
		
		File myFile = new File("java1.txt");
		
		// an UNHANDLED CHECKED exception is the issue 
		PrintWriter pw = new PrintWriter(myFile);
		
		pw.print("COP2250 rocks!\n");
		pw.print("So does COP2251");
		pw.close();

	}
}
