import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Pekka");
		list.add("Paavo");
		list.add("Pauli");
		list.add("Petri");

		ownIterators(list);
		sameIterator(list);
		addTo(list);
		removeFrom(list);
	}

	public static void ownIterators(List<String> list) {
		System.out.println("Different iterators:");

		Iterator<String> i1 = list.iterator();
		Iterator<String> i2 = list.iterator();

		MyThread mt1 = new MyThread(i1, "Thread 1");
		MyThread mt2 = new MyThread(i2, "Thread 2");

		mt1.start();
		mt2.start();

		try {
			mt1.join();
			mt2.join();
		} catch (Exception e) {

		}
	}

	public static void sameIterator(List<String> list) {
		System.out.println("\nSame iterator:");

		Iterator<String> i = list.iterator();

		MyThread mt1 = new MyThread(i, "Thread 1");
		MyThread mt2 = new MyThread(i, "Thread 2");

		mt1.start();
		mt2.start();

		try {
			mt1.join();
			mt2.join();
		} catch (Exception e) {

		}
	}

	public static void addTo(List<String> list) {
		Iterator<String> i = list.iterator();
		System.out.println("\nTrying to add to the list:");
		try {
			while (i.hasNext()) {
				String nextString = (String) i.next();
				System.out.println(nextString);
				if (nextString.equals("Paavo")) {
					list.add("Patrik");
				}
			}
		} catch (Exception e) {
			System.out.println("\nNo can do");
		}
	}

	public static void removeFrom(List<String> list) {
		Iterator<String> i = list.iterator();
		System.out.println("\nDeletion: ");
		while (i.hasNext()) {
			String nextString = (String) i.next();
			System.out.println(nextString);
			if (nextString.equals("Paavo")) {
				i.remove();
			}
		}

		System.out.println("\nDeleted?: ");
		i = list.iterator();
		while (i.hasNext()) {
			String nextString = (String) i.next();
			System.out.println(nextString);
		}
	}

}
