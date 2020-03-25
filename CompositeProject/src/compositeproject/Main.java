package compositeproject;

public class Main {
	
	 public static void main(String[] args) {
		 
		// Luodaan osat
		IOsa kotelo = new Kotelo();
	        IOsa emolevy = new Emolevy();
	        IOsa CPU = new Prosessori();
	        IOsa RAM = new Muistipiiri();
	        IOsa WLAN = new Verkkokortti();
	        IOsa GPU = new Naytonohjain();

	        // Lisätään koppaan emolevy
	        kotelo.addOsa(emolevy);
	        
	        // Lisätään loput osat emolevyyn
	        emolevy.addOsa(CPU);
	        emolevy.addOsa(RAM);	        
	        emolevy.addOsa(GPU);
	        emolevy.addOsa(WLAN);
	        
	        // Tulostetaan kokonaishinta
	        System.out.println("Hintaa tietokoneella yhteensä: " + kotelo.getHinta());
		 
	 }
	
}
