import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arvaaja implements Runnable{
	private Arvuuttaja arvuuttaja;
	private Object obj;
	List<Integer> numbers;
	
	public Arvaaja(Arvuuttaja arvuuttaja) {
		this.arvuuttaja = arvuuttaja;
		this.numbers = new ArrayList();
	}
	
	public void liityPeliin() {
		this.obj = arvuuttaja.liityPeliin(this);
	}
	
	public void arvaa() {
		int guess = new Random().nextInt(10);
		if(!this.numbers.contains(guess)) {
			this.numbers.add(guess);
			if(!arvuuttaja.tarkistus(obj, guess)) {
				System.out.println("Arvasin väärin.. Arvaukseni oli " + guess);
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