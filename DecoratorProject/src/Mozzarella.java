
public class Mozzarella extends Täyte{

	public Mozzarella(Pizza p) {
		super(p);
	}
	
	public String täytä() {
		return super.täytä() + lisääMozzarella();
	}

	private String lisääMozzarella() {
		return ", mozzarella";
	}

	@Override
	public double getHinta() {
		return 0.5 + super.getHinta();
	}
}
