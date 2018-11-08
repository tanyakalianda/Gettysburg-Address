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
			file.nextLine();
		}
		
//		int i = 0;
//		String longestWord = "";
//		while (i < speech.size())
//		{
//			String word1 = speech.get(i);
//			int compare = word1.compareTo(longestWord);
//			if (compare > 0)
//			{
//				longestWord = word1;
//			}
//			i++;
//		}
//		System.out.println("Longest word: " + longestWord);
		
		String longestWord = speech.get(0);
		for (int i = 1; i < speech.size(); i ++)
		{
			int compare = speech.get(i).compareTo(longestWord);
			if (compare > 0)
			{
				longestWord = speech.get(i);
			}
		}
		System.out.println("Longest word: " + longestWord);
		
		
		double total = 0;
		for (String word: speech)
		{
			total = total + word.length();
		}
		
		
		double average = total / speech.size();
		
		System.out.println("Average word length: " + average);
		
	}

}
