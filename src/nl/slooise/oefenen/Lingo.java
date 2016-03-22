package nl.slooise.oefenen;

import java.util.Random;
import java.util.Scanner;

public class Lingo {

	static String [] woorden = {"woord", "fiets", "lingo", "staan", "drank", "beker", "strak", "grond", "plots", "groen", "steen"};
	static Scanner s;
	static Random r;
	static String geheim, input, feedback;
	static boolean guessed;
	static boolean [] letters = new boolean[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		r = new Random();
		geheim = woorden[r.nextInt(woorden.length)];
		
		guessed = false;
		
		while (guessed == false){
			getInput();
			getFeedback();
		}
		System.out.println("Goed zo! Het woord is inderdaad " + geheim);
	}
	
	public static void getInput(){
		input = s.nextLine();
		while (input.length() != 5){
			System.out.println("Ongeldige invoer!");
			input = s.nextLine();
		}
	}
	
	public static void getFeedback(){
		guessed = true;
		feedback = "";
		for (int i = 0; i < 5; i++){
			if (geheim.charAt(i) == input.charAt(i)){
				feedback += "x";
				letters[i] = true;
			}
			else if (isEr(i)){
				feedback += "o";
			}
			else {
				feedback += ".";
				guessed = false;
			}
		}
		System.out.println(feedback);
	}
	
	public static boolean isEr (int pos){
		boolean bool = false;
		for (int i = 0; i < 5; i++){
			if (i != pos){
				if (!letters[i]){
					if (input.charAt(i) == geheim.charAt(pos))
							bool = true;
				}
			}
		}
		return bool;
	}
}
