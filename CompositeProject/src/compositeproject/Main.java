package compositeproject;

public class Main {
	
	 public static void main(String[] args) {
		 
		 
		 IOsa osat;
		 
		 
		 osat = giveOsalista(new DellinTehdas());
		 System.out.println("Osien hinta yhteensä: " + osat.tulosta() + "\n");

		 
		 osat = giveOsalista(new LenovonTehdas());
		 System.out.println("Osien hinta yhteensä: " + osat.tulosta());
		 
	 }
	 
	 private static IOsa giveOsalista(ITehdas newFactory) {
		 
		 ITehdas factory = newFactory;
		 
		 IOsa osat = factory.getKoostekomponentti();
		 
		 IOsa emolevy = factory.getEmolevy();
		 
		 emolevy.addOsa(factory.getProsessori());
		 emolevy.addOsa(factory.getMuistipiiri());
		 
		 osat.addOsa(emolevy);
		 
		 IOsa kotelo = factory.getKotelo();
		
		 kotelo.addOsa(factory.getVirtalahde());
		 
		 osat.addOsa(kotelo);
		 
		 osat.addOsa(factory.getNaytonohjain());
		 osat.addOsa(factory.getVerkkokortti());
		 
		 return osat;
	 }
	
}
