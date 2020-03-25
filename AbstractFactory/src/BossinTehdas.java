
public class BossinTehdas implements VaateTehdas {

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
