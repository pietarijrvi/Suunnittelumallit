import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arvaaja implements Runnable{
	private Arvuuttaja arvuuttaja;
	private Object obj;
	List<Integer> numeroLista;
	
	public Arvaaja(Arvuuttaja arvuuttaja) {
		this.arvuuttaja = arvuuttaja;
		this.numeroLista = new ArrayList();
	}
	
	public void liityPeliin() {
		this.obj = arvuuttaja.liityPeliin(this);
	}
	
	public void arvaa() {
		int arvaus = new Random().nextInt(11);
		if(!this.numeroLista.contains(arvaus)) {
			this.numeroLista.add(arvaus);
			if(!arvuuttaja.tarkistus(obj, arvaus)) {
				System.out.println("Arvasin väärin.. Arvaukseni oli " + arvaus);
				arvaa();
			}
		}
		else {
			arvaa();
		}
	}
	
	@Override
	public void run() {
		liityPeliin();
		arvaa();
		
	}
}