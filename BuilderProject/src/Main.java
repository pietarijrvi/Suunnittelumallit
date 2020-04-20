import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Tilaus tilaus = new Tilaus();
		HesburgerBuilder heseBuilder = new HesburgerBuilder();
		McDonaldsBuilder mcBuilder = new McDonaldsBuilder();
		
		tilaus.setBuilder(mcBuilder);
		tilaus.luoHampurilainen();
	
		Object hampurilainen = mcBuilder.getHamppari();
		System.out.println("McDonalds hampurilainen: ");
		tulostaHamppari(hampurilainen);
		
		tilaus.setBuilder(heseBuilder);
		tilaus.luoHampurilainen();
	
		hampurilainen = heseBuilder.getHamppari();
		System.out.println("\nHesburger hampurilainen: ");
		tulostaHamppari(hampurilainen);	
		

	}

	@SuppressWarnings("unchecked")
	private static void tulostaHamppari(Object hampurilainen) {
		if (hampurilainen instanceof String) {
			System.out.println(hampurilainen);
		} else if (hampurilainen instanceof ArrayList) {
			((ArrayList<McTayte>) hampurilainen).forEach(n -> System.out.print(n.getNimi() + "\n"));
		}
	}

}
