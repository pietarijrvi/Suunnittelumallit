
public class Main {

	public static void main(String[] args) {

		Pokemon pokemon = new Pokemon(new Charmander());
		PokemonStateVisitor visitor = new PokemonVisitor();

		

		for (int i = 0; i < 21; i++) {		
			pokemon.hyökkää();
			pokemon.accept(visitor);
		}
	}

}
