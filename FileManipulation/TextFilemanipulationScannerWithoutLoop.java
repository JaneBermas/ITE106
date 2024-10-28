//Java program to illustrate reading file from fileReader
// using Scanner classs reading entire file
// without using loop
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingEntireFileWithoutLoop
{
	public static void main(String[] args) 
		throws FileNotFoundException
	{
		File file = new File("C:\\Users\\ppankaj\\Desktop\\test.txt");
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
		
		System.out.println(sc.next());
	}
}
