
public class AdidaksenTehdas implements VaateTehdas {
	
	private AdidaksenTehdas() {};
	
	private static AdidaksenTehdas tehdas = null;
	

    public static AdidaksenTehdas getInstance(){

        if(tehdas == null){

            synchronized(AdidaksenTehdas.class){

                if(tehdas == null){

                    tehdas = new AdidaksenTehdas();

                }

            }

        }

        return tehdas;
    }

	@Override
	public Lippis pueLippis() {
		return (Lippis) new AdidasLippis();
	}

	@Override
	public Farmarit pueFarmarit() {
		return (Farmarit) new AdidasFarmarit();
	}

	@Override
	public Kengat pueKengat() {
		return (Kengat) new AdidasKengat();
	}

	@Override
	public Tpaita pueTpaita() {
		return (Tpaita) new AdidasTpaita();
	}
	

}
