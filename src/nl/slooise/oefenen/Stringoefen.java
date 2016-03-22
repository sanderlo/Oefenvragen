package nl.slooise.oefenen;

import java.util.Scanner;

public class Stringoefen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		String input = s.nextLine();
		System.out.println(omzetten(input));
	}
	
	public static String omzetten (String input){
		String nieuw = "";
		for (int i = 0; i < input.length(); i++){
			int x = input.charAt(i);
			if (input.charAt(i) < 91 && input.charAt(i) > 64)
			{
				if (input.charAt(i) < 78)	{		
					x = input.charAt(i) + 13;
				}
				else {
					x = input.charAt(i) - 13;
				}
			}
			else if (input.charAt(i) < 123 && input.charAt(i) > 96)
			{
				if (input.charAt(i) < 110)	{		
					x = input.charAt(i) + 13;
				}
				else {
					x = input.charAt(i) - 13;
				}
			}

			char y = (char)x;
			nieuw += Character.toString(y);
		}
		
		return nieuw;
	}

}
