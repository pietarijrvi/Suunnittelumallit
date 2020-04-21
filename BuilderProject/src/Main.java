import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Tilaus tilaus = new Tilaus();
		HesburgerBuilder heseBuilder = new HesburgerBuilder();
		McDonaldsBuilder mcBuilder = new McDonaldsBuilder();
		
		tilaus.setBuilder(mcBuilder);
		tilaus.luoHampurilainen();
	
		System.out.println("McDonalds hampurilainen: ");
		printHampurilainen(tilaus.getHamppari());
		
		tilaus.setBuilder(heseBuilder);
		tilaus.luoHampurilainen();
	
		System.out.println("\nHesburger hampurilainen: ");
		printHampurilainen(tilaus.getHamppari());

	}
	
	@SuppressWarnings("unchecked")
	private static void printHampurilainen(Object hampurilainen) {
		
		if(hampurilainen instanceof StringBuilder) {
			System.out.println(hampurilainen);
		}else if(hampurilainen instanceof ArrayList) {
			((ArrayList<McTayte>) hampurilainen).forEach(n -> System.out.print(n.getNimi()+"\n"));
		}
	}
}
