package compositeproject;

public class LenovonTehdas implements ITehdas {

	@Override
	public IOsa getMuistipiiri() {
		IOsa muistipiiri = new Laiteosa("Lenovon muistipiiri", 30);
		return muistipiiri;
	}

	@Override
	public IOsa getEmolevy() {
		IOsa emolevy = new Laiteosa("Lenovon emolevy", 150);
		IOsa emolevyKooste = new Kooste(emolevy);
		return emolevyKooste;
	}

	@Override
	public IOsa getNaytonohjain() {
		IOsa naytonohjain = new Laiteosa("Lenovon näytönohjain", 500);
		return naytonohjain;
	}

	@Override
	public IOsa getProsessori() {
		IOsa prosessori = new Laiteosa("Lenovon prosessori", 200);
		return prosessori;
	}

	@Override
	public IOsa getVerkkokortti() {
		IOsa verkkokortti = new Laiteosa("Lenovon verkkokortti", 25);
		return verkkokortti;
	}

	@Override
	public IOsa getVirtalahde() {
		IOsa virtalahde = new Laiteosa("Lenovon virtalahde", 80);
		return virtalahde;
	}

	@Override
	public IOsa getKotelo() {
		IOsa kotelo = new Laiteosa("Lenovon kotelo", 105);
		IOsa koteloKooste = new Kooste(kotelo);
		return koteloKooste;
	}

	@Override
	public IOsa getKoostekomponentti() {
		IOsa koostekomponentti = new Kooste();
		return koostekomponentti;
	}

}
