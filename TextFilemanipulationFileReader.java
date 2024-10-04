//Java program to illustrate reading file from fileReader
// FileReader using FileReader class
//importing input output classes
import java.io.*;
//main class
//reading from file
public class GFG {

	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("C:\\Users\\pankaj\\Desktop\\test.txt");
		int i;
		
		while ((i = fr.read()) != -1)
			System.out.print((char)i);
	}
}
