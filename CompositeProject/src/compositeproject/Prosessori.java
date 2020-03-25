package compositeproject;

import java.util.ArrayList;
import java.util.List;

public class Prosessori implements IOsa {
	
	private int hinta = 300;
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
		osat.add(osa);
	}
}
