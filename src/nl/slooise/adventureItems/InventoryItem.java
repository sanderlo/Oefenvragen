package nl.slooise.adventureItems;

public class InventoryItem extends Item {

	private String name;
	
	public InventoryItem() {
		// TODO Auto-generated constructor stub
	}

	public InventoryItem(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}
	
	public String getName (){
		return name;
	}
	
	public void setName (String name){
		this.name = name;
	}

}
