
public class Tilaus {

	private HamppariBuilder hamppariBuilder;

	public void setBuilder(HamppariBuilder b) {
		this.hamppariBuilder = b;
	}

	public void luoHampurilainen() {
		hamppariBuilder.createHamppari();
		hamppariBuilder.buildSampyla();
		hamppariBuilder.buildPihvi();
		hamppariBuilder.buildSalaatti();
		hamppariBuilder.buildKastike();
	}
}
