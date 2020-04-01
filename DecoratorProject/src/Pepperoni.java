
public class Pepperoni extends Täyte{

	public Pepperoni(Pizza p) {
		super(p);
	}
	
	public String täytä() {
		return super.täytä() + lisääPepperoni();
	}

	private String lisääPepperoni() {
		return ", pepperoni";
	}

	@Override
	public double getHinta() {
		return 1 + super.getHinta();
	}
	
	

}
