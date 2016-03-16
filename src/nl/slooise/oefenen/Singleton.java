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
	
	static public String test (int a, short b){
		return "x";
	}
	
	static public String test (int a, byte b){
		return "X";
	}
	
	public static void main (String [] args){
		byte a = 3;
		System.out.println(test(3,a));
	}
}
