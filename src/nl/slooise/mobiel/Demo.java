package nl.slooise.mobiel;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<MobilePhone> phones = new ArrayList<>(); 
		phones.add(new Nokia());
		phones.add(new Samsung());
		phones.add(new IPhone());
		
		for (MobilePhone mp : phones){
			if (mp instanceof USBCharger){
				System.out.println(mp.getOS());
				((USBCharger)mp).charge();
			}
		}
	}
}
