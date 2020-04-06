import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int players = 0;
		Game game = new Dice();
		Scanner scan = new Scanner(System.in);

		while (players <= 0) {
			System.out.println("How many players?:");
			players = scan.nextInt();
		}

		game.playOneGame(players);
	}

}
