
public class AdidaksenTehdas implements VaateTehdas {

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
