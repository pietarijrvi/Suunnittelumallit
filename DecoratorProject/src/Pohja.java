
public class Pohja implements Pizza {
	
	public Pohja() {
		
	}
	
	@Override
	public String täytä() {
		return "Pizzan täytteinä "+lisääPohja();
	}

	@Override
	public double getHinta() {
		return 7.0;
	}
	
	public String lisääPohja(){
		return "tomaattikastike";
	}
	
}
