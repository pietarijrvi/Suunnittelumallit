public class Main {

	public static void main(String[] args) {
      Vaate paita = VaateKomero.getInstance().puePaita();
      Vaate kengat = VaateKomero.getInstance().pueHousut();
      Vaate housut = VaateKomero.getInstance().pueKengat();
      
      System.out.println("Puettu päälle: " + paita + ", " + housut + " ja " + kengat + ".");
    }
}
