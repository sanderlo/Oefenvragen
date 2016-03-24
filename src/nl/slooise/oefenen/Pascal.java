package nl.slooise.oefenen;

public class Pascal {

	static int [][] driehoek = new int [10][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++){
			int [] new_row;
			
			if (i == 0){
				new_row = new int[]{1};
			}
			else {
				new_row = new int[i+1];
				for (int j = 0; j < new_row.length; j++){
					if (j == 0){
						new_row[j] = driehoek[i-1][j];
					}
					else if (j == new_row.length -1){
						new_row[j] = driehoek[i-1][j-1];
					}
					else{
						new_row[j] = driehoek[i-1][j-1] + driehoek [i-1][j];
					}
				}
			}
			driehoek[i] = new_row;
		}
		
		print();
	}
	

	public static void print(){
		for (int i = 0; i < driehoek.length; i++){
			System.out.println();
			for (int j = 0; j < driehoek[i].length; j++)
				System.out.print(driehoek[i][j] + " ");
		}
	}
}
