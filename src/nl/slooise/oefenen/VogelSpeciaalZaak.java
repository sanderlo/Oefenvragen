package nl.slooise.oefenen;

public class VogelSpeciaalZaak extends DierenWinkel{
	@Override
	public Vogel[] getVoorraad(){
		return new Vogel [] {new Vogel("Zwaan"),new Vogel("Zwaluw"), new Vogel("Kip")};	
	}
}
