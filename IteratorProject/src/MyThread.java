
import java.util.Iterator;

public class MyThread extends Thread{

	Iterator<?> iterator;
	String name;

	public MyThread(Iterator<?> iterator, String name) {
			this.iterator = iterator;
			this.name = name;
		}

	public void run() {
		while (iterator.hasNext()) {
			System.out.println(name + ": " + iterator.next());
		}
	}
}
