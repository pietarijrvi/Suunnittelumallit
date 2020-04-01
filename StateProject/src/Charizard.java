
public class Charizard implements Tila {


	public void hyökkää(Pokemon p) {
		System.out.println("Charizard used fire spin");
		p.addXP(1);
		 if(p.getXP() > 20) {
			 p.kehity();
		 }
	}


	public void kehity(Pokemon p) {
		System.out.println("\nCharizard can't evolve!\n");
	}


	@Override
	public void getNimi() {
		System.out.println("Charizard go!\n");
		
	}

}
