package nl.slooise.oefenen;

import java.util.Scanner;

public class IODemo {
	
	public static void main(String[] args) {

		
		int teller = 1;
		int primes = 0;
		
		boolean isPrime = true;
		
		while (primes < 10)
		{
			for (int i = 2; i < 1000; i++)
				if (teller % i != 0)
					if (teller == i)
						isPrime = false;
				
			if (isPrime = true)
			{
				System.out.println(teller);
				primes++;
			}
			teller++;
			
		}
		
	}
}
