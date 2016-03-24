package nl.slooise.adventureSquares;

import java.util.ArrayList;

import nl.slooise.adventureItems.*;

public abstract class Square {
	
	private String description;
	private ArrayList<Item> squareItems = new ArrayList<>();
	
	Square (){
		this.description = null;
	}
	
	Square (String description){
		this.description = description;
	}
	
	public String getDescription(){
		String s = description;
		for (Item i : squareItems){
			s += " " + i.getDescription();
		}
		return s;
	}
	
	public void setDescription (String description){
		this.description = description;
	}
	
	public void addItem(Item i){
		squareItems.add(i);
	}
	
	InventoryItem take(String name) {
		InventoryItem t = null;
		for (Item i: squareItems){
			if (i instanceof InventoryItem){
				if (name.equals(((InventoryItem) i).getName()))
					t = (InventoryItem)i;
			}
		}
		return t;
	}
}
