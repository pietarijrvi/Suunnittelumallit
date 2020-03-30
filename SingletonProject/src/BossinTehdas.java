
public class BossinTehdas implements VaateTehdas {
	
	private BossinTehdas() {};
	
	private static BossinTehdas tehdas = null;

	   public static BossinTehdas getInstance(){

	        if(tehdas == null){

	            synchronized(BossinTehdas.class){

	                if(tehdas == null){

	                    tehdas = new BossinTehdas();

	                }

	            }

	        }

	        return tehdas;
	    }
	
	@Override
	public Lippis pueLippis() {
		return new BossLippis();
	}

	@Override
	public Farmarit pueFarmarit() {
		return new BossFarmarit();
	}

	@Override
	public Kengat pueKengat() {
		return new BossKengat();
	}

	@Override
	public Tpaita pueTpaita() {
		return new BossTpaita();
	}

	
}
