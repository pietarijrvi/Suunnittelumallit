import java.util.GregorianCalendar;
import java.util.Observable;

public class Clock extends Observable implements Runnable {

	private static final Clock timerInstance = new Clock();

	private String time;
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
			try {
				Thread.sleep(1000);
				GregorianCalendar calendario = new GregorianCalendar();
				hours = calendario.get(GregorianCalendar.HOUR_OF_DAY);
				minutes = calendario.get(GregorianCalendar.MINUTE);
				seconds = calendario.get(GregorianCalendar.SECOND);
				time += ((hours < 10) ? "0" : "") + hours + ":";
				time += ((minutes < 10) ? "0" : "") + minutes + ":";
				time += ((seconds < 10) ? "0" : "") + seconds;
				setChanged();
				notifyObservers(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
