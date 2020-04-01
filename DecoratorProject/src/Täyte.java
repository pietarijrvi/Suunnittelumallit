
public abstract class Täyte implements Pizza{
	private final Pizza pizzaTäytteillä;
	
	public Täyte(Pizza p) {
		this.pizzaTäytteillä = p;
	}
	
	public String täytä() {
		return pizzaTäytteillä.täytä();
	}
	
	public double getHinta() {
		return pizzaTäytteillä.getHinta();
	}
}
