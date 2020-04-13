
public abstract class Käsittelijä {
	
	private Käsittelijä successor;
	
	public Käsittelijä(Käsittelijä s) {
		successor = s;
	}
	
	public void nextHandler(float vanhaPalkka, float uusiPalkka) {
		if(successor!=null) {
			successor.handleRaise(vanhaPalkka, uusiPalkka);
		}
	}
	
	public void handleRaise(float vanhaPalkka, float uusiPalkka) {
		
	}
}
