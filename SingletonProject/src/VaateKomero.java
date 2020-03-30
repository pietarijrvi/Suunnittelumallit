
public class VaateKomero {
	private static VaateKomero vaateKomero;
	
	public static VaateKomero getInstance() {
		if(vaateKomero == null)
			vaateKomero = new VaateKomero();
		return vaateKomero;
	}
	
	public Paita puePaita() {
		return new Paita();
	} 
	
	public Housut pueHousut() {
		return new Housut();
	}
	
	public Kengat pueKengat() {
		return new Kengat();
	}
}
