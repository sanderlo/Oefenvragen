package nl.slooise.oefenen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaOefening {


	/**
	 * Deze functie hoef je niet te begrijpen!
	 * @param data  een ArrayList van een willekeurig type 
	 * @param p     een lambda-expressie die een parameter van datzelfde type neemt en een boolean teruggeeft
	 * @return		een nieuwe List terug waarin alleen de data zit waarvoor je predicaat true is.
	 */
	public static <T> List<T> filter(ArrayList<T> data, Predicate<T> p){
		return data.stream().filter(p).collect(Collectors.toList());
	}

	
	/**
	 * Deze functie hoef je niet te begrijpen!
	 * @param data  een ArrayList van een willekeurig type
	 * @param p     een lambda-expressie die een parameter van datzelfde type neemt en ook zo'n type teruggeeft
	 * @return		we voeren de lamba uit voor ieder element van data en geven het resultaat terug 
	 */
	public static <T> List<T> map(ArrayList<T> data, Function<T, T> f){
		return data.stream().map(f).collect(Collectors.toList());
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<String> ar2 = new ArrayList<>();
		
		for(int x = 0; x < 100; ++x){
			ar.add(x);
		}
		
		ar2.add("lingo");
		ar2.add("fiets");
		ar2.add("cadeau");
		ar2.add(".java");
		ar2.add("fiets.java");
		ar2.add("fiets.test");
		
		System.out.println(filter(ar, i -> (i % 3 == 0) || (i % 5 == 0))); // deel1
		System.out.println(filter(ar2, i -> i.length() == 5)); // deel2
		System.out.println(filter(ar2, i -> (i.substring(i.length() - 5, i.length()).equals(".java"))));
		
		System.out.println(map(ar, i -> wortel(i)));
		System.out.println(map(ar2, i -> rev(i)));
	}
	
	static int wortel (int x){
		return (int)Math.sqrt(x);
	}
	
	static String rev (String s){
		StringBuilder sb = new StringBuilder ();
		return sb.append(s).reverse().toString();
	}

}
