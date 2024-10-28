//Java program to illustrate
// reading reading from text file
// using scanner class
import java.io.File;
import java.util.Scanner;
public class ReadFromFileUsingScanner
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("C:\\Users\\ppankaj\\Desktop\\test.txt");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}
}
