package compositeproject;

public class DellinTehdas implements ITehdas {

	@Override
	public IOsa getMuistipiiri() {
		IOsa muistipiiri = new Laiteosa("Dellin muistipiiri", 50);
		return muistipiiri;
	}

	@Override
	public IOsa getEmolevy() {
		IOsa emolevy = new Laiteosa("Dellin emolevy", 150);
		IOsa emolevyKooste = new Kooste(emolevy);
		return emolevyKooste;
	}

	@Override
	public IOsa getProsessori() {
		IOsa prosessori = new Laiteosa("Dellin prosessori", 203);
		return prosessori;
	}

	@Override
	public IOsa getVerkkokortti() {
		IOsa verkkokortti = new Laiteosa("Dellin verkkokortti", 15);
		return verkkokortti;
	}

	@Override
	public IOsa getNaytonohjain() {
		IOsa naytonohjain = new Laiteosa("Dellin näytönohjain", 300);
		return naytonohjain;
	}

	@Override
	public IOsa getKotelo() {
		IOsa kotelo = new Laiteosa("Dellin kotelo", 100);
		IOsa koteloKooste = new Kooste(kotelo);
		return koteloKooste;
	}

	@Override
	public IOsa getKoostekomponentti() {
		IOsa koostekomponentti = new Kooste();
		return koostekomponentti;
	}

	@Override
	public IOsa getVirtalahde() {
		IOsa virtalahde = new Laiteosa("Dellin virtalahde", 50);
		return virtalahde;
	}

}
