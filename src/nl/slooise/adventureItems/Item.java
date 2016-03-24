package nl.slooise.adventureItems;

public abstract class Item {

	private String description;
	
	Item (){
		this.description = null;
	}
	
	Item (String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	};
	
	public void setDescription (String description){
		this.description = description;
	}
}
