package compositeproject;

import java.util.ArrayList;
import java.util.List;

public class Kooste implements IOsa{
	
	private List<IOsa> laiteosaList = new ArrayList <IOsa>();
	
	public Kooste() {}
	
	public Kooste(IOsa koostekomponentti) {	
		addOsa(koostekomponentti);
	}
	
	@Override
	public int tulosta() {
		int kokonaisHinta = 0;
		for(IOsa i: laiteosaList) {
			kokonaisHinta += i.tulosta();
		}
		return kokonaisHinta;
	}

	@Override
	public void addOsa(IOsa lisattavaLaiteosa) {
		laiteosaList.add(lisattavaLaiteosa);		
	}

}
