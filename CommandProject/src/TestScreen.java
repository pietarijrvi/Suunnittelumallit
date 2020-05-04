public class TestScreen {

	public static void main(String[] args) {
		
		Screen screen = new Screen();

		Command switchUp = new ScreenUpCommand(screen);
		Command switchDown = new ScreenDownCommand(screen);

		WallButton button1 = new WallButton(switchUp);
		WallButton button2 = new WallButton(switchDown);

		button1.push();
		button2.push();
		
	}
}