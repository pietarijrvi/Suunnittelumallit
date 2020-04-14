
public class Main {


	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Arvaaja arvaaja1 = new Arvaaja(arvuuttaja);
		Arvaaja arvaaja2 = new Arvaaja(arvuuttaja);
		Arvaaja arvaaja3 = new Arvaaja(arvuuttaja);
		arvaaja1.run();
		arvaaja2.run();
		arvaaja3.run();

	}
}
