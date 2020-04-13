
public class Esimies extends Käsittelijä {

	public Esimies(Käsittelijä s) {
		super(s);
	}

	public void handleRaise(float vanhaPalkka, float uusiPalkka) {
		float korotus = uusiPalkka / vanhaPalkka * 100 - 100;
		if (korotus <= 2) {
			System.out.println("Lähiesimies käsitteli " + korotus + " % palkankorotuksen");
		} else {
			System.out.println("Lähiesimies ei pystynyt hyväksymään " + korotus
					+ "% palkankorotusta, joten pyyntö siirrettiin ylemmälle tasolle");
			super.nextHandler(vanhaPalkka, uusiPalkka);	
		}
	}
}
