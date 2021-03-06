package compositeproject;

import java.util.ArrayList;
import java.util.List;

public class Naytonohjain implements IOsa {
	
	private int hinta = 500;
	private List<IOsa> osat = new ArrayList<IOsa>();

	@Override
	public int getHinta() {
		int osatHinta = 0;

		for (IOsa osa : osat) {
			osatHinta += osa.getHinta();
		}

		return osatHinta + this.hinta;
	}

	@Override
	public void addOsa(IOsa osa) {
		throw new RuntimeException("Et voi lisätä näytönohjaimeen uutta osaa");
	}
}
