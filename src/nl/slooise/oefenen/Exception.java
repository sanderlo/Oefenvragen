package nl.slooise.oefenen;

public class Exception {

	public static void main(String[] args) throws DatIsGeenWeekDag {
		// TODO Auto-generated method stub
		try{
			System.out.println(naamVanWeekdag(9));
		}
		catch(DatIsGeenWeekDag e){
			System.out.println(e.getMessage());
		}
		/*
		catch(NullPointerException e){
			System.out.println("Je hebt niets ingevoerd!");
		}*/
		finally{
		System.out.println("Dit print ie sowieso");
		}
	}
	
	static int twoExceptions (String getal){
		return Integer.valueOf(getal.trim());
	}
	
	static String naamVanWeekdag (int dag) throws DatIsGeenWeekDag{

		switch (dag){
		case 1: return "Maandag";
		case 2: return "Dinsdag";
		case 3: return "Woensdag";
		case 4: return "Donderdag";
		case 5: return "Vrijdag";
		case 6: return "Zaterdag";
		case 7: return "Zondag";
		default: throw new DatIsGeenWeekDag("Test");
		}
	}
	
	static void f(){
		f();
	}

}
