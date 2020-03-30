public class Main {

	public static void main(String[] args) {
		VaateTehdas vaateTehdas = AdidaksenTehdas.getInstance();
		Kengat aKengat = vaateTehdas.pueKengat();
		Lippis aLippis = vaateTehdas.pueLippis();
		Farmarit aFarmarit = vaateTehdas.pueFarmarit();
		Tpaita aTpaita = vaateTehdas.pueTpaita();
		System.out.println("Jasperilla päällä: \n" + aKengat + "\n" + aLippis + "\n" + aFarmarit+ "\n" + aTpaita + "\n");
		
		
		//vaihdetaan vaatteet	

		vaateTehdas = BossinTehdas.getInstance();
		Kengat bKengat = vaateTehdas.pueKengat();
		Lippis bLippis = vaateTehdas.pueLippis();
		Farmarit bFarmarit = vaateTehdas.pueFarmarit();
		Tpaita bTpaita = vaateTehdas.pueTpaita();
		System.out.println("Jasperilla päällä nyt: \n"+ bKengat + "\n" + bLippis + "\n" + bFarmarit+ "\n" + bTpaita);
	}
}