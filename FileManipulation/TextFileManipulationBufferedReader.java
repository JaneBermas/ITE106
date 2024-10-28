//Java program to illustrate reading file from fileReader
// using bufferReader file
// importing input output classes
import java.io.*;
//main class
public class GFG {

	public static void main(String[] args) throws Exception
	{
		File file = new File("C:\\Users\\ppankaj\\Desktop\\test.txt");
		BufferReader br = new bufferReader(new FileReader(file));
		String st;
		
		while ((st = br.readline()) != null)
			System.out.println(st);
	}
}
