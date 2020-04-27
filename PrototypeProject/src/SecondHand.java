
public class SecondHand implements Cloneable {

	private int seconds;

	public SecondHand() {
		seconds = 0;
	}

	public SecondHand(int t) {
		seconds = t;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
