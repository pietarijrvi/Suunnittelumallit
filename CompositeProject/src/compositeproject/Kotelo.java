package compositeproject;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements IOsa{
	int hinta = 100;
    List<IOsa> osat = new ArrayList<IOsa>();

    @Override
	public int getHinta() {
		  int osatHinta = 0;
	        
	        for(IOsa osa : osat) {
	            osatHinta += osa.getHinta();
	        }
	        
	        return osatHinta + this.hinta;
	}
    
    @Override
	public void addOsa(IOsa osa) {
		osat.add(osa);	
	}
}
