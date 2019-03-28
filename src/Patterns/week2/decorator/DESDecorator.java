package Patterns.week2.decorator;

public class DESDecorator extends EncryptionDecorator {
	private String desDecrypted;

	public DESDecorator(Encryptable txt) {
		super(txt);
		System.out.println("DESDecorator created.");
		desDecrypted = "\n\tDES encrypted.";
	}

	// Deze methode wordt door de client (Demo in dit voorbeeld) aangeroepen. Deze vraagt eerst de algemene
    // functionaliteit van de Component aan (dat gebeurt in dit specifieke geval via de superklasse) en voegt er
    // vervolgens zijn eigen functionaleit aan toe.
	@Override
	public String getData() {
		String rv = super.getData();
		return rv + this.desDecrypted;
	}

	@Override
	String showDecriptedData() {
		return null;
	}

}
