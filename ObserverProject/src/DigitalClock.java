
import java.util.Observable;
import java.util.Observer;



public class DigitalClock implements Observer {

	private Clock timer;
	
	public DigitalClock(Clock ct) {
		this.timer = ct;
		timer.addObserver(this);
	}
	
	public void draw() {
		System.out.println("Kello tällä hetkellä: " + this.timer.getHours() + ":" + this.timer.getMinutes() + ":" +this.timer.getSeconds());
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Clock) {
			this.draw();
		}
		
	}

}
