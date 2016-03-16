package nl.slooise.oefenen;

public class Oefenen {

	public static void main (String [] args){
		byte a = 2;
		System.out.println(pastIn(a, true));
	}
	
	public static int aantalbytes(byte argument) {
		return 1;
	}
	
	public static int aantalbytes(int argument) {
		return 4;
	}
	
	public static int aantalbytes(double argument) {
		return 8;
	}
	
	public static int aantalbytes(float argument) {
		return 4;
	}
	
	public static int aantalbytes(char argument) {
		return 2;
	}
	
	public static int aantalbytes(boolean argument) {
		return 4;
	}
	
	public static int aantalbytes(long argument) {
		return 8;
	}
	
	public static int aantalbytes(short argument) {
		return 2;
	}
	
	public static boolean pastIn(int a, float b){
		boolean p = false;
		if (aantalbytes(a) <= aantalbytes(b)){
			p = true;
		}
		return p;
	}
	
	public static boolean pastIn(long a, short b){
		boolean p = false;
		if (aantalbytes(a) <= aantalbytes(b)){
			p = true;
		}
		return p;
	}
	
	public static boolean pastIn(byte a, boolean b){
		boolean p = false;
		if (aantalbytes(a) <= aantalbytes(b)){
			p = true;
		}
		return p;
	}
	
	public static boolean pastIn(char a, int b){
		boolean p = false;
		if (aantalbytes(a) <= aantalbytes(b)){
			p = true;
		}
		return p;
	}
}