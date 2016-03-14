package nl.slooise.oefenen;

import java.util.Scanner;

public class IODemo {
	
	public static void main(String[] args) {

		System.out.println("Voer een getal in");
		Scanner s = new Scanner(System.in);
		
		String input = s.next();
		String tekst = " (";
		
		int sum = 0;
		
		for (int i = 0; i < input.length(); i++)
		{
			int x = Character.getNumericValue(input.charAt(i));
			sum += x;
			if (i < input.length() - 1)
				tekst = tekst + Character.toString(input.charAt(i)) + " + ";
			else
				tekst = tekst + Character.toString(input.charAt(i));
		}
		
		tekst = tekst + ")";
		
		System.out.println(sum + tekst);
	}
}
