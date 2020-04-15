
public class Charizard implements Tila {
	
	private int xpToLevel = 50;

	public void hyökkää(Pokemon p) {
		System.out.println("Charizard used fire spin");
		p.addXP(3);
		System.out.println("The opponent attacks..");
		otaDamagea(p);
		System.out.println("HP left: " + p.getElämä() + "\n");
		if (p.getXP() > xpToLevel && p.getElämä() >= 1) {
			p.kehity();
		}

		if (p.getElämä() <= 0) {
			pyörry(p);
		}
	}

	public void kehity(Pokemon p) {
		System.out.println("\nCharizard can't evolve!\n");
	}

	@Override
	public void getNimi() {
		System.out.println("Charizard go!\n");

	}

	@Override
	public void otaDamagea(Pokemon p) {
		p.otaDmg();
	}

	@Override
	public void pyörry(Pokemon p) {
		System.out.println("Charizard has fainted!");
		System.exit(0);
	}

	@Override
	public void accept(PokemonStateVisitor visitor) {
		visitor.visit(this);
	}

}
