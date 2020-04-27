import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Clock> clocks = new ArrayList<Clock>();

		clocks.add(new Clock());
		clocks.add(clocks.get(0).clone());

		clocks.get(1).setSeconds(10);

		Runnable time = () -> {
			while (true) {
				for (Clock c : clocks) {
					c.setSeconds(c.getSeconds() + 1);
					if (c.getSeconds() == 60) {
						c.setSeconds(0);
						c.setMinutes(c.getMinutes() + 1);
						if (c.getMinutes() == 60) {
							c.setMinutes(0);
							c.setHours(c.getHours() + 1);
						}
					}
					c.printTime();
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread thread = new Thread(time);
		thread.start();
	}

}
