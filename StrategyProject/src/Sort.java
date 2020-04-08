
public class Sort {

	private int[] numbers;
	private SortingStyle style;

	public Sort(SortingStyle style, int[] numbers) {
		this.style = style;
		this.numbers = numbers;
	}

	public void setStrategy(SortingStyle style) {
		this.style = style;
	}

	public int[] sort() {
		return this.style.sort(this.numbers);
	}

}
