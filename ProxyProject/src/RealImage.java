
public class RealImage implements IImage {
	private final String filename;
	private final String imageName;

	/**
	 * Constructor
	 * 
	 * @param filename
	 */
	public RealImage(String filename, String imageName) {
		this.filename = filename;
		loadImageFromDisk();
		this.imageName = imageName;
		
	}

	 /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
	
	@Override
	public void showData() {
		System.out.println("Image name: " + imageName+"\n");	
	}

	@Override
	public void displayImage() {
		 System.out.println("Displaying " + filename);
	}
}
