
public class PokemonVisitor implements PokemonStateVisitor {
	
	@Override
	public void visit(Charmander charmander) {
		System.out.println("You gain 1 xp!\n");
	}

	@Override
	public void visit(Charmeleon charmeleon) {
		System.out.println("You gain 2 xp!\n");

	}

	@Override
	public void visit(Charizard charizard) {
		System.out.println("You gain 3 xp!\n");

	}

}
