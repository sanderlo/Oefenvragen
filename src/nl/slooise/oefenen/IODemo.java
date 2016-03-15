package nl.slooise.oefenen;

import java.util.Scanner;

public class IODemo {
	
	public static void main(String[] args) {

		int getallen [] = new int[10];
		int getal = 0;
		boolean vol = false;
		
		Scanner s = new Scanner (System.in);
		
		while (vol == false)
		{
			boolean origineel = true;
			
			System.out.println("Voer een origineel getal in:");
			int invoer = Integer.valueOf(s.next());
			for (int i = 0; i < getallen.length; i++)
				if (invoer == getallen[i])
					origineel = false;
			
			if (origineel == true)
			{
				getallen[getal] = invoer;
				getal++;
			}	
			else
				System.out.println("Deze heb je al!");
			
			if (getal == 10)
				vol = true;
		}
		
		for (int i = 0; i < getallen.length; i++)
			System.out.println(getallen[i]);
	}
}
