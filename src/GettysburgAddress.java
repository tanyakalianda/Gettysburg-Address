/**
 * 
 * @author Tanya Kalianda
 * Gettysburg Address 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburgAddress 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file = new Scanner (new File("GettysburgAddress.txt"));
		
		ArrayList<String> speech = new ArrayList<String>();
		
		while (file.hasNext())
		{
			speech.add(file.next());
		}
		
		String longestWord = speech.get(0);
		for (String element: speech)
		{
			
			if (element.length() > longestWord.length())
			{
				longestWord = element;
			}
		}
		System.out.println("Longest word: " + longestWord);
		
		int total = 0;
		for (String element: speech)
		{
			total = total + element.length();
		}
		
		double average = total / speech.size();
		
		System.out.println("Average word length: " + average);
		
	}

}
