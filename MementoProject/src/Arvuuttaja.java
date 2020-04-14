import java.util.Random;

public class Arvuuttaja {

	private static volatile int laskuri = 0;

	public synchronized Object liityPeliin(Arvaaja arvaaja) {
		return new Memento(new Random().nextInt(11));
	}

	public synchronized Boolean tarkistus(Object o, int arvaus) {
		
		Memento memento = (Memento) o;
		if (arvaus == memento.getArpa()) {
			laskuri++;
			System.out.println("Oikea arvaus numerolla " + memento.getArpa());
			System.out.println("\nArvauksia oikeaan arvaukseen tarvittiin: " + laskuri +"\n");
			laskuri = 0;
			return true;
		} else if (arvaus < memento.getArpa()) {
			laskuri++;
			return false;
		} else {
			laskuri++;
		}
		
		return false;
	}

	private class Memento {
		private final int arpa;

		public Memento(int arpa) {
			this.arpa = arpa;
		}
		
		public int getArpa() {
            return arpa;
        }
	}
}
