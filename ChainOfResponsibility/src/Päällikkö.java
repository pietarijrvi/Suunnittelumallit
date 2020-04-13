

public class Päällikkö extends Käsittelijä{
	

	public Päällikkö(Käsittelijä s) {
		super(s);
	}
	
	public void handleRaise(float vanhaPalkka, float uusiPalkka) {
		float korotus = uusiPalkka/vanhaPalkka * 100 - 100;
		if(korotus > 2 && korotus <= 5) {
			System.out.println("Yksikön päällikkö käsitteli " + korotus + " % palkankorotuksen");
		}else {
			System.out.println("Yksikön päällikkö ei pystynyt hyväksymään " + korotus + " % palkankorotusta, joten pyyntö siirrettiin ylemmälle tasolle");
			super.nextHandler(vanhaPalkka, uusiPalkka);
		}
	}

}
