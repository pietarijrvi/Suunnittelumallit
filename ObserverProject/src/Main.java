
public class Main {
	@SuppressWarnings("unused")	
	public static void main(String[] args) {
		DigitalClock dig = new DigitalClock(Clock.getInstance());
		Thread clock = new Thread(Clock.getInstance());
		clock.run();
	}
}
