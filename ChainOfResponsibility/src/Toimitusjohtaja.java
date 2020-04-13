
public class Toimitusjohtaja extends Käsittelijä {
	
	public Toimitusjohtaja(Käsittelijä s) {
		super(s);
	}

	public void handleRaise(float vanhaPalkka, float uusiPalkka) {
		float korotus = uusiPalkka/vanhaPalkka * 100 - 100;
		if (korotus >= 5) {
			System.out.println("Toimitusjohtaja käsitteli " + korotus + " % palkankorotuksen");
		} else {
			super.nextHandler(vanhaPalkka, uusiPalkka);
		}
	}
}
