public class Main {

	public static void main(String[] args) {
		VaateTehdas jasperinVaatteet = new AdidaksenTehdas();
		
		Kengat aKengat = jasperinVaatteet.pueKengat();
		Lippis aLippis = jasperinVaatteet.pueLippis();
		Farmarit aFarmarit = jasperinVaatteet.pueFarmarit();
		Tpaita aTpaita = jasperinVaatteet.pueTpaita();
		System.out.println("Jasperilla päällä: \n" + aKengat + "\n" + aLippis + "\n" + aFarmarit+ "\n" + aTpaita + "\n");
		
		
		//vaihdetaan vaatteet
		jasperinVaatteet = new BossinTehdas();
		
		Kengat bKengat = jasperinVaatteet.pueKengat();
		Lippis bLippis = jasperinVaatteet.pueLippis();
		Farmarit bFarmarit = jasperinVaatteet.pueFarmarit();
		Tpaita bTpaita = jasperinVaatteet.pueTpaita();
		System.out.println("Jasperilla päällä nyt: \n"+ bKengat + "\n" + bLippis + "\n" + bFarmarit+ "\n" + bTpaita);
	}
}