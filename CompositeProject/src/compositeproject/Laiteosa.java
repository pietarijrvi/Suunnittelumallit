package compositeproject;

public class Laiteosa implements IOsa {

	private String osa;
	private int hinta;

	public Laiteosa(String osa, int hinta) {
		this.osa = osa;
		this.hinta = hinta;
	}

	@Override
	public int tulosta() {
		System.out.println(osa + " hinta: " + hinta);
		return hinta;
	}

	@Override
	public void addOsa(IOsa laiteosa) {
		throw new RuntimeException();
	}

}
