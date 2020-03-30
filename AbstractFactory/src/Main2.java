import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main2 {
	public static void main(String[] args) {

		Class c = null;
		VaateTehdas tehdas = null;
		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream("factory.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("adidas"));
			tehdas = (VaateTehdas) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Kengat aKengat = tehdas.pueKengat();
		Lippis aLippis = tehdas.pueLippis();
		Farmarit aFarmarit = tehdas.pueFarmarit();
		Tpaita aTpaita = tehdas.pueTpaita();
		System.out
				.println("Jasperilla päällä: \n" + aKengat + "\n" + aLippis + "\n" + aFarmarit + "\n" + aTpaita + "\n");

		try {
			properties.load(new FileInputStream("factory.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("boss"));
			tehdas = (VaateTehdas) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// vaihdetaan vaatteet

		Kengat bKengat = tehdas.pueKengat();
		Lippis bLippis = tehdas.pueLippis();
		Farmarit bFarmarit = tehdas.pueFarmarit();
		Tpaita bTpaita = tehdas.pueTpaita();
		System.out.println("Jasperilla päällä nyt: \n" + bKengat + "\n" + bLippis + "\n" + bFarmarit + "\n" + bTpaita);
	}
}
