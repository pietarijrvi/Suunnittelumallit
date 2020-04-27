
public class HourHand implements Cloneable {

	private int hours;

	public HourHand() {
		hours = 0;
	}

	public HourHand(int h) {
		hours = h;
	}
	
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
