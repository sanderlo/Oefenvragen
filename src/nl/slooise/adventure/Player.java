package nl.slooise.adventure;

import java.util.ArrayList;

import nl.slooise.adventureItems.Item;

public class Player {
	private int posX, posY;
	private ArrayList<Item> playerItems = new ArrayList<>();
	
	Player(int x, int y){
		this.posX = x;
		this.posY = y;
	}
	
	protected void setPos (int x, int y){
		this.posX = x;
		this.posY = y;
	}
	
	protected void setX (int x){
		this.posX = x;
	}
	
	protected void setY (int y){
		this.posY = y;
	}
	
	public int getX (){
		return posX;
	}
	
	public int getY (){
		return posY;
	}
	
	public Item getItem(int i){
		return playerItems.get(i);
	}
	
}
