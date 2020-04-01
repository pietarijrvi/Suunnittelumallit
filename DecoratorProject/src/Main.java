import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Pizza> menu = new ArrayList<Pizza>();
		Pizza p1 = new Pepperoni(new Ananas(new Jalapeno(new Pohja())));
		menu.add(p1);
		Pizza p2 = new Mozzarella(new Pohja());
		menu.add(p2);
		Pizza p3 = new Kinkku(new Ananas(new Pohja()));
		menu.add(p3);
		
		for(Pizza p: menu) {
			   System.out.println(p.täytä());
		       System.out.print("Hinta: ");
		       System.out.println(String.format("%.2f\n", p.getHinta()));
		}
	}

}
