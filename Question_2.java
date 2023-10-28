package assigment;

import java.util.*;

public class Question_2 {
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please Provide single character fron the alphabte");
			String letter = scan.next();
			
			if (scan.hasNext())
			{
				letter = letter.toLowerCase();
				if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
				{
					System.out.println("vowel");
				}
				else if (letter.length()> 1)
				{
					System.out.println("Error");
				}
				else
				{
					System.out.println("consonant");
				}
				
			}
			else 
			{
				System.out.println("Error");
			}
		}
		
	}

}
