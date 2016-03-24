package nl.slooise.adventure;

import java.util.Scanner;

public class Adventure {

	private static GameWorld gw;
	private static Player player;
	private static Scanner s;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gw = new GameWorld();
		player = new Player(1,1);
		s = new Scanner(System.in);

		gameLoop();
	}
	
	public static void gameLoop(){
		showSquare(); 
		getInput();
	}
	
	public static void showSquare(){
		System.out.println(gw.getSquare(player.getX(), player.getY()).getDescription());
	}
	
	public static void getInput(){
		System.out.println("Wat wil je doen? Je kunt in de richtingen " + opties());
		String input = s.next();
		walk(input);
	}
	
	public static String opties(){
		String o = "";
		if (player.getY() != 0) { o += "noord ";}
		if (player.getY() != gw.getWorldH()-1) { o += "zuid ";}
		if (player.getX() != 0) { o += "west ";}
		if (player.getX() != gw.getWorldB()-1) { o += "oost ";}		
		return o;
	}

	public static void walk(String input){
		
		switch (input) {
		case "noorden":
		case "noord":
		case "N":
		case "n":	walkN();
					break;
		case "zuiden":
		case "zuid":
		case "Z":
		case "z":	walkS();
					break;
		case "westen":
		case "west":
		case "W":
		case "w":	walkW();
					break;
		case "oosten":
		case "oost":
		case "O":
		case "o":	walkE();
					break;
		default:	System.out.println("Geen goede invoer");
					getInput();
					break;
		}
	}
	
	public static void walkN(){
		if (player.getY() != 0){
			player.setY(player.getY()-1);
		}
		else {
			System.out.println("Je kan niet verder noord!");
			getInput();
		}
		gameLoop();
	}
	
	public static void walkS(){
		if (player.getY() != gw.getWorldH()-1){
			player.setY(player.getY()+1);
		}
		else {
			System.out.println("Je kan niet verder zuid!");
			getInput();
		}
		gameLoop();
	}
	
	public static void walkW(){
		if (player.getX() != 0){
			player.setX(player.getX()-1);
		}
		else {
			System.out.println("Je kan niet verder west!");
			getInput();
		}
		gameLoop();
	}
	
	public static void walkE(){
		if (player.getX() != gw.getWorldB()-1){
			player.setX(player.getX()+1);
		}
		else {
			System.out.println("Je kan niet verder oost!");
			getInput();
		}
		gameLoop();
	}
}
