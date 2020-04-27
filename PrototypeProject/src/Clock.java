
public class Clock implements Cloneable {
	private HourHand hr;
	private MinuteHand min;
	private SecondHand sec;

	public Clock() {
		hr = new HourHand();
		min = new MinuteHand();
		sec = new SecondHand();
	}

	public void printTime() {
		System.out.println(hr.getHours() + ":" + min.getMinutes() + ":" + sec.getSeconds());
	}

	public void setHours(int h) {
		hr.setHours(h);
	}

	public void setMinutes(int m) {
		min.setMinutes(m);
	}

	public void setSeconds(int s) {
		sec.setSeconds(s);
	}

	public int getHours() {
		return hr.getHours();
	}

	public int getMinutes() {
		return min.getMinutes();
	}

	public int getSeconds() {
		return sec.getSeconds();
	}

	public Clock clone() {
		Clock c = null;

		try {
			c = (Clock) super.clone();
			c.hr = (HourHand) hr.clone();
			c.min = (MinuteHand) min.clone();
			c.sec = (SecondHand) sec.clone();
		} catch (CloneNotSupportedException e) {
			
		}

		return c;
	}
}
