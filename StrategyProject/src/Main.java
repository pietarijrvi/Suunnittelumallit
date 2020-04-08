import java.util.Random;

public class Main {

	private static final int MAX = 50000;

	public static void main(String[] args) {

		int[] numbers = newArray(MAX);
		
		Sort insertionSorting = new Sort(new InsertionSort(), numbers);
		Sort selectionSorting = new Sort(new SelectionSort(), numbers);
		Sort bubbleSorting = new Sort(new BubbleSort(), numbers);
		
		long startTime = System.currentTimeMillis();
		long totalTime = System.currentTimeMillis() - startTime;

		System.out.println("\n\nInsertion Sort:");
		startTime = System.currentTimeMillis();
		insertionSorting.sort();
		totalTime = System.currentTimeMillis() - startTime;
		printArray(numbers);
		System.out.println("Time for Insertion Sort: " + totalTime + " ms");

		System.out.println("\nSelection Sort:");
		startTime = System.currentTimeMillis();
		selectionSorting.sort();
		totalTime = System.currentTimeMillis() - startTime;
		printArray(numbers);
		System.out.println("Time for Selection Sort: " + totalTime + " ms");
		
		System.out.println("\n\nBubble Sort:");
		bubbleSorting.sort();
		printArray(numbers);
		System.out.println("Time for Bubble Sort: " + totalTime + " ms");

	}
	
	public static int[] newArray(int size) {
		System.out.println("Generating numbers..");
		int[] array = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = r.nextInt(20000);
		}

		return array;
	}

	private static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
			if (i > 0 && i % 40 == 0)
				System.out.println();
		}
		System.out.println("\n");
	}
}
