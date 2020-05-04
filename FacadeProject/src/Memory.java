
public class Memory {
	public void load(long position, byte[] data) {
		System.out.println("Loading from position " + position + " data: " + byteToString(data));
	}

	public String byteToString(byte[] data) {
		return new String(data);	
	}
}
