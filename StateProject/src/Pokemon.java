
public class Pokemon {
	
	private Tila evoluutio;
	private int pisteet;

	public Pokemon(Tila t) {
		evoluutio = t;
	}
	
	public void setTila(Tila t) {
		evoluutio = t;
	}
	
	public void hyökkää() {
		evoluutio.hyökkää(this);
	}

	public void kehity() {
		evoluutio.kehity(this);
	}

	public void getNimi() {
		evoluutio.getNimi();
	}
	
	public void addXP(int xp) {
		pisteet += xp;
	}
	
	public int getXP() {
		return pisteet;
	}
}
