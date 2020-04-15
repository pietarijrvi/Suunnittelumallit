import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<IImage> imageList = new ArrayList<>();
		imageList.add(new ProxyImage("300px-Homerun.png", "Homerun"));
		imageList.add(new ProxyImage("250px-Kobe_Bryant_Baseline_dunk.png", "Kobe_Bryant_Baseline_Dunk"));
		imageList.add(new ProxyImage("750px-Messi.jpeg", "Messi"));
		imageList.add(new ProxyImage("1000px-Roger_Federer.png", "Roger_Federer"));
		
		System.out.println("Image data:");
        for (IImage image : imageList) {
			image.showData();
		}

        System.out.println("\nLoading and displaying images:\n");
        for (IImage image : imageList) {
			image.displayImage();
		}

	}

}
