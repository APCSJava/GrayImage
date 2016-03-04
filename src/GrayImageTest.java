import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GrayImageTest {

	@Test
	public void testCountWhitePixels() {
		int[][] testData = {
				{255, 184, 178, 84, 129},
				{84, 255, 255, 130, 84},
				{78, 255, 0, 0, 78},
				{84, 130, 255, 130, 84}};
		GrayImage image = new GrayImage();
		image.setPixelValues(testData);
		assertEquals(5, image.countWhitePixels());
	}

	@Test
	public void testProcessImage() {
		int[][] before = {
				{221, 184, 178, 84, 135},
				{84, 255, 255, 130, 84},
				{78, 255, 0, 0, 78},
				{84, 130, 255, 130, 84}};
		int[][] after = {
				{221, 184, 100, 84, 135},
				{0, 125, 171, 130, 84},
				{78, 255, 0, 0, 78},
				{84, 130, 255, 130, 84}};
		GrayImage image = new GrayImage();
		image.setPixelValues(before);
		image.processImage();
		assertArrayEquals(after, image.getPixelValues());
	}

}
