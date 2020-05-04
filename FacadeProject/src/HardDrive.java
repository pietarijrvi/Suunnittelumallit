public class HardDrive {
	
	public byte[] read(long lba, int size) {
		System.out.println("LBA: " + lba);
	     System.out.println("File size read: " + size + " KB");
	     return new byte[size];
	}
	

}
