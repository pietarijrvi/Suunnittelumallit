
public class Main {

	public static void main(String[] args) {

		Käsittelijä toimitusjohtaja = new Toimitusjohtaja(null);
		Käsittelijä yksikonPaallikko = new Päällikkö(toimitusjohtaja);
		Käsittelijä lahiEsimies = new Esimies(yksikonPaallikko);

		float vanhaPalkka, uusiPalkka;

		// Alle 2% palkankorotus
		vanhaPalkka = 1000;
		uusiPalkka = 1010;

		System.out.println("\nKäsittelypyyntö 1: ");
		lahiEsimies.handleRaise(vanhaPalkka, uusiPalkka);

		// Alle 5% palkankorotus
		vanhaPalkka = 1000;
		uusiPalkka = 1040;
		
		System.out.println("\nKäsittelypyyntö 2: ");
		lahiEsimies.handleRaise(vanhaPalkka, uusiPalkka);

		// Yli 5% palkankorotus
		vanhaPalkka = 1000;
		uusiPalkka = 1100;
		
		System.out.println("\nKäsittelypyyntö 3: ");
		lahiEsimies.handleRaise(vanhaPalkka, uusiPalkka);

		// Yli 5% palkankorotus
		vanhaPalkka = 1000;
		uusiPalkka = 1100;
		
		System.out.println("\nKäsittelypyyntö 4: ");
		yksikonPaallikko.handleRaise(vanhaPalkka, uusiPalkka);

	}

}
