
public class Jalapeno extends Täyte{

	public Jalapeno(Pizza p) {
		super(p);
	}
	
	public String täytä() {
		return super.täytä() + lisääJalapeno();
	}

	private String lisääJalapeno() {
		return ", jalapeno";
	}

	@Override
	public double getHinta() {
		return 0.3 + super.getHinta();
	}
	
	

}
