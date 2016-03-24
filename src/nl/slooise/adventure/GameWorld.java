package nl.slooise.adventure;

import nl.slooise.adventureItems.*;
import nl.slooise.adventureSquares.*;

public class GameWorld {

	private Square [][] world;
	
	GameWorld (){
		world = new Square [3][3];
		world[0][0] = new WC();
		world[0][1] = new Slaapkamer();
		world[0][2] = new Tuin();
		world[1][0] = new Keuken();
		world[1][1] = new Hal();
		world[1][2] = new Garage();
		world[2][0] = new Eetkamer();
		world[2][1] = new Badkamer("Deze badkamer is erg bijzonder, er staat namelijk een fiets.");
		world[2][2] = new Studeerkamer();
		
		world[0][0].addItem(new Boek("Er ligt een boek in de wastafel"));
		world[2][2].addItem(new Boek("Er staat een boek in de kast."));
		world[2][2].addItem(new Mes());
	}
	
	Square getSquare(int x, int y){
		return world[x][y];
	}
	
	public int getWorldH (){
		return world.length;
	}
	
	public int getWorldB (){
		return world[0].length;
	}
}
