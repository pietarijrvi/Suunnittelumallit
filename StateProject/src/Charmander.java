
public class Charmander implements Tila {

	@Override
	public void hyökkää(Pokemon p) {
		System.out.println("Charmander used flamethrower!");
		p.addXP(1);
		System.out.println("The opponent attacks..");
		otaDamagea(p);
		System.out.println("HP left: " + p.getElämä()+"\n");
		if (p.getXP() > 4 && p.getElämä() >= 1) {
			p.kehity();
			p.getNimi();
		}

		if (p.getElämä() <= 0) {
			pyörry(p);
		}
	}

	@Override
	public void kehity(Pokemon p) {
		System.out.println("\nWhat? Charmander is evolving!");
		System.out.println("Congratulations! Your Charmander evolved into Charmeleon!\n");
		p.setTila(new Charmeleon());
		p.setElämä(30);
	}

	@Override
	public void getNimi() {
		System.out.println("Charmander go!\n");
	}

	@Override
	public void otaDamagea(Pokemon p) {
		p.otaDmg();
	}

	@Override
	public void pyörry(Pokemon p) {
		System.out.println("Charmander has fainted!");
		System.exit(0);
	}

}
