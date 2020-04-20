
public class Main {

	public static void main(String[] args) {
		Pankkitili tili = new Pankkitili();
		
		System.out.println("Rahaa tilillä euroissa: " + tili.getRahat());
		
		RahayksikköAdapterImpl adapter = new RahayksikköAdapterImpl(tili);
		System.out.println("Rahaa tilillä dollareissa: " + adapter.getRahat());
	}

}
