
public class ComputerFacade {
	private final CPU processor;
	private final Memory ram;
	private final HardDrive hd;

	private static final long ADDRESS = 0;
	private static final long SECTOR = 100;
	private static final int SIZE = 1024;

	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}

	public void start() {
		processor.freeze();
		ram.load(ADDRESS, hd.read(SECTOR, SIZE));
		processor.jump(ADDRESS);
		processor.execute();
	}

}
