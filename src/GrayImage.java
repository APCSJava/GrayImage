
public class GrayImage {

	public static final int BLACK = 0;
	public static final int WHITE = 255;
	
	/** The 2-dimensional representation of the image.
	 * Guaranteed not to be null.  All values are within
	 * the range [BLACK, WHITE], inclusive
	 */
	private int[][] pixelValues;
	
	/** @return the total number of white pixels
	 * Postcondition: this image has not been changed
	 */
	public int countWhitePixels(){
		//TODO make this method pass all tests
		return 0;
	}
	
	/**Processes this image in row-major order and decreases
	 * the value of each pixel at (row, column) by the value of
	 * the pixel at (row+2, col+2) if it exists.  Resulting
	 * values less than BLACK are set to BLACK.  Pixels for
	 * which (row+2, col+2) does not exist are unaffected.
	 */
	public void processImage() {
		//TODO make this method pass all tests
	}

	/**Constructor used to set initial fields.
	 */
	public GrayImage() {
		pixelValues = new int[0][0];
	}
	
	public int[][] getPixelValues() {
		return pixelValues;
	}

	public void setPixelValues(int[][] pixelValues) {
		this.pixelValues = pixelValues;
	}
}
