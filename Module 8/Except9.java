package chap12extra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Except9 {

	public static void main(String[] args) {
		// compiler forces you to handle CHECKED exceptions
		// CHECKED are all EXCEPT sublasses of RuntimeException and Error
		
		File myFile = new File("java1.txt");
		PrintWriter pw = null;
		
		// an UNHANDLED CHECKED exception is the issue
		try {
			pw = new PrintWriter(myFile);
			pw.print("COP2250 rocks!\n");
			pw.print("So does COP2251\n");
			pw.print("Java is huge");
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			pw.close();
			System.out.println("File was created");
		}
	}
}
