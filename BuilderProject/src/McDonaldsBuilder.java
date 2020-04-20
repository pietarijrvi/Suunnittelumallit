import java.util.ArrayList;

public class McDonaldsBuilder extends HamppariBuilder {

	private ArrayList<McTayte> hampurilainen;

	public Object  getHamppari() {
		return hampurilainen;
	}

	@Override
	public void createHamppari() {
		hampurilainen = new ArrayList<McTayte>();
	}

	@Override
	public void buildSampyla() {
		hampurilainen.add(new McTayte("McDonalds Sämpylä"));
	}

	@Override
	public void buildPihvi() {
		hampurilainen.add(new McTayte("McDonalds Pihvi"));
	}

	@Override
	public void buildSalaatti() {
		hampurilainen.add(new McTayte("McDonalds Salaatti"));
	}

	@Override
	public void buildKastike() {
		hampurilainen.add(new McTayte("McDonalds Kastike"));
	}

}
