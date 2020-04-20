
public class HesburgerBuilder extends HamppariBuilder {

	private StringBuilder hampurilainen;

	public StringBuilder getHamppari() {
		return this.hampurilainen;
	}

	@Override
	public void createHamppari() {
		this.hampurilainen = new StringBuilder();
	}

	@Override
	public void buildSampyla() {
		hampurilainen.append("Hesburger Sämpylä\n");
	}

	@Override
	public void buildPihvi() {
		hampurilainen.append("Hesburger Pihvi\n");
	}

	@Override
	public void buildSalaatti() {
		hampurilainen.append("Hesburger Salaatti\n");
	}

	@Override
	public void buildKastike() {
		hampurilainen.append("Hesburger Kastike\n");
	}
}
