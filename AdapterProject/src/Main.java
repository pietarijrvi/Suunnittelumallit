
public class Main {

	public static void main(String[] args) {
		Pankkitili tili = new Pankkitili();
		
		tili.setRahat(10);
		System.out.println("Rahaa tilillä euroissa: " + tili.getRahat());
		
		RahayksikköAdapterImpl adapter = new RahayksikköAdapterImpl(tili);
		System.out.println("Rahaa tilillä dollareissa: " + adapter.getRahat());
		
		tili.setRahat(1348);
		System.out.println("\nRahaa tilillä euroissa: " + tili.getRahat());
		System.out.println("Rahaa tilillä dollareissa: " + adapter.getRahat());
		
		tili.setRahat(493827);
		
		System.out.println("\nRahaa tilillä euroissa: " + tili.getRahat());
		System.out.println("Rahaa tilillä dollareissa: " + adapter.getRahat());
		
	}

}
