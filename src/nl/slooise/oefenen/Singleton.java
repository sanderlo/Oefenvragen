package nl.slooise.oefenen;

public class Singleton {

	private static Singleton theInstance;
	
	private Singleton (){
		theInstance = this;
	}
	
	public Singleton getTeller(){
		if (theInstance == null)
			new Singleton();
		return theInstance;
	}
}
