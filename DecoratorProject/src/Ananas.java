public class Ananas extends Täyte{

	public Ananas(Pizza p) {
		super(p);
	}
	
	public String täytä() {
		return super.täytä() + lisääAnanas();
	}

	private String lisääAnanas() {
		return ", ananas";
	}

	@Override
	public double getHinta() {
		return 0.5 + super.getHinta();
	}
	
	

}
