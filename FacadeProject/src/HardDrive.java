import java.nio.charset.StandardCharsets;

public class HardDrive {

	private String data = "Some data";

	public byte[] read(long lba, int size) {
		System.out.println("LBA: " + lba);
		System.out.println("Data size read: " + size);
		return stringToByte(data);
	}

	private byte[] stringToByte(String data) {
		byte[] b = data.getBytes((StandardCharsets.UTF_8));
		return b;
	}

}
