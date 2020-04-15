import java.util.Random;

public class Pokemon{

	private Tila evoluutio;
	private int pisteet;
	private int elämä = 25;

	public int getElämä() {
		return elämä;
	}

	public void setElämä(int elämä) {
		this.elämä = elämä;
	}

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

	public void otaDmg() {
		elämä -= randDmg();
	}

	public int randDmg() {
		Random ran = new Random();
		int x = ran.nextInt(8) + 0;
		return x;
	}

	public void accept(PokemonStateVisitor visitor) {
		evoluutio.accept(visitor);
	}
}
