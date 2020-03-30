public class Main {	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		DigitalClock dig = new DigitalClock(Clock.getInstance());		Thread clockThread = new Thread(Clock.getInstance());		clockThread.run();
	}
}