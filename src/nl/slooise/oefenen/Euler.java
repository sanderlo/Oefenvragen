package nl.slooise.oefenen;

public class Euler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isDeelbaar;
		boolean einde = false;
		
		for (int i = 1; einde == false; i++)
		{
			isDeelbaar = true;
			for (int j = 1; j < 21; j++)
			{
				if (i % j != 0){
					isDeelbaar = false;
				}
			}
			
			if (isDeelbaar){
				System.out.println(i);
				einde = true;
			}
		}
	
		
	}

}
