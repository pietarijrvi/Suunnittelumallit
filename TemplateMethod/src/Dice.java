import java.util.Random;

public class Dice extends Game {
	
	int round;
	int[][] diceThrows;
	private int[][] players;
	private Random random;
	int winner;

	@Override
	void initializeGame() {
		this.players = new int[super.playersCount + 1][super.playersCount + 1];
		diceThrows = new int[2][2];
		random = new Random();
	}

	@Override
	void makePlay(int player) {
		players[player][0] = random.nextInt(6) + 1;

		if (player == super.playersCount - 1) {
			round++;
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					diceThrows[i][j] = 0;
				}
			}
			
			
			for (int i = 0; i < super.playersCount; i++) { // Käydään pelaajat läpi
				if (players[i][0] > diceThrows[0][0]) {
					diceThrows[0][0] = players[i][0];
					diceThrows[0][1] = i;
				} else if (players[i][0] == diceThrows[0][0]) {
					diceThrows[1][0] = players[i][0];
					diceThrows[1][1] = i;
				}
			}
			
			if (diceThrows[0][0] == diceThrows[1][0]) {
				System.out.println("\nNo winner on round " + round);
			} else {
				System.out.println("\nWinner of round " + round + " is player number " + (diceThrows[0][1] + 1) + " with "
						+ diceThrows[0][0]);
				players[diceThrows[0][1]][1]++; // Lisätään voitto
			}
			
		}
	}

	@Override
	boolean endOfGame() {
		for (int i = 0; i < super.playersCount; i++) {
			if (players[i][1] == 3) {
				winner = i + 1;
				return true;
			}
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("\nThe winner is player number " + winner);
	}
}