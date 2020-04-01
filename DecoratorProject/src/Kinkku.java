
public class Kinkku extends Täyte{

	public Kinkku(Pizza p) {
		super(p);
	}
	
	public String täytä() {
		return super.täytä() + lisääKinkku();
	}

	private String lisääKinkku() {
		return ", kinkku";
	}

	@Override
	public double getHinta() {
		return 1.5 + super.getHinta();
	}
	
	

}