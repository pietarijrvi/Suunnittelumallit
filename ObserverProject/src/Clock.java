import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class Clock extends Observable implements Runnable {

	private static final Clock timerInstance = new Clock();

	private int seconds;
	private int minutes;
	private int hours;

	private Clock() {

	}

	public static Clock getInstance() {
		return timerInstance;
	}

	public int getSeconds() {
		return seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getHours() {
		return hours;
	}

	@Override
	public void run() {
		while (true) {
			long millis = System.currentTimeMillis();
			hours = (int) (TimeUnit.MILLISECONDS.toHours(millis) % 24);
			minutes = (int) (TimeUnit.MILLISECONDS.toMinutes(millis) % 60);
			int second = (int) (TimeUnit.MILLISECONDS.toSeconds(millis) % 60);
			if (second != seconds) {
				seconds = second;
				setChanged();
				notifyObservers();
			}			
		}
	}
}
