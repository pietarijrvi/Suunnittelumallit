
public class MinuteHand implements Cloneable {
	
	private int minutes;
	
	public MinuteHand() {
		minutes = 0;
	}

	public MinuteHand(int min) {
		minutes = min;
	}
	
	
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
