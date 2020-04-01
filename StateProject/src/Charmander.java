
public class Charmander implements Tila {
	

	@Override
	public void hyökkää(Pokemon p) {
		System.out.println("Charmander used flamethrower!");
		p.addXP(1);
		 if(p.getXP() > 4) {
			 p.kehity();
			 p.getNimi();
		 }
	}
	
	@Override
	public void kehity(Pokemon p) {
		System.out.println("\nWhat? Charmander is evolving!");
		System.out.println("Congratulations! Your Charmander evolved into Charmeleon!\n");
		p.setTila(new Charmeleon());
	}

	@Override
	public void getNimi() {
		System.out.println("Charmander go!\n");	
	}

}
