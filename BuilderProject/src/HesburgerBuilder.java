
public class HesburgerBuilder extends HamppariBuilder {

	private String hampurilainen;

	public String getHamppari() {
		return this.hampurilainen;
	}

	@Override
	public void createHamppari() {
		this.hampurilainen = new String();
	}

	@Override
	public void buildSampyla() {
		hampurilainen+=("Hesburger Sämpylä\n");
	}

	@Override
	public void buildPihvi() {
		hampurilainen+=("Hesburger Pihvi\n");
	}

	@Override
	public void buildSalaatti() {
		hampurilainen+=("Hesburger Salaatti\n");
	}

	@Override
	public void buildKastike() {
		hampurilainen+=("Hesburger Kastike\n");
	}
}
