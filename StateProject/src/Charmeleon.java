
public class Charmeleon implements Tila {
	
	@Override
	public void hyökkää(Pokemon p) {
		System.out.println("Charmeleon used Inferno!");	
		p.addXP(1);
		 if(p.getXP() > 10) {
			 p.kehity();
			 p.getNimi();
		 }
	}


	@Override
	public void kehity(Pokemon p) {
		System.out.println("\nWhat? Charmeleon is evolving!");
		System.out.println("Congratulations! Your Charmeleon evolved into Charizard!\n");
		p.setTila(new Charizard());
	}

	@Override
	public void getNimi() {
		System.out.println("Charmeleon go!\n");
	}

}
