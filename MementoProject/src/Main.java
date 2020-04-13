
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		  	Scanner scanner = new Scanner(System.in);
	        boolean endOfGame = false;
	        
	        Arvuuttaja arvuuttaja = new Arvuuttaja();
	        Object obj = arvuuttaja.liityPeliin();
	        
	        while (!endOfGame) {
	            int arvaus = Integer.parseInt(scanner.nextLine());
	            endOfGame = arvuuttaja.tarkistus(obj, arvaus);
	        }
	}
}
