package nl.slooise.mobiel;

public class Samsung extends MobilePhone implements USBCharger{

	@Override
	public void charge() {
		System.out.println("Aan het opladen!");
	}

	@Override
	protected String getOS() {
		return "Android";
	}
}
