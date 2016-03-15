package nl.slooise.oefenen;

public class Oefenen
{
	public static void main (String [] args)
	{
	int [] scores = {15, 22, 12, 22, 83, 85, 76, 89, 88, 90, 99, 44, 23, 34, 56, 69};
	int aantal = 0;
	for (int i = 0; i < scores.length ; i++)
		if (scores[i] >= 80 && scores[i] < 90)
			aantal++;

	System.out.println("Het aantal voldoendes is " + aantal);
	}
}