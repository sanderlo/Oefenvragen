package nl.slooise.oefenen;

import java.util.Scanner;

public class Stringoefen2 {
	
	static int counter = 0;
	public static void main (String [] args){
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		while (!checkCorrect(input)){
			System.out.println("Verkeerde input!");
			input = s.nextLine();
		}
		
		System.out.println(input.substring(0, input.indexOf('.')));
		int index = 0;
		int nextIndex = 0;
		for (int i = 0; i < counter; i++){
			index = input.indexOf('.', index+1);
			nextIndex = input.indexOf('.', index+1);
			if (nextIndex > 0){
				String stuk = input.substring(index+1, nextIndex);
				System.out.println(stuk);
			}
			else {
				String stuk = input.substring(index+1);
				System.out.println(stuk);
			}
		}
	}
	
	public static boolean checkCorrect (String s){
		boolean checkCorrect = true;
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) < 46 || s.charAt(i) > 122 || (s.charAt(i) > 90 && s.charAt(i) < 97) || (s.charAt(i) > 57 && s.charAt(i) < 65)){
				checkCorrect = false;
			}
			
			if (s.charAt(i) == '.' || s.charAt(i) == '-'){
				if (i < s.length()-1){
					char x = s.charAt(i-1);
					char y = s.charAt(i+1);
					if (!(cijferOfLetter(x) && cijferOfLetter(y))){
						checkCorrect = false;
					}
				}
				else {
					checkCorrect = false;
				}
			}
			
			if (s.charAt(i) == '.'){
				counter++;
			}
		}		
		
		if (counter <2){
			checkCorrect = false;
		}
		
		int index = s.lastIndexOf('.');
		String end = s.substring(index + 1);
		if (!(end.equals("com") || end.equals("nl") || end.equals("org"))){
			checkCorrect = false;
		}
		return checkCorrect;
	}
	

	static boolean cijferOfLetter(char c){
		return (c > 64 && c < 91) || (c > 96 && c < 123) || (c > 48 && c < 58);
	}
}
