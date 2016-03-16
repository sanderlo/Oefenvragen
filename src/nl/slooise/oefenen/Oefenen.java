package nl.slooise.oefenen;

public class Oefenen
{
	public static void main (String [] args)
	{
	
	int border = 2_000_000;
	int teller = 1;
	int sum = 0;
	
	boolean isPrime = true;
	
	while (teller < border)
	{
		for (int i = 2; i < teller; i++)
			if (teller % i == 0)
				if (teller != i)
					isPrime = false;
	
		if (isPrime == true)
		{
			sum += teller;
			System.out.println(teller);
		}
		teller++;
		isPrime = true;		
	}
	System.out.println(sum);
	}
}