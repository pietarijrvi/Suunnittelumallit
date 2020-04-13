
public class Arvuuttaja {

	private int arpa;
	private static volatile int laskuri = 0;

	public synchronized Object liityPeliin() {
		System.out.print("Arvaa numero 0 & 100 väliltä: ");
		this.arpa = arvoNumero();
		return new Memento(this.arpa);
	}

	private int arvoNumero() {
		int min = 0;
		int max = 100;
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public synchronized Boolean tarkistus(Object o, int arvaus) {
		
		Memento memento = (Memento) o;
		if (arvaus == memento.getArpa()) {
			laskuri++;
			System.out.println("\nArvasit oikein! Oikea numero oli: " + arvaus);
			System.out.println("Arvauksia oikeaan arvaukseen tarvittiin: " + laskuri);
			return true;
		} else if (arvaus < memento.getArpa()) {
			System.out.println("Oikea vastaus on suurempi luku");
			laskuri++;
			return false;
		} else {
			laskuri++;
			System.out.println("Oikea vastaus on pienempi luku");
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
