
public class Main {

	public static void main(String[] args) {

		Pokemon pokemon = new Pokemon(new Charmander());

		pokemon.getNimi();

		for (int i = 0; i < 21; i++) {
			pokemon.hyökkää();
		}
	}

}
