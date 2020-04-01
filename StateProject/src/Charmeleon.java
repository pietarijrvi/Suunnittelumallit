
public class Charmeleon implements Tila {

	@Override
	public void hyökkää(Pokemon p) {
		System.out.println("Charmeleon used Inferno!");
		p.addXP(1);
		System.out.println("The opponent attacks..");
		otaDamagea(p);
		System.out.println("HP left: " + p.getElämä()+"\n");
		if (p.getXP() > 10 && p.getElämä() >= 1) {
			p.kehity();
			p.getNimi();
		}

		if (p.getElämä() <= 0) {
			pyörry(p);
		}
	}

	@Override
	public void kehity(Pokemon p) {
		System.out.println("\nWhat? Charmeleon is evolving!");
		System.out.println("Congratulations! Your Charmeleon evolved into Charizard!\n");
		p.setTila(new Charizard());
		p.setElämä(40);
	}

	@Override
	public void getNimi() {
		System.out.println("Charmeleon go!\n");
	}

	@Override
	public void otaDamagea(Pokemon p) {
		p.otaDmg();
	}

	@Override
	public void pyörry(Pokemon p) {
		System.out.println("\nCharmeleon has fainted!");
		System.exit(0);
	}

}
