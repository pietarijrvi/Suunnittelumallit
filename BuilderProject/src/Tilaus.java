
public class Tilaus {

	private HamppariBuilder hamppariBuilder;
	

	public Object getHamppari() {
		return hamppariBuilder.getHamppari();
	}
	
	public void luoHampurilainen() {
		hamppariBuilder.createHamppari();
		hamppariBuilder.buildSampyla();
		hamppariBuilder.buildPihvi();
		hamppariBuilder.buildSalaatti();
		hamppariBuilder.buildKastike();
	}

	public void setBuilder(HamppariBuilder hb) {
		this.hamppariBuilder = hb;		
	}
}
