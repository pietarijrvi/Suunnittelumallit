

public class ProxyImage implements IImage{
	private final String filename;
    private final String imageName;
    private RealImage img;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename, String imageName) {
        this.filename = filename;
        this.imageName = imageName;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (img == null) {
           img = new RealImage(filename, imageName);
        }
        img.showData();
    }

	@Override
	public void showData() {
		System.out.println("File name: "+ filename);
	}
    
    
}
